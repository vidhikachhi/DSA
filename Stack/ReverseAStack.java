package Stack;
import java.util.*;
public class ReverseAStack {


static void pushAtBottom(Stack<Integer>s,int data){
    if(s.isEmpty()){
        s.push(data);
     return;
    }
     int top=s.pop();
     pushAtBottom(s, data);
     s.push(top);
}

static void reverse(Stack<Integer> s){
    if(s.isEmpty())
     return;
     int top=s.pop();
     reverse(s);
     pushAtBottom(s,top);
}

    public static void main(String[] args) {
    Stack<Integer> s=new Stack<>();
  s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        reverse(s);
        while(!s.isEmpty()){
             System.out.println("popping "+s.pop());
        }
   } 
}
