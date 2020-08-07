package saved;

public class T37 {
    static class Solution {
        private char[][] board;

        public void solveSudoku(char[][] board) {
            boolean[][] rowUsed = new boolean[9][10];
            boolean[][] colUsed = new boolean[9][10];
            boolean[][][] boxUsed = new boolean[3][3][10];
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (board[i][j] == '.') continue;
                    int num = board[i][j] - '0';
                    rowUsed[i][num] = true;
                    colUsed[j][num] = true;
                    boxUsed[i / 3][j / 3][num] = true;
                }
            }
            help(board, rowUsed, colUsed, boxUsed, 0, 0);


        }


        public void help(char[][] board, boolean[][] rowUsed, boolean[][] colUsed, boolean[][][] boxUsed, int row, int col) {
            if (col == 9 && row != 9) {
                help(board, rowUsed, colUsed, boxUsed, row + 1, 0);
            }
            if (row == 9) {
                throw new RuntimeException();

            }
            if (board[row][col] == '.') {
                for (int k = 0; k < 9; k++) {
                    if (rowUsed[row][k] == true || colUsed[col][k] == true || boxUsed[col / 3][col / 3][k] == true)
                        continue;
                    else {
                        board[row][col] = (char) (k + '0');//验证下
                        rowUsed[row][k] = true;
                        colUsed[col][k] = true;
                        boxUsed[row / 3][col / 3][k] = true;
                        help(board, rowUsed, colUsed, boxUsed, row, col + 1);
                        board[row][col] = '.';//验证下
                        rowUsed[row][k] = false;
                        colUsed[col][k] = false;
                        boxUsed[row / 3][col / 3][k] = false;
                    }
                }
            } else {
                help(board, rowUsed, colUsed, boxUsed, row, col + 1);
            }

        }
    }


}

