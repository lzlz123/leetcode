package saved;

public class T50 {
    static class Solution {
        public double myPow(double x, int n) {
            long N = n;
            return N >= 0 ? quickPow(x, N) : 1.0 / quickPow(x, -N);
        }

        public double quickPow(double x, long n) {
            if (n == 0) return 1;
            if (n % 2 == 1) {
                return quickPow(x, n / 2) * quickPow(x, n / 2) * x;
            }
            return quickPow(x, n / 2) * quickPow(x, n / 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().quickPow(0.00001,2147483647));
    }
}
