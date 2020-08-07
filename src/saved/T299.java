package saved;

import java.util.HashMap;

public class T299 {
    class Solution {
        public String getHint(String secret, String guess) {
            int[] int1 = new int[10];
            int[] int2 = new int[10];
            int sum = 0, all = 0;
            for (int i = 0; i < secret.length(); i++) {
                int i1 = secret.charAt(i) - '0';
                int i2 = guess.charAt(i) - '0';
                if (i1 == i2) sum++;
                int1[i1]++;
                int2[i2]++;
            }
            for (int i = 0; i < 10; i++) {
                all += Math.min(int1[i], int2[i]);
            }
            return sum + "A" + (all - sum) + "B";

        }
    }
}
