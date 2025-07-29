package LinkedList.DoublyLinkedList;

public class reverseDLL {

    
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


//print
void print(){
    Node temp=head;
    while(temp!=null){
    System.out.print(temp.data+" - ");
    temp=temp.next;
    }
    System.out.println();
}

    //reverse linked list
void revList() {
    Node prev = null;
    Node curr = head;
    Node next;

    while (curr != null) {
        next = curr.next;     // store next node
        curr.next = prev;     // reverse the pointer

        curr.prev=next;       //adding this line for ddl

        prev = curr;          // move prev forward
        curr = next;          // move curr forward
    }
    head = prev;
}



public static void main(String[] args) {
      reverseDLL dll=new reverseDLL(); 
  dll.addFirst(5);
  dll.addFirst (6);
  dll.addFirst(7);
  dll.print();
  System.out.println(size);
dll.revList();
dll.print();
}

}

