package GreedyAlgorithms;
import java.util.*;
public class IndinaCoin {
   public static void main(String[] args) {
    Integer money[]={1,2,5,10,20,50,100,200,500,2000};
    Arrays.sort(money,Comparator.reverseOrder());
    int count=0;
    int amount=876;
    for(int i=0;i<money.length;i++){
        if(money[i]<=amount){
            while(money[i]<=amount){
             count++;
             System.out.println(money[i]);
             amount-=money[i];
             
            }
        }
    }
    System.out.println("Total coin or notes = "+count);
   } 
}
