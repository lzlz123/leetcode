package saved;

import java.util.HashMap;

public class T290 {
    class Solution {
        public boolean wordPattern(String pattern, String str) {
            String[] s = str.split(" ");
            if (pattern.length() != s.length) return false;
            HashMap<Character, String> hash1 = new HashMap<>();
            HashMap<String, Character> hash2 = new HashMap<>();
            for (int i = 0; i < s.length; i++) {
                char c = pattern.charAt(i);
                if (hash1.containsKey(c)) {
                    String s1 = hash1.get(c);
                    if (!s1.endsWith(s[i])) return false;
                } else {
                    hash1.put(c, s[i]);
                }
                if (hash2.containsKey(s[i])) {
                    Character character = hash2.get(s[i]);
                    if (character != c) return false;

                } else {
                    hash2.put(s[i], c);
                }
            }
            return true;
        }
    }
}
