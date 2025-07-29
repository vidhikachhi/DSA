package Backtracking.GridWays;

//optimized way to solve by finding all permutation by its formula
//we know that n is no. of row rhich means down direction so if n=4 say we have DDDD string
//same for column meand right direction if m=4 we have RRRR string
//so in order to find no. of permutation of both strings we will use formula ((n+m)!/n!*m!)
public class GridWaysOptimized {
    static int countWays(int n, int m) {
        return fact((n - 1) + (m - 1)) / (fact(n - 1) * fact(m - 1));
    }

    // factorial
    static int fact(int n) {
        if (n == 1)
            return 1;

        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        int n = 4, m = 4;
        System.out.print(countWays(n, m));
    }
}
