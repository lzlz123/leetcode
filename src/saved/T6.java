package saved;

import java.util.ArrayList;

public class T6 {
    static class Solution {
        public String convert(String s, int numRows) {
            if (numRows == 1) return s;
            ArrayList<StringBuffer> stringBuffers = new ArrayList<>();
            for (int i = 0; i < numRows; i++) {
                stringBuffers.add(new StringBuffer());
            }
            int flag = 0, row = 0;
            for (int i = 0; i < s.length(); i++) {
                stringBuffers.get(row).append(s.charAt(i));
                if (row == 0) flag = 0;
                else if (row == numRows - 1) flag = 1;
                if (flag == 0) row++;
                else row--;
            }

            for (int i = 1; i < stringBuffers.size(); i++) {
                stringBuffers.get(0).append(stringBuffers.get(i));
            }
            return stringBuffers.get(0).toString();
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().convert("PAYPALISHIRING", 3));
    }
}
