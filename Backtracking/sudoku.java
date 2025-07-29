package Backtracking;

public class sudoku {

    static boolean isCorrect(int sudoku[][], int i, int j, int digit) {
    for (int v = 0; v < 9; v++)
        if (sudoku[v][j] == digit || sudoku[i][v] == digit)
            return false;

    int p = (i / 3) * 3;
    int q = (j / 3) * 3;

    for (int P = p; P < p + 3; P++) {
        for (int Q = q; Q < q + 3; Q++) {
            if (sudoku[P][Q] == digit)
                return false;
        }
    }
    return true;
}

static boolean sudokuSolver(int sudoku[][], int i, int j) {
    if (i == 9)
        return true;

    int nxtrow = i, nxtcol = j + 1;
    if (nxtcol == 9) {
        nxtrow = i + 1;
        nxtcol = 0;
    }

    if (sudoku[i][j] != 0)
        return sudokuSolver(sudoku, nxtrow, nxtcol);

    for (int digit = 1; digit <= 9; digit++) {
        if (isCorrect(sudoku, i, j, digit)) {
            sudoku[i][j] = digit;
            if (sudokuSolver(sudoku, nxtrow, nxtcol))
                return true;
            sudoku[i][j] = 0; // backtrack
        }
    }

    return false;
}

    static void printarr(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
       int[][] sudoku = {
    {5, 3, 0, 0, 7, 0, 0, 0, 0},
    {6, 0, 0, 1, 9, 5, 0, 0, 0},
    {0, 9, 8, 0, 0, 0, 0, 6, 0},
    {8, 0, 0, 0, 6, 0, 0, 0, 3},
    {4, 0, 0, 8, 0, 3, 0, 0, 1},
    {7, 0, 0, 0, 2, 0, 0, 0, 6},
    {0, 6, 0, 0, 0, 0, 2, 8, 0},
    {0, 0, 0, 4, 1, 9, 0, 0, 5},
    {0, 0, 0, 0, 8, 0, 0, 7, 9}
};

        sudokuSolver(sudoku, 0, 0);
        printarr(sudoku);
    }
}
