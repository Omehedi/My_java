public class Sudoku {
    public boolean isSafe(char[][] board, int row, int col, int number) {
        char targetChar = (char) (number + '0');

        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == targetChar || board[i][col] == targetChar) {
                return false;
            }
        }

        int sr = row / 3 * 3;
        int sc = col / 3 * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == targetChar) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean helper(char[][] board, int row, int col) {
        if (row == board.length) {
            return true;
        }

        int newrow = 0;
        int newcol = 0;
        if (col != board.length - 1) {
            newrow = row;
            newcol = col + 1;
        } else {
            newrow = row + 1;
            newcol = 0;
        }

        if (board[row][col] != '.') {
            return helper(board, newrow, newcol);
        } else {
            for (int i = 1; i <= 9; i++) {
                if (isSafe(board, row, col, i)) {
                    board[row][col] = (char) (i + '0');
                    if (helper(board, newrow, newcol)) {
                        return true;
                    } else {
                        board[row][col] = '.';
                    }
                }
            }
        }
        return false;
    }

    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }
}
