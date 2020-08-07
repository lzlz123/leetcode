//package saved;
//
//public class T79 {
//    class Solution {
//        public boolean exist(char[][] board, String word) {
//            return false;
//        }
//
//        public boolean help(char[][] board, String word, int size, int w_i, int w_j) {
//            if (size == word.length()) return true;
//            if (size == 0) {
//                for (int i = w_i; i < board.length; i++) {
//                    for (int j = w_j; j < board[0].length; j++) {
//                        if (word.charAt(size) == board[i][j]) {
//                            help(board, word, size + 1, i, j);
//                        }
//                    }
//                }
//            }
//            else {
//
//            }
//
//        }
//    }
//}
