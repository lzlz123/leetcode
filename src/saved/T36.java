package saved;

import java.util.HashMap;

public class T36 {

    static class Solution {
        public boolean isValidSudoku(char[][] board) {
            int num;

            int[][] a = new int[9][9];
            int[][] b = new int[9][9];
            int[][] c = new int[9][9];
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    num = (board[i][j] - '0')-1;
                    if (num < 0 || num > 8) continue;
                    else {

                        if (a[i][num] != 0 || b[j][num] != 0 || c[(j / 3 ) * 3 + (i / 3 + 1)][num] != 0) {
                            return false;
                        } else {
                            a[i][num] = 1;
                            b[j][num] = 1;
                            c[(j / 3 + 1) * 3 + (i / 3 + 1)][num] = 1;
                        }
                    }
                }
            }

            return true;

        }
    }

    public static void main(String[] args) {

    }
//            ["8","3",".",".","7",".",".",".","."],
//            ["6",".",".","1","9","5",".",".","."],
//            [".","9","8",".",".",".",".","6","."],
//            ["8",".",".",".","6",".",".",".","3"],
//            ["4",".",".","8",".","3",".",".","1"],
//            ["7",".",".",".","2",".",".",".","6"],
//            [".","6",".",".",".",".","2","8","."],
//            [".",".",".","4","1","9",".",".","5"],
//            [".",".",".",".","8",".",".","7","9"]]


}
