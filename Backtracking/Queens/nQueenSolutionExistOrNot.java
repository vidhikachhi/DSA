package Backtracking.Queens;

public class nQueenSolutionExistOrNot {
    
    static boolean isSafe(char[][] b, int row, int col) {
        // check vertical
        for (int i = 0; i < row; i++)
            if (b[i][col] == 'Q')
                return false;
        
        // check left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (b[i][j] == 'Q')
                return false;

        // check right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < b.length; i--, j++)
            if (b[i][j] == 'Q')
                return false;

        return true;
    }

    static boolean nqueens(char[][] board, int row) {
        if (row == board.length) {
            printBoard(board);
            return true; // found one valid solution
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q'; // place queen
                if (nqueens(board, row + 1)) // stop if one solution found
                    return true;
                board[row][col] = 'X'; // backtrack
            }
        }

        return false; // no valid position in this row
    }

    static void printBoard(char[][] board) {
        System.out.println("One valid solution:");
        for (char[] row : board) {
            for (char cell : row)
                System.out.print(cell + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4; // Try changing this to test different board sizes
        char[][] board = new char[n][n];

        // Initialize board with 'X'
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = 'X';

        if (!nqueens(board, 0))
            System.out.println("No solution possible.");
    }
}

