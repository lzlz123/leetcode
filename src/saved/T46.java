package saved;

import java.util.ArrayList;
import java.util.List;

public class T46 {
    class Solution {
        public List<List<Integer>> permute(int[] nums) {
            ArrayList<List<Integer>> all = new ArrayList<>();
            ArrayList<Integer> integers = new ArrayList<>();
            help(nums, all, integers);
            return all;
        }

        public void help(int[] nums, ArrayList<List<Integer>> all, ArrayList<Integer> integers) {
            if (integers.size() == nums.length) {
                all.add(new ArrayList<>(integers));
                return;
            }
            for (int i = 0; i < nums.length; i++) {
                if (integers.contains(nums[i])) continue;
                else {
                    integers.add(nums[i]);
                    help(nums, all, integers);
                    integers.remove(integers.size() - 1);
                }
            }

        }
    }
}
