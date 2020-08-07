package saved;

public class T62 {
    static class Solution {
        public int uniquePaths(int m, int n) {
            return help(m, n, 1, 1);
        }

        public int help(int m, int n, int m_1, int n_1) {
            if (m < m_1 || n < n_1) {
                return 0;
            }
            if (m == m_1 && n_1 == n) {
                return 1;
            }
            int a = help(m, n, m_1 + 1, n_1);

            int b = help(m, n, m_1, n_1 + 1);

            return a + b;

        }

    }

    public static void main(String[] args) {
        System.out.println(new Solution().uniquePaths(19, 13));
    }
}
