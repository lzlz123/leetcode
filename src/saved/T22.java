package saved;

import java.util.ArrayList;
import java.util.List;

public class T22 {
    static class Solution {
        public List<String> generateParenthesis(int n) {
            ArrayList<String> strings = new ArrayList<>();
            StringBuffer stringBuffer = new StringBuffer();
            help(strings, stringBuffer, 0, 0, n);
            return strings;
        }

        public void help(ArrayList<String> all, StringBuffer stringBuffer, int left, int right, int n) {
            if (right == n && left == n) {
                all.add(new StringBuffer(stringBuffer).toString());
                return;
            }
            if (right <= n && left <= n && left >= right) {
                stringBuffer.append("(");
                help(all, stringBuffer, left + 1, right, n);
                stringBuffer.delete(stringBuffer.length() - 1, stringBuffer.length());
            } else return;
            if (right <= n && left <= n && left >= right) {
                stringBuffer.append(")");
                help(all, stringBuffer, left, right + 1, n);
                stringBuffer.delete(stringBuffer.length() - 1, stringBuffer.length());

            } else return;

        }

    }

    public static void main(String[] args) {
        System.out.println(new Solution().generateParenthesis(2));
    }


}
