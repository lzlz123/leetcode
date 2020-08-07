public class T66 {
    static class Solution {
        public int[] plusOne(int[] digits) {
            int i = digits.length - 1;

            int num = 0;
            while (i >= 0) {
                if (digits[i] == 9) {
                    num++;
                } else {
                    break;
                }
                i--;
            }

            i = digits.length - 1;
            for (int k = 1; k <= num; k++) {
                digits[i] = 0;
                i--;
            }
            if (num == digits.length) {
                int[] a = new int[digits.length + 1];
                a[0] = 1;
                for (int i1 = 1; i1 < a.length; i1++) {
                    a[i1] = digits[i1 - 1];
                }
                return a;
            } else {
                digits[digits.length - num - 1]++;
                return digits;
            }


        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.plusOne(new int[]{9}).toString());
    }
}
