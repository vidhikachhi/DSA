package Queue;
import java.util.*;
public class QueueUsingDQ{


static class Queue{

    Deque<Integer>q=new LinkedList<>();

    boolean isEmpty(){
return q.isEmpty();
    }

void add(int data){
    q.addLast(data);
}

int remove(){
    return q.removeFirst();
}

int peek(){
    return q.getFirst();
}
}

public static void main(String[] args) {
   Queue q=new Queue();
q.add(1);
q.add(2);
q.remove();
q.add(6);
q.add(7);

while(!q.isEmpty()){
    System.out.println(q.peek());
    q.remove();
}
}
}