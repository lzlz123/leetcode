package saved;

public class T12 {
    static class Solution {
        public String intToRoman(int num) {
            int values[] = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String strs[] = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
            StringBuffer stringBuffer = new StringBuffer();
            int i = 0;
            while (num != 0) {
                int size = num / values[i];
                System.out.println(size);
                if (size == 0) num -= values[i] * size;
                else {
                    for (int j = 0; j < size; j++) {
                        stringBuffer.append(strs[i]);
                    }
                }
                num = num - size * values[i];
                i++;
            }
            return stringBuffer.toString();
        }
    }

    public static void main(String[] args) {
        new Solution().intToRoman(3);
    }
}
