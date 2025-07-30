package Queue;
import java.util.*;
//2 variants 
//push O(n) the current we are solving
//pop O(n)   H.W.
public class QUsing2Stacks {
    static class Queue{
        Stack<Integer>s1=new Stack<>();
        Stack<Integer>s2=new Stack<>();

         boolean isEmpty(){
            return s1.isEmpty();
        } 

        void add(int data){
            if(isEmpty()){
            s1.push(data);
            return;
            }
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        int remove(){
             if (isEmpty()) {
        System.out.println("Queue is empty");
        return -1;
    }
            return s1.pop();
        }

        int peek(){
             if (isEmpty()) {
        System.out.println("Queue is empty");
        return -1;
    }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        Queue q=new Queue();
    
q.add(1);
q.add(2);
q.add(3);
q.remove();
q.add(4);
while(!q.isEmpty()){
    System.out.println(q.peek());
    q.remove();
}
    }
}
