package saved;

import java.util.Arrays;
import java.util.Comparator;

public class T179 {
    static class Solution {
        public String largestNumber(int[] nums) {
            Integer[] ints = new Integer[nums.length];
            for (int i = 0; i < nums.length; i++) {
                ints[i] = nums[i];
            }
            Arrays.sort(ints, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    int length1 = (o1 + "").length();
                    int length2 = (o2 + "").length();
                    if (length1 == length2) {
                        return -(o1 - o2);
                    }
                    return ((int) Math.pow(10, length1) * o2 + o1) - ((int) Math.pow(10, length2) * o1 + o2);

                }
            });
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < nums.length; i++) {
                sb.append(ints[i]);
            }
            String res = sb.toString();
            return res.charAt(0) == '0' ? "0" : res;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().largestNumber(new int[]{12, 121}));
    }
}
