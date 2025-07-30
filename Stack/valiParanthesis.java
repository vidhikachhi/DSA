package Stack;
import java.util.*;
public class valiParanthesis{

public static boolean isValid(String str){
Stack<Character> s=new Stack<>();
for(int i=0;i<str.length();i++){
    char ch=str.charAt(i);
    if(ch=='('||ch=='{'||ch=='[')//opening 
    s.push(ch);
    else{//closing
    if(s.isEmpty()) return false;
    if((s.peek()=='('&&ch==')')||(s.peek()=='{'&&ch=='}')||(s.peek()=='['&&ch==']'))
    s.pop();
    else return false;
    }
}
if(s.isEmpty())
return true;
else 
return false;
}

   public static void main(String[] args) {
    String s1="({})[]()(";
    String s2="({})[]{}";
    System.out.println(isValid(s1));
    System.out.println(isValid(s2));
   } 
}