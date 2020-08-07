package saved;


public class T91 {

    static class Solution {
        public int numDecodings(String s) {
            if (s.charAt(0) == '0') return 0;
            int left = 1, right = 1, current = 0, sum = 0;
            if (s.charAt(0) != '0') {
                right = 1;
                sum = 1;
            }
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) != '0') {
                    current += right;
                }
                if ((s.charAt(i - 1) == '1') || (s.charAt(i - 1) == '2' && s.charAt(i) <= '6')) {
                    current += left;
                }
                left=right;
                right=current;
                sum =  current;
                current = 0;
            }
            return sum;
        }


        public static void main(String[] args) {
            System.out.println(new Solution().numDecodings("122222"));
        }


    }
}
