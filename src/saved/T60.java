package saved;

import java.util.Arrays;

public class T60 {
    static class Solution {
        public String getPermutation(int n, int k) {

            boolean[] booleans = new boolean[n + 1];
            StringBuffer stringBuffer = new StringBuffer(n);
            while (n != 0) {
                //第1位置的数字是
                int a = k % help(n - 1) == 0 ? k / help(n - 1) : k / help(n - 1) + 1;
                int i = 1, j = 1;
                while (true) {
                    if (booleans[j] == true) {
                        j++;
                    } else {
                        if (i == a) {
                            stringBuffer.append(j);
                            booleans[j] = true;
                            break;
                        }
                        i++;
                        j++;
                    }
                }
                k = k - (a - 1) * help(n - 1);
                n--;

            }
            return stringBuffer.toString();
        }

        public int help(int i) {
            int sum = 1;
            for (int i1 = 1; i1 <= i; i1++) {
                sum *= i1;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().getPermutation(3, 3));
    }
}
