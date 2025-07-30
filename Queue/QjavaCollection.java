package Queue;
import java.util.*;
public class QjavaCollection {
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        Queue<Integer>q1=new ArrayDeque<>();
//Queues are internally implemented as linked list in java
//therefore in declaration we write liked list 
//however we can also use ArrayDeque class
//ArrayDeque 


        q.add(5);
        q.add(6);
        q.add(7);
        while(!q.isEmpty()){
    System.out.println(q.peek());
    q.remove();
}



q1.add(5);
        q1.add(6);
        q1.add(7);
        while(!q1.isEmpty()){
    System.out.println(q1.peek());
    q1.remove();
}
    }
}
