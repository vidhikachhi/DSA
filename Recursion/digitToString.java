package Recursion;

public class digitToString {

    static String DString(int n) {
        String[] str = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        if (n == 0) {
            return "";
        }
        int num = n % 10;
        // Recursive call for the remaining number
        String result = DString(n / 10);
        // Append current digit's string
        return result + str[num] + " ";
    }

    public static void main(String[] args) {
        System.out.println(DString(8120));  // Output: "one two three "
    }
}    