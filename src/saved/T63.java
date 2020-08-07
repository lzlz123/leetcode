package saved;

public class T63 {
    class Solution {
        public int uniquePathsWithObstacles(int[][] obstacleGrid) {
            int[][] path = new int[obstacleGrid.length][obstacleGrid[0].length];
            for (int i = 0; i < obstacleGrid.length; i++) {
                if (obstacleGrid[i][0] != 1) path[i][0] = 1;
                else break;
            }
            for (int i = 0; i < obstacleGrid[0].length; i++) {
                if (obstacleGrid[0][i] != 1) path[0][i] = 1;
                else break;
            }
            for (int i = 1; i < obstacleGrid.length; i++) {
                for (int j = 1; j < obstacleGrid[0].length; j++) {
                    path[i][j] = obstacleGrid[i][j] != 1 ? path[i - 1][j] + path[i][j - 1] : 0;
                }
            }
            return path[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
        }


    }


}

