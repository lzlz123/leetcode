package saved;


import java.util.*;

public class T49 {
    static class Solution {


        public List<List<String>> groupAnagrams(String[] strs) {
            ArrayList<List<String>> all = new ArrayList<>();
            boolean[] booleans = new boolean[strs.length];
            int left = 0, right = 1;

            while (left < strs.length) {
                if (booleans[left] == false) {
                    ArrayList<String> strings = new ArrayList<>();
                    booleans[left] = true;
                    strings.add(strs[left]);
                    while (right < strs.length) {
                        if (booleans[right] == false) {
                            boolean judge = judge(strs[left], strs[right]);
                            if (judge == true) {
                                strings.add(strs[right]);
                                booleans[right] = true;
                            }
                            right++;
                        } else right++;
                    }
                    all.add(strings);
                    left++;
                    right = 0;
                } else left++;
            }
            return all;
        }

        private boolean judge(String string1, String string2) {
            Map<Character, Integer> hash = new HashMap<>();
            //记录第一个字符串每个字符出现的次数，进行累加
            for (int i = 0; i < string1.length(); i++) {
                if (hash.containsKey(string1.charAt(i))) {
                    hash.put(string1.charAt(i), hash.get(string1.charAt(i)) + 1);
                } else {
                    hash.put(string1.charAt(i), 1);
                }
            }
            //记录第一个字符串每个字符出现的次数，将之前的每次减 1
            for (int i = 0; i < string2.length(); i++) {
                if (hash.containsKey(string2.charAt(i))) {
                    hash.put(string2.charAt(i), hash.get(string2.charAt(i)) - 1);
                } else {
                    return false;
                }
            }
            //判断每个字符的次数是不是 0 ，不是的话直接返回 false
            Set<Character> set = hash.keySet();
            for (char c : set) {
                if (hash.get(c) != 0) {
                    return false;
                }
            }
            return true;
        }


    }

    public static void main(String[] args) {
        System.out.println(new Solution().groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}).size());
    }
}
