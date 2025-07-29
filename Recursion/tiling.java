package Recursion;

public class tiling {
    public static int tilingways(int n){
        //base case
        if(n==0||n==1)return 1;
        //if vertical choice
        //if horizontal choice
        int vertical=tilingways(n-1);
        int horizontal=tilingways(n-2);
        //total ways
        return vertical+horizontal;
    }
    public static void main(String[] args) {
        System.out.println(tilingways(8));
    }
}
