package saved;

public class T202 {
    static class Solution {
        public boolean isHappy(int n) {
            int left = n, right = n;
            while (right != 1) {
                left = help(left);
                if (left == 1) return true;
                right = help(right);
                right = help(right);
                if (left == right) return false;
            }
            return true;
        }

        public int help(int n) {
            int sum = 0, k;
            while (n != 0) {
                k = n % 10;
                n = n / 10;
                sum += k * k;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isHappy(19));
    }
}
