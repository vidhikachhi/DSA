package Queue;

public class QFromLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Queue{
        static Node head=null;
        static Node tail=null;
    
      public static boolean isEmpty(){
        return head==null&&tail==null;
    }
    //O(1)
    public static void add(int data) {
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
        }
        
    public static int remove() {
     if(isEmpty())
     return -1;
     int rem=head.data;
     if(head==tail)
     head=tail=null;
    else
     head=head.next;
     return rem;
    }  

    public static int peek() {
      if(isEmpty())
     return -1;
     return head.data;
    } 
}

public static void main(String[] args) {
Queue q=new Queue();
q.add(1);
q.add(2);
q.add(3);
q.add(1);
q.add(2);
q.add(3);
while(!q.isEmpty()){
    System.out.println(q.peek());
    q.remove();
}

}
}

