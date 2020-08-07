package saved;

import java.util.HashMap;

public class T166 {
    static class Solution {
        public String fractionToDecimal(int numerator, int denominator) {
            StringBuffer stringBuffer = new StringBuffer();
            if (numerator < 0 ^ denominator < 0) {
                stringBuffer.append("-");
            }
            long b = numerator;
            b = Math.abs(b);
            long a = denominator;
            a = Math.abs(a);
            long x = (b / a);//整数部分
            stringBuffer.append(x);
            long y = b % a;//余数部分
            if (y == 0) {
                if (x == 0) return "0";
                return stringBuffer.toString();
            }
            //存在小数部分
            stringBuffer.append(".");
            //记录下小数出现的其实位置
            int length = stringBuffer.length();
            //创建一个hash，记录余数出现的位置
            HashMap<Long, Integer> hashMap = new HashMap<>();
            hashMap.put(y, 0);
            int i = 1;
            while (true) {
                y *= 10;
                long k = y / a;
                y = y % a;
                if (y == 0) {
                    stringBuffer.append(k);
                    return stringBuffer.toString();
                }
                if (hashMap.get(y) == null) {
                    stringBuffer.append(k);
                    hashMap.put(y, i);
                    i++;
                } else {
                    Integer integer = hashMap.get(y);//第一个i
                    stringBuffer.append(k);
                    stringBuffer.insert(length + integer, "(");
                    stringBuffer.append(")");
                    return stringBuffer.toString();
                }

            }


        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().fractionToDecimal(-2147483648, 1));
    }
}
