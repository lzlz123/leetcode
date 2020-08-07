package saved;

public class T58 {
    static class Solution {
        public int lengthOfLastWord(String s) {
            char[] chars = s.toCharArray();
            int num = 0;
            int len = chars.length - 1;
            for (int i = chars.length - 1; i >= 0; i--) {
                if (chars[i] == ' ') {
                    len--;
                }else break;
            }
            for (int i = len; i >= 0; i--) {
                if (chars[i] != ' ') {
                    num++;
                } else return num;
            }
            return num;
        }


    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLastWord("hello world "));
    }
}
