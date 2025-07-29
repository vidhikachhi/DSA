package LinkedList.DoublyLinkedList;

public class doubly {
    //this have 3 blocks in node i.e. data,next and prev

class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

static Node head;
static Node tail;
static int size=0;


//add first
void addFirst(int data){
    Node newnode =new Node(data);
    size++;
    if(head==null){
        head=tail=newnode;
        return;
    }
    newnode.next=head;
    head.prev=newnode;
    head=newnode;
 
}

//remove
int removeFirst(){
    if(head==null)
        System.out.println(Integer.MIN_VALUE);
        if(size==0){
           int val=head.data;
           head=tail=null;
           size--;
           return val; 
        }
    int val=head.data;
    head=head.next;
    head.prev=null;
    size--;
    return val;
}




//print
void print(){
    Node temp=head;
    while(temp!=null){
    System.out.print(temp.data+" - ");
    temp=temp.next;
    }
    System.out.println();
}



public static void main(String[] args) {
  doubly dll=new doubly(); 
  dll.addFirst(5);
  dll.addFirst (6);
  dll.addFirst(7);
  dll.print();
  System.out.println(size);
dll.removeFirst();
dll.print();
  System.out.println(size);
}


}
