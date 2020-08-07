package saved;

public class T240 {

    static class Solution {
        public boolean searchMatrix3(int[][] matrix, int target) {
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
                return false;
            int x = matrix[0].length - 1, y = 0;
            while (y < matrix.length && x >= 0) {
                if (matrix[y][x] < target)
                    y++;
                else if (matrix[y][x] > target)
                    x--;
                else return true;
            }
            return false;
        }
    }


    public static void main(String[] args) {
        Class<Solution> solutionClass = Solution.class;
        Solution solution = new Solution();
        solution.getClass();
    }
}
