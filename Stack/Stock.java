package Stack;
import java.util.*;

//Stock span problem
//span means max no. of concecutive days for which
// (price) <= (today's price)
public class Stock {
    

    //approach 
    static void stockSpan(int stock[],int span[]){
        Stack<Integer>s=new Stack<>();
        span[0]=1;
        s.push(0);
        for(int i=1;i<stock.length;i++){
            int curr=stock[i];
            while(!s.isEmpty()&&curr>stock[s.peek()]){
                s.pop();
            }
            if(s.isEmpty())span[i]=i+1;
            else{
                int prev=s.peek();
                span[i]=i-prev;
            }
            s.push(i);
        }
    
    }

    public static void main(String[] args) {
        int stock[]={100,80,60,70,60,85,100};
        int span[]=new int [stock.length];
        stockSpan(stock, span);
for(int i=0;i<stock.length;i++){
          System.out.println(span[i]+" ");

    }
}
}
