package Queue;
import java.util.*;
public class StackUsingDQ{


static class Stack{

    Deque<Integer>stack=new LinkedList<>();

    boolean isEmpty(){
return stack.isEmpty();
    }

void push(int data){
    stack.addLast(data);
}

int pop(){
    return stack.removeLast();
}

int peek(){
    return stack.getLast();
}
}

public static void main(String[] args) {
    Stack s=new Stack();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    System.out.println(s.pop());
    s.push(5);
    s.push(6);
    s.push(7);
    System.out.println(s.peek());
  
}
}