package Array;
public class clockwiseRotate {
  public static void main(String[] args) {
    int arr[] = {8,1,2,0,6,5,9,4,3,7};
    int n=4;
    reverse(arr,0,n);
    reverse(arr,n+1,arr.length-1);
    reverse(arr,0,arr.length-1);
    for(int i=0;i<arr.length;i++)
    System.out.print(arr[i]+" ");
  }
public static void reverse(int arr[],int x,int y){
    int m=x,n=y;
while(m<=y/2&&n>=x/2){
    int temp=arr[m];
    arr[m]=arr[n];
    arr[n]=temp;
    m++;n--;
}
}
}