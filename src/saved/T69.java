package saved;

public class T69 {
    static class Solution {
        public int mySqrt(int x) {
            long l = 0, r = x;
            while (l <= r) {
                long mid = l + (r - l) / 2;
                long result = mid * mid;
                if (result == x) return (int) mid;
                else if (result > x) r = mid - 1;
                else l = mid + 1;
            }
            return (int) l - 1;
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mySqrt(2147395599));
    }
}
