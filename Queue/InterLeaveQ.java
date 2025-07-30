package Queue;
import java.util.*;
public class InterLeaveQ {


static void interleave(Queue<Integer>q1){

Queue<Integer>q2=new LinkedList<>();
int size=q1.size();
for(int i=0;i<size/2;i++)
q2.add(q1.remove());

while(!q2.isEmpty()){
q1.add(q2.remove());
q1.add(q1.remove());
}
}


    public static void main(String[] args) {
        //1234567890
        //1627384950
        //this means interleave
        Queue<Integer>q1=new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(6);
        q1.add(7);
        q1.add(8);
        interleave(q1);
        while(!q1.isEmpty()){
    System.out.println(q1.peek());
    q1.remove();
}
    }
}
