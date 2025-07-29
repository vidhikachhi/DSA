package Backtracking.GridWays;
//this algorithm is not good for bigger values like n or m = 10^5 therefore we have one another algo done using mathematical derivation
public class GridWays {
    static int countWays(int i,int j,int row,int col){
        //base case
        if(i==row-1&&j==col-1)
        return 1;
        else if(i==row||j==row)
        return 0;
        int count=countWays(i+1,j,row,col)+countWays(i,j+1,row,col);
        return count;
        }
        public static void main(String[] args) {
            int n=4,m=4;
            System.out.print(countWays(0,0,n,m));
        }
}
