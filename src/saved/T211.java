package saved;

import java.util.ArrayList;

public class T211 {
    static class WordDictionary {
        private ArrayList<String> list;

        /**
         * Initialize your data structure here.
         */
        public WordDictionary() {
            list = new ArrayList<>();
        }

        /**
         * Adds a word into the data structure.
         */
        public void addWord(String word) {
            list.add(word);
        }

        /**
         * Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.
         */
        public boolean search(String word) {
            boolean flag = false;
            for (String s : list) {
                if (s.length() != word.length()) continue;
                flag = true;
                for (int i = 0; i < s.length(); i++) {
                    if (word.charAt(i) == '.') continue;
                    if (word.charAt(i) != s.charAt(i)) flag = false;
                }
                if (flag == true) return true;
                flag = false;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        WordDictionary w = new WordDictionary();
        w.addWord("at");
        w.addWord("and");
        w.addWord("an");
        w.addWord("add");
        System.out.println(w.search("a"));
        System.out.println(w.search(".at"));
        w.addWord("bat");
        System.out.println(w.search(".at"));
        w.addWord("and");

    }


/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
}
/*
* ["WordDictionary","addWord","addWord","addWord","addWord","search","search","addWord","search","search","search","search","search","search"]
[[],["at"],["and"],["an"],["add"],["a"],[".at"],["bat"],[".at"],["an."],["a.d."],["b."],["a.d"],["."]]*/