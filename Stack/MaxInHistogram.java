package Stack;
import java.util.*;
public class MaxInHistogram {//O(n)+O(n)+O(n)=O(n) time com[plexity]
  public static void maxArea(int arr[]) {
    //next smaller right 
    //next snaller left
    int maxArea=0;
    int nsRight[]=new int[arr.length];
    int nsLeft[]=new int[arr.length];
    Stack<Integer>s=new Stack<>();

//for right  O(n
 for(int i=arr.length-1;i>=0;i--){
    while(!s.isEmpty()&&arr[s.peek()]>=arr[i])
    s.pop();
    if(s.isEmpty()){
        nsRight[i]=arr.length;
    }
    else nsRight[i]=s.peek();
    s.push(i);
 }

//for left
for(int i=0; i<arr.length;i++){
    while(!s.isEmpty()&&arr[s.peek()]>=arr[i])
    s.pop();
    if(s.isEmpty()){
        nsLeft[i]=-1;
    }
    else nsLeft[i]=s.peek();
    s.push(i);
 }


 //current area
for(int i=0;i<arr.length;i++){
    int height=arr[i];
    int width=nsRight[i]-nsLeft[i]-1;
    int currentArea=height*width;
    maxArea=Math.max(currentArea,maxArea);
}

System.out.println(maxArea);
  }
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        maxArea(arr);
    }

}
