package Backtracking;

public class basic {
    static void array(int arr[],int i)
    {
        if(i==arr.length)
        return;
      arr[i]=i+1;
      array(arr, i+1);//recursion
    arr[i]=arr[i]-2;//backtracking
        }
        public static void main(String[] args) {
            int arr[]=new int [5];
            array(arr,0);
            for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
        }
}
