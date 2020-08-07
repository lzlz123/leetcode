package saved;

public class T165 {
    static class Solution {
        public int compareVersion(String version1, String version2) {
            String[] s1 = version1.split("\\.");
            String[] s2 = version2.split("\\.");
            int a1 = 0, a2 = 0;
            while (a1 < s1.length && a2 < s2.length) {
                if (Integer.parseInt(s1[a1]) > Integer.parseInt(s2[a2])) return 1;
                else if (Integer.parseInt(s1[a1]) < Integer.parseInt(s2[a2])) return -1;
                else {
                    a1++;
                    a2++;
                }
            }
            if (a1 == s1.length) {
                for (int i = a2; i < s2.length; i++) {
                    if (Integer.parseInt(s2[a2]) != 0) return -1;
                }
            } else if (a2 == s2.length) {
                for (int i = a1; i < s1.length; i++) {
                    if (Integer.parseInt(s1[a1]) != 0) return 1;
                }

            }
            return 0;
        }
    }

    public static void main(String[] args) {
        new Solution().compareVersion("1.0.1", "1 ");
    }
}
