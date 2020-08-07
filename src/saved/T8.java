package saved;

public class T8 {
    static class Solution {
        public int myAtoi(String str) {
            if (str.length() == 0) return 0;
            int first, flag = 2, k;
            for (first = 0; first < str.length(); first++) {
                if (str.charAt(first) != ' ') break;
            }
            k = first;
            if (first < str.length() && str.charAt(k) == '-') {
                flag = -1;
                first++;
            } else if (first < str.length() && str.charAt(k) == '+') {
                flag = 1;
                first++;
            }
            long sum = 0;
            int thisnum;
            if (first == str.length() || Character.isDigit(str.charAt(first)) == false) return 0;
            for (int i = first; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i)) == false) {
                    if (sum > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                    if (sum < Integer.MIN_VALUE) return Integer.MIN_VALUE;
                    return (int) sum;
                }
                thisnum = flag == -1 ? '0' - str.charAt(i) : str.charAt(i) - '0';

                if (sum > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                if (sum < Integer.MIN_VALUE) return Integer.MIN_VALUE;

                sum = sum * 10 + thisnum;


            }
            if (sum > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sum < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            return (int) sum;


        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().myAtoi("  -11919730356x"));
    }
}
