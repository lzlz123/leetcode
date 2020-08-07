package saved;



import java.util.ArrayList;
import java.util.List;

public class T93 {
    class Solution {
        public List<String> restoreIpAddresses(String s) {
            ArrayList<String> all = new ArrayList<>();
            if (s.length() > 12 || s.length() < 4) return all;
            ArrayList<String> curr = new ArrayList<>();
            help(s, all, curr, 0);
            return all;
        }
        public void help(String s, ArrayList all, ArrayList curr, int first) {
            if (curr.size() == 4 && first == s.length()) {
                ArrayList<String> strings = new ArrayList<String>(curr);
                all.add(String.join(".", curr));
                return;
            }
            //用于表示   一个数字段 一定有1-3个数字
            for (int i = 1; i < 4; i++) {
                if (first + i > s.length()) break;
                String segment = s.substring(first, first + i);
                if ((segment.startsWith("0") && segment.length() > 1) || (i == 3 && Integer.parseInt(segment) > 255)) {
                    continue;
                }
                curr.add(segment);
                help(s, all, curr, first + i);
                curr.remove(curr.size() - 1);
            }
        }
    }
}
