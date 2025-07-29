package Array;
public class majorityelement1 {
  public static void main(String[] args) {
    int arr[] = {2,5,7,5,5,3,2,2,8,1,5};
    int majority=arr[0],vote=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==majority)
        vote++;
        else vote--;
        if(vote==0){
        majority=arr[i];
        vote=1;
        }
    }
    System.out.println(majority);
}
}