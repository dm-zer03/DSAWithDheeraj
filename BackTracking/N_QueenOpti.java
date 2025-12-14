package BackTracking;
//Print one possible solutions
//TC : O(n!)

public class N_QueenOpti {

    public static int count = 0;

    public static boolean nQueens(char[][] board, int row) {
        // Base case: if all rows are processed
        if (row == board.length) {
            // printBoard(board);
            count++;
            return true;
        }

        // Try placing a queen in each column in the current row
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                // Place Queen at (row, j)
                board[row][j] = 'Q';
                if (nQueens(board, row + 1)) {
                    // Recursive call to place queen in the next row
                    return true;
                }
                // Backtrack: remove queen from (row, j)
                board[row][j] = 'X';
            }
        }
        return false;
    }

    public static boolean isSafe(char[][] board, int row, int col) {
        // Check vertical upwards direction
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check diagonal left upwards
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check diagonal right upwards
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Safe to place queen
        return true;
    }

    public static void printBoard(char[][] board) {
        System.out.println("--- Chess Board ---");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 4; // Try different values of n (e.g. 2, 3, 4)
        char[][] board = new char[n][n];

        // Initialize the board with 'X'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }

        // Call the function to place queens
        if (nQueens(board, 0)) {
            System.out.println("Solutions is possible...");
            printBoard(board);
        } else {
            System.out.println("Solutions is not Possible ");
        }
        // System.out.println("Total no of N_Queens to Solve : " + count);
    }
}
