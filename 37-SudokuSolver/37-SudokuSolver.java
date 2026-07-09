// Last updated: 09/07/2026, 15:12:53
class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    private boolean solve(char[][] board) {
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {

                if (board[r][c] == '.') {

                    for (char ch = '1'; ch <= '9'; ch++) {
                        if (isValid(board, r, c, ch)) {
                            board[r][c] = ch;

                            if (solve(board)) {
                                return true;
                            }

                            board[r][c] = '.';
                        }
                    }

                    return false; // no valid number found
                }
            }
        }
        return true;
    }

    private boolean isValid(char[][] board, int row, int col, char ch) {

        for (int i = 0; i < 9; i++) {
            if (board[row][i] == ch) return false;
            if (board[i][col] == ch) return false;
        }

        int boxRow = (row / 3) * 3;
        int boxCol = (col / 3) * 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[boxRow + i][boxCol + j] == ch) {
                    return false;
                }
            }
        }

        return true;
    }
}