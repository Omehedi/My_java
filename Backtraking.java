/*import java.util.*;
public class Backtraking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "ABC";
        printPermutation(str, "", str.length());
    }

    public static void printPermutation(String str, String permutation, int idx) {
        if (permutation.length() == idx) {
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1);
            printPermutation(newString, permutation + currChar, idx);
        }
    }
} */


  


/*import java.util.ArrayList;
import java.util.List;

public class Backtraking {
    public boolean isSafe(int row, int col, char[][] board) {
        // Check if there is a queen in the same column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check upper right diagonal
        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public void saveBoard(char[][] board, List<List<String>> allBoards) {
        List<String> tempBoard = new ArrayList<>();
        for (char[] row : board) {
            tempBoard.add(new String(row));
        }
        allBoards.add(tempBoard);
    }

    public void helper(char[][] board, List<List<String>> allBoards, int col) {
        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoards, col + 1);
                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        for (char[] row : board) {
            java.util.Arrays.fill(row, '.');
        }
        helper(board, allBoards, 0);
        return allBoards;
    }

    public static void main(String[] args) {
        Backtraking backtracking = new Backtraking();
        List<List<String>> solutions = backtracking.solveNQueens(4); // Change the value to the desired board size
        for (List<String> solution : solutions) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}*/



