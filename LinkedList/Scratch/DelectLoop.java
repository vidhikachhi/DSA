package LinkedList.Scratch;

public class DelectLoop {
//floyd cycle detection algorithm.
//funda id we use slwo fast pointer which can never in this world can meet if if linked list is straight 
//but if cycle they will definately meet somewhere which will mark that list have loop or cycle.
  static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
static Node head;

static boolean loopCheck(){
Node slow=head;
Node fast=head;
while(fast!=null&& fast.next != null){
    slow=slow.next;
    fast=fast.next.next;
    if(slow==fast)
    return true;
}
return false;
}


    public static void main(String[] args) {

        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=head;
        System.out.println(loopCheck());
    }
}
