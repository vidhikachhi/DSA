package GreedyAlgorithms;
import java.util.*;
public class ActivitySelection {
    public static void main(String[] args) {
      int start[]={1,3,0,5,8,5};
      int end[]={2,4,6,7,9,9};


//start
//logic for unsorted

//suppose there was unsorted activity
//end was not sort 
//therefore to do so we will make a 2 d array of 3 columns and start.length rows
int newarr[][]=new int[start.length][3];
for(int i=0;i<start.length;i++){
    newarr[i][0]=i;
    newarr[i][1]=start[i];
    newarr[i][2]=end[i];
}

//lamda function -> shoert form
Arrays.sort(newarr,Comparator.comparingDouble(o -> o[2]));
//sorting on the basis of end i.e. column 3 whose index is 2 that is why we wrote
//(o -> o[2])
//now we can use indexing of newarr

//end


      int maxAct=1;//atleast one activity will be done 
      ArrayList<Integer> ans=new ArrayList<>();
      ans.add(0);
      int lastEnd=end[0];
      for(int i=1;i<start.length;i++){
       if(start[i]>=lastEnd){
        maxAct++;
        ans.add(i);
        lastEnd=end[i];
       }
      }
    for(int i=0;i<ans.size();i++){
     System.out.println("Activity = "+ans.get(i)); 
    }
}

//O(n) only one loop for main logic 
}