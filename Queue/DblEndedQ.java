package Queue;
import java.util.*;

public class DblEndedQ {
 //using collection framework
 public static void main(String[] args) {
    
 
 Deque<Integer>deque=new LinkedList<>();

 deque.addFirst(1);
 deque.addFirst(2);
 deque.addLast(3);
 deque.addLast(4);
 System.out.println(deque);
 deque.removeFirst();
 System.out.println(deque);
 deque.removeLast();
  deque.addFirst(5);
 deque.addFirst(6);
 deque.addLast(7);
 deque.addLast(8);
  System.out.println(deque.getFirst());
   System.out.println(deque.getLast());
   System.out.println(deque);
}
}