package Stack;

public class StacUsingLinkedList {

    // node class
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // stack class
    public static class Stack {
        static Node head = null;

        // is empty function
        public static boolean isEmpty() {
            return head == null;
        }

        // push function
        public static void push(int data) {
            Node newnode=new Node(data);
            if(isEmpty()){
                head=newnode;
                return;
            }
          newnode.next=head;
          head=newnode;
          return;
        }

        //pop
         public static int pop() {
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
    }

    //peek
    public static int peek() {
            if(isEmpty()){
                return -1;
            }
return head.data;
}
} 

    public static void main(String[] args) {
         Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
            System.out.println("peeking "+s.peek());
             System.out.println("popping "+s.pop());
        }
    
}
}