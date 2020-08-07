package saved;

public class T415 {
    static class Solution {
        public String addStrings(String num1, String num2) {
            int a = num1.length() - 1, b = num2.length() - 1, up = 0;
            StringBuffer stringBuffer = new StringBuffer();
            while (a >= 0 || b >= 0) {
                int i = a >= 0 ? num1.charAt(a) - '0' : 0;
                int j = b >= 0 ? num2.charAt(b) - '0' : 0;
                int sum = i + j + up;
                if (sum >= 10) {
                    sum = sum - 10;
                    up = 1;
                } else up = 0;
                stringBuffer.append(sum);
                a--;
                b--;

            }
            if (up == 1) stringBuffer.append(1);
            return stringBuffer.reverse().toString();
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.addStrings("0", "9"));
    }
}
