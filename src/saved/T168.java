package saved;

public class T168 {
    static class Solution {
        public String convertToTitle(int n) {
            StringBuffer stringBuffer = new StringBuffer();

            while (n != 0) {
                n--;
                int c = n % 26;
                stringBuffer.append((char) ('A' + c));
                n = n / 26;
            }
            return stringBuffer.reverse().toString();
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().convertToTitle(27));
    }
}
