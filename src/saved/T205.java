package saved;

import java.util.HashMap;
import java.util.HashSet;

public class T205 {
    class Solution {
        public boolean isIsomorphic(String s, String t) {
            HashMap<Character, Character> words1 = new HashMap<>(26);
            HashMap<Character, Character> words2 = new HashMap<>(26);
            if (s.length() != t.length()) return false;
            for (int i = 0; i < s.length(); i++) {
                char one = s.charAt(i);
                char two = t.charAt(i);
                if (words1.containsKey(one) == false) {
                    words1.put(one, two);
                } else {
                    if (words1.get(one).equals(two) == false) return false;
                }
                if (words2.containsKey(two) == false) {
                    words1.put(two, one);
                } else {
                    if (words1.get(two).equals(one) == false) return false;
                }
            }
            return true;
        }
    }
}
