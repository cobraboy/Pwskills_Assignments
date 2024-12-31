package M62_Backtracking;

public class Q5 {
    public static int countNQueens(int n) {
        return solve(new int[n], 0, n);
    }

    private static int solve(int[] board, int row, int n) {
        if (row == n) return 1;
        int count = 0;
        for (int col = 0; col < n; col++) {
            if (isValid(board, row, col)) {
                board[row] = col;
                count += solve(board, row + 1, n);
            }
        }
        return count;
    }

    private static boolean isValid(int[] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i] == col || Math.abs(board[i] - col) == Math.abs(i - row)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(countNQueens(4));
        System.out.println(countNQueens(1));
    }
}
