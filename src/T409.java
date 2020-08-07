public class T409 {
    class Solution {
        public int longestPalindrome(String s) {
            char[] chars = s.toCharArray();
            int j = 0, sum = 0;
            int[] ints = new int[26 * 2];
            for (char aChar : chars) {
                if (65 <= (int) aChar && (int) aChar <= 90) {
                    j = (int) aChar - 65;
                } else {
                    j = (int) aChar - 71;
                }
                ints[j]++;
            }
            for (int i = 0; i < ints.length; i++) {
                sum += ints[i] / 2;
            }
            sum *= 2;
            if (sum == chars.length) {
                return sum;
            } else
                return sum++;
        }
    }

}
