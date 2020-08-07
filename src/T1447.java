public class T1447 {
    class Solution {
        public String compressString(String S) {
            int i = 0, j = 0, num = 0, sum;
            StringBuffer stringBuffer = new StringBuffer();
            char[] chars = S.toCharArray();
            while (i < chars.length && j < chars.length) {
                if (chars[i] == chars[j]) {
                    j++;
                } else {
                    stringBuffer.append(chars[i]);
                    stringBuffer.append(j-i);
                    i = j;

                }
                if (j == chars.length) {
                    stringBuffer.append(chars[i]);
                    stringBuffer.append(j);
                    i = j;
                }
            }
            if (stringBuffer.length() < S.length()) {
                return stringBuffer.toString();
            } else return S;


        }
    }
}
