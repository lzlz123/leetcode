package saved;

public class T151 {
    static class Solution {
        public String reverseWords(String s) {
            String[] s1 = s.split(" ");
            int left = 0, right = s1.length - 1;
            while (left < right) {
                if (s1[left].length() == 0) {
                    left++;
                    continue;
                }
                if (s1[right].length() == 0) {
                    right--;
                    continue;
                }
                String temp = new String(s1[left]);
                s1[left] = s1[right];
                s1[right] = temp;
                left++;
                right--;
            }
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < s1.length; i++) {
                if (s1[i].length() == 0) continue;
                if (i == s1.length - 1) {
                    stringBuffer.append(s1[i]);
                } else {
                    stringBuffer.append(s1[i] + " ");
                }
            }
            return stringBuffer.toString();


        }
    }

    public static void main(String[] args) {
        String s = "  hello world!  ";
        Solution solution = new Solution();
        solution.reverseWords(s);


    }
}
