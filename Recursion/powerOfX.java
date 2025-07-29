package Recursion;

public class powerOfX {

    // brute force approach O(n)
    // public static int power(int x,int n){
    // if(n==0)
    // return 1;
    // return x*power(x,n-1);
    // }
    // optimal approach O(log n)
    public static int power(int x, int n) {
        if (n == 0)
            return 1;
        int half = power(x, n / 2) * power(x, n / 2);
        if (n % 2 != 0)
            half = half * x;
        return half;

    }

    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
}
