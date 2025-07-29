package Recursion;

public class allOccurance {

    static void all(int n[],int key,int i){     
    if(i==n.length)return;
    if(n[i]==key)
    System.out.println(i);
     all(n,key,i+1);
    }
    public static void main (String args[]){
        int arr[]={6,2,4,8,2,5,2,7,4,2,9,0,2};
        int key=2;
        all(arr,key,0);
    }
}
