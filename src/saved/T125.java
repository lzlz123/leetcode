package saved;

public class T125 {
    class Solution {
        public boolean isPalindrome(String s) {
            char[] chars = s.toCharArray();

            int left = 0, right = chars.length - 1;
            while (left <= right) {
                while (left <= right && !Character.isLetterOrDigit(chars[left])) left++;
                while (left <= right && !Character.isLetterOrDigit(chars[right])) right++;
                if ((int) Character.toLowerCase(chars[left]) != (int) Character.toLowerCase(chars[right])) {
                    return false;
                } else {
                    right--;
                    left++;
                }

            }
            return true;
        }
    }
}
