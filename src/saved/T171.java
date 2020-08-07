package saved;

public class T171 {
    static class Solution {
        public int titleToNumber(String s) {
            int num = 0;
            for (int i = 0; i < s.length(); i++) {
                num = num * 26 + 1 + (int) s.charAt(i) - 'A';
            }
            return num;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().titleToNumber("Z"));
    }
}
