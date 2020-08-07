package saved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T90 {
    static class Solution {
        public List<List<Integer>> subsetsWithDup(int[] nums) {
            ArrayList<List<Integer>> all = new ArrayList<>();
            Arrays.sort(nums);
              for (int i = 0; i < nums.length + 1; i++) {
                  help(0, all, new ArrayList(), nums, i);
            }

            return all;
        }

        public void help(int first, ArrayList<List<Integer>> all, ArrayList curr, int[] nums, int size) {
             if (curr.size() == size) {
                 ArrayList arrayList = new ArrayList<>(curr);
                 all.add(arrayList);
                return;
            }
            for (int i = first; i < nums.length; i++) {
                if (i > first && nums[i] == nums[i - 1]) continue;
                curr.add(nums[i]);
                help(i + 1, all, curr, nums, size);
                curr.remove(curr.size() - 1);
            }


        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.subsetsWithDup(new int[]{1, 2, 2}).size());
    }
}
