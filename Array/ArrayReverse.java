package Array;
public class ArrayReverse {
  public static void main(String[] args) {
    int arr[] = {8,1,2,0,6,5,9,4,3,7};
   reverse(arr);
  }
public static void reverse(int arr[]){
int m=0,n=arr.length-1,mid=arr.length/2;
while(m<=mid && n>=mid){
    int temp=arr[m];
    arr[m]=arr[n];
    arr[n]=temp;
    m++;n--;
}
 for(int i=0;i<arr.length;i++)
    System.out.print(arr[i]+" ");
}
}