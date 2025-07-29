package Array;
public class secondlargest {
  public static void main(String[] args) {
    int arr[] = {8,1,2,0,6,5,9,4,3,7};
    int max=0,smax=0;
    for(int i=0;i<arr.length;i++){
    if(arr[i]>max){
        smax=max;
        max=arr[i];
    }
    if(arr[i]>smax&&arr[i]!=max)
    smax=arr[i];
}
System.out.println(smax);
}
}