package saved;

import java.util.List;

public class T139 {
    class Solution {
        public boolean wordBreak(String s, List<String> wordDict) {
            return help(s, wordDict, 0);
        }

        public boolean help(String s, List<String> wordDict, int length) {
            if (s.length() == length) return true;

            for (int i = 0; i < wordDict.size(); i++) {
                String s1 = wordDict.get(i);
                boolean helpmap = helpmap(s, s1, length);
                if (helpmap) {
                    if (help(s, wordDict, length + s1.length())) return true;
                }
            }

            /*
            "cars"
["car","ca","rs"]*/
            return false;
        }

        public boolean helpmap(String s, String s2, int i) {
            for (int i1 = 0; i1 < s2.length(); i1++) {
                if (s.length() < i + i1 || s.charAt(i + i1) != s2.charAt(i1)) return false;
            }
            return true;
        }
    }
}
