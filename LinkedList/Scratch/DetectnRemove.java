package LinkedList.Scratch;

public class DetectnRemove {
     static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
static Node head;

static void loopCheck(){
Node slow=head;
Node fast=head;
boolean cycle=false;
while(fast!=null&& fast.next != null){
    slow=slow.next;
    fast=fast.next.next;
    if(slow==fast){
    cycle=true;
    break;
    }
}
if(cycle==false)
return;
else{
    slow=head;
    Node prev = null;
    while(slow!=fast){
    prev=fast;
    slow=slow.next;
    fast=fast.next;
    }
    prev.next=null;
}
}

static void print(){
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

        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=head.next.next;
        loopCheck();
        print();
    }
}


