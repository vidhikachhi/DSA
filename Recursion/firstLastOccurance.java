package Recursion;

public class firstLastOccurance {
//     static int first(int arr[],int n,int idx){
//         if(arr[idx]==5)
//         return idx;
//         if(idx==arr.length)
//         return -1;
//         return first(arr,n,idx+1);
//     }
    static int last(int arr[],int n,int idx){
        if(arr[idx]==5)
        return idx;
        if(idx==0)
        return -1;
        return last(arr,n,idx-1);
    }
public static void main(String[] args) {
    int arr[]={1,3,4,2,5,6,9,5,6,8,0};
    System.out.print(last(arr,5,arr.length-1));
}
}