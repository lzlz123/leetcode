package saved;

public class T5 {
    static class Solution {
        public String longestPalindrome(String s) {
            char[] chars = s.toCharArray();
            if (chars.length==0)return "";
            if (chars.length==1)return s;
            int center = 0, left, right, longest = 0, length = 0, sleft = 0, sright = 0;
            boolean flag1 = true;
            while (center < chars.length) {
                left = center;
                right = center;

                if (flag1 == true) {
                    while (true) {
                        left--;
                        right++;
                        if (left >= 0 && right < chars.length) {
                            if (chars[left] == chars[right]) {
                                length = right - center + 2;
                                if (length > longest) {
                                    sleft = left;
                                    sright = right;
                                    longest = length;
                                }
                            } else {

                                break;
                            }
                        } else break;
                    }
                    flag1 = false;
                }
                if (flag1 == false) {
                    left = center;
                    right = center + 1;
                    while (true) {
                        if (left >= 0 && right < chars.length) {
                            if (chars[left] == chars[right]) {
                                length = right - center + 1;
                                if (length > longest) {
                                    sleft = left;
                                    sright = right;
                                    longest = length;
                                }
                                left--;
                                right++;

                            } else {

                                break;
                            }
                        } else break;
                    }

                }
                flag1 = true;
                center++;

            }
            System.out.println(sleft);
            System.out.println(sright);
            return s.substring(sleft, sright + 1);
        }


    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome("cbbd"));
    }
}

