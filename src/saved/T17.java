package saved;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class T17 {
    static class Solution {
        public List<String> letterCombinations(String digits) {
            HashMap<String, String> phone = new HashMap<String, String>() {{
                put("2", "abc");
                put("3", "def");
                put("4", "ghi");
                put("5", "jkl");
                put("6", "mno");
                put("7", "pqrs");
                put("8", "tuv");
                put("9", "wxyz");
            }};
            ArrayList<String> all = new ArrayList<>();
            if (digits.length() == 0) return all;
            StringBuffer stringBuffer = new StringBuffer();
            help(phone, all, digits, 0, stringBuffer);
            return all;
        }

        public void help(HashMap<String, String> phone, ArrayList<String> all, String digits, int first, StringBuffer stringBuffer) {
            if (first == digits.length()) {
                all.add(new StringBuffer(stringBuffer).toString());
                return;
            }
            String s = phone.get(digits.charAt(first) + "");
            for (int i = 0; i < s.length(); i++) {
                stringBuffer.append(s.charAt(i) + "");
                help(phone, all, digits, first + 1, stringBuffer);
                stringBuffer.delete(stringBuffer.length() - 1, stringBuffer.length());
            }
        }

    }

    public static void main(String[] args) {
        new Solution().letterCombinations("23");
    }
}
