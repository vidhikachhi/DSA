package Stack;
import java.util.*;
//approach
//pop elements one by one so that the new element can be put in last
//this can be done using recursion
public class PushAtBottom {
    
static void pushAtBottom(Stack<Integer>s,int data){
    if(s.isEmpty()){
        s.push(data);
     return;
    }
     int top=s.pop();
     pushAtBottom(s, data);
     s.push(top);
}


    public static void main(String[] args) {
    Stack<Integer> s=new Stack<>();
  s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        pushAtBottom(s,5);
        while(!s.isEmpty()){
             System.out.println("popping "+s.pop());
        }
   } 
}
