package saved;

public class T134 {
    static class Solution {
        public int canCompleteCircuit(int[] gas, int[] cost) {
            int sum1 = 0;
            for (int i = 0; i < gas.length; i++) {
                gas[i] -= cost[i];
                sum1 += gas[i];
            }
            if (sum1 < 0) return -1;
            int sum = 0, left = 0, right = 0;
            boolean f = false;
            while (true) {
                if (right == gas.length) right = 0;
                if (right == left && f == true && sum >= 0) return left;
                if (right == left && f == true && sum <= 0) return -1;
                sum += gas[right];
                f = true;
                if (sum < 0) {
                    sum = 0;
                    left++;
                    right = left;
                    f = false;
                } else {
                    right++;
                }

            }

        }

        public static void main(String[] args) {
            System.out.println(new Solution().canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}));
        }
    }
}
