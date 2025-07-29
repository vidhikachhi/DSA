package LinkedList.Scratch;

public class FindNRemove {
    //asked in amazon, flipkart, etc.

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

static Node head;
static Node tail;

//add
void addNode(int data){
    Node newNode=new Node(data);
    if(head==null){
        head=tail=newNode;
        return;
    }
    newNode.next=head;
    head=newNode;
    return;
}


//print 10-20-30-40-50-null
void printList(){
    Node curr=head;
    while(curr!=null){
     System.out.print(curr.data+" --> ");
     curr=curr.next;
    }
    System.out.print("null");
}






//find and remove from nth place from end 
void findNremove(int n){
//calculate size
int size=0;
Node temp=head;
while(temp!=null){
    temp=temp.next;
    size++;
}
if(n==size){
    //remove head if only one node exists 
head=head.next;
return;
}

//to reach just before idx to remove because we have to set
//next of previous to current next 
//prev.next=curr.next it will directly point to next of current thet is to be deleted
//when we unlik the node it will be automatically deleted by garbage collector
int i=1;
int idxToFind=size-n;
Node prev=head;
while(i<idxToFind){
    prev=prev.next;
    i++;
}
prev.next=prev.next.next;
return;
}





    public static void main(String[] args) {
        FindNRemove ll=new FindNRemove();
        ll.addNode(80);
        ll.addNode(40);
        ll.addNode(90);
        ll.addNode(60);
        ll.addNode(10);
        ll.printList();
        ll.findNremove(2);
        System.out.println();
        ll.printList();
    }
}
