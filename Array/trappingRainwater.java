package Array;
public class trappingRainwater {
    public static int trap(int[] arr) {
        int len=arr.length;
        int water=0;
        int left[]=new int[len];
        left[0]=arr[0];
        for(int i=1;i<len;i++)
        left[i]=Math.max(arr[i],left[i-1]);

        int right[]=new int[len];
        right[len-1]=arr[len-1];
        for(int i=len-2;i>=0;i--)
        right[i]=Math.max(arr[i],right[i+1]);

        for(int i=0;i<len;i++)
        water=water+Math.min(left[i],right[i])-arr[i];
        return water;
    }
    public static void main(String[] args) {
        int height[]={4,1,3,5,3,1,6};
        System.out.println(trap(height));
    }
}
