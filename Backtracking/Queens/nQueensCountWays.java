package Backtracking.Queens;

public class nQueensCountWays {
      // 3 kinds of questions
    // find all possible ways to put queens
    // find if there any solution exists
    // count all possible ways

    static boolean isSafe(char b[][], int row, int col) {
        // vertical
        for (int i = row; i >= 0; i--)
            if (b[i][col] == 'Q')
                return false;
        // left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (b[i][j] == 'Q')
                return false;
        // rigth diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < b.length; i--, j++)
            if (b[i][j] == 'Q')
                return false;
        return true;
    }

    static void nqueens(char board[][], int row) {
        if (row == board.length) {
            count++;
            return;
        }
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nqueens(board, row + 1);
                board[row][j] = 'X';
            }
        }
    }
static int count=0;
    static void printarr(char arr[][]) {
        System.out.println("-------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = 'X';
 
        nqueens(board, 0);
        System.out.print("Total no. of ways to put "+n+" Queens are "+count);
}
}