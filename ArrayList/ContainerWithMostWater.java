package ArrayList;
class ContainerWithMostWater{

    //can be implemented using arraylist
public static void main(String args[]){
     int arr[]={1,8,6,2,5,4,8,3,7};

     //brute force approach O(n^2)
// for(int i=0;i<arr.length;i++){
//     for(int j=i+1;j<arr.length;j++){
//     int height=Math.min(arr[i],arr[j]);
//     int width=j-i;
//     int water=height*width;
//     Max=Math.max(Max,water);
//     }
// }
// System.out.println(Max); 



//optimal approach O(n)
int lp=0,rp=arr.length-1,max=Integer.MIN_VALUE;
while(lp<rp){
    int h=Math.min(arr[lp],arr[rp]);
    int w=rp-lp;
    max=Math.max(max,h*w);
    if(lp<rp)lp++;
    else rp++;
}
System.out.println(max);
}
}