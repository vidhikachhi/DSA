package LinkedList.Scratch;

public class reverse {

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
static int size=0;

//add
void add(int data){
    Node newnode = new Node(data);
    newnode.next = head;
    head = newnode;
    if(tail == null) tail = newnode;
    size++;
}


//print Linked List
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


//reverse linked list
void revList() {
    Node prev = null;
    Node curr = head;
    Node next;

    while (curr != null) {
        next = curr.next;     // store next node
        curr.next = prev;     // reverse the pointer
        prev = curr;          // move prev forward
        curr = next;          // move curr forward
    }
    // After reversal, update head and tail
    tail = head;
    head = prev;
}



public static void main(String[] args) {
        reverse ll=new reverse();
        ll.add(50);
        ll.add(40);
        ll.add(30);
        ll.add(20);
        ll.add(10);
        ll.revList();
        ll.print();
    }  
}

