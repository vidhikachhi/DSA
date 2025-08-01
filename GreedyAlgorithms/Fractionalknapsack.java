package GreedyAlgorithms;
import java.util.*;
public class Fractionalknapsack {
    public static void main(String[] args) {
        int weight[]={10,20,30};
        int value[]={60,100,120};
        int w=50;
        double ratio[][]=new double[value.length][2];
        //colums are 0th index and 1st ratio

        for(int i=0;i<value.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=value[i]/weight[i];
        }
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));//accordin to ratio ascending order
        //but we need ratio from high to low so we do reverse loop
        int capacity=w,finalval=0;
        for(int i=ratio.length-1;i>=0;i--){
            int idx=(int)ratio[i][0];//type casting
        if(capacity>=weight[idx]){//including full item
         finalval+=value[idx];
         capacity-=weight[idx];
        }
        else{//including fractional item
            finalval+=(ratio[i][1]*capacity);
            capacity=0;
            break;
        }
        }
        System.out.println(finalval);
    }
}
