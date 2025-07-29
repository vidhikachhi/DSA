package Array;
public class AllzerostoEnd {
  public static void main(String[] args) {
    int arr[] = {1,0,8,0,2,0,3,0,4};
    zerostoend(arr);
  }
  public static void zerostoend(int arr[]){
    int count=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]!=0)
        arr[count++]=arr[i];
 }
 while(count<arr.length)
 arr[count++]=0;
  for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
  }
}
}