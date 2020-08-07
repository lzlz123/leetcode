package saved;

import sun.security.util.Length;

public class T43 {
    class Solution {
        public String multiply(String num1, String num2) {
            int[] indicate = new int[num1.length() + num2.length()];
            for (int i = 0; i < num1.length(); i++) {
                for (int j = 0; j < num2.length(); j++) {
                    int k = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                    int sum = indicate[i + j];
                    indicate[i + j] = (sum + k) % 10;
                    indicate[i + k + 1] = (sum + k) / 10;
                }
            }

            return num1;
        }
    }
}
