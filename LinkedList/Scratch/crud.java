package LinkedList.Scratch;

public class crud {


    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }


    //declaring head and tail;
public static Node head;
public static Node tail;
public static int size=0;


//add in first place 
    void addFirst(int data){
    Node newnode=new Node(data);
    size++;
    //if list is empty i.e. 0 nodes
    if(head==null){
        head=tail=newnode;
        return;
    }
    //else
    newnode.next=head;
    head=newnode;
    }


//add in last place
void addLast(int data){
    Node newnode=new Node(data);
    if(head==null){
        head=tail=newnode;
        return;
    }
    tail.next=newnode;
    tail=newnode;
    size++;
    }


//Add in the middle 
void addInMiddle(int data,int idx){
    if(idx==0){
        addFirst(data);
        return;
    }
      Node newnode=new Node(data);
      Node temp=head;
      int i=0;
      while(i<idx-1){
        temp=temp.next;
        i++;
      }
      newnode.next=temp.next;
      temp.next=newnode;
      size++;
}

//remove first
void removeFirst(){
if(size==0)System.out.println("list empty");
else if(size==1)
    head=tail=null;
else 
    head=head.next;
size--;
}


//remove last
void removeLast(){
if(size==0)
System.out.println("list empty");
else if(size==1)
    head=tail=null;
else 
{
    Node prev=head;
    for(int i=0;i<size-2;i++)
        prev=prev.next;
   prev.next=null;
        tail=prev; 
}
 size--;
}


//remove middle
void removeMid(int idx){

}

void print(){
    if(head == null){
        System.out.println("Empty");
        return;  // add return to avoid continuing
    }
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }
    System.out.println("null");  // shows end of list
}



public static void main(String[] args) {
       crud ll=new crud();
       ll.addFirst(50);
       ll.addFirst(40);
       ll.addLast(70);
       ll.addLast(80);
       ll.print();
       ll.addInMiddle(60,2);
       ll.print();
       ll.removeFirst();
       System.out.println(crud.size);
       ll.print();
       ll.removeLast();
       ll.print();
}
}
