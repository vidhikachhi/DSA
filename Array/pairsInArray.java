package Array;
public class pairsInArray {
  public static void main(String[] args) {
    int arr[] = {8,1,2,0,6,5,9,4,3,7};
    for(int i=0;i<arr.length;i++){
     for(int j=i+1;j<arr.length;j++)
     System.out.print("("+arr[i]+","+arr[j]+")");
     System.out.println();
    }
}
}