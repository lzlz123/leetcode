package saved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T47 {
    class Solution {
        public List<List<Integer>> permuteUnique(int[] nums) {
            ArrayList<List<Integer>> all = new ArrayList<>();
            ArrayList<Integer> integers = new ArrayList<>();
            boolean[] booleans = new boolean[nums.length];
            Arrays.sort(nums);
            help(nums, booleans, all, integers);


            return all;
        }

        public void help(int[] nums, boolean[] booleans, ArrayList<List<Integer>> all, ArrayList<Integer> integers) {
            if (integers.size() == nums.length) {
                all.add(new ArrayList<>(integers));
                return;
            }
            for (int i = 0; i < nums.length; i++) {
                if (booleans[i]) continue;
                if (i > 0 && nums[i] == nums[i - 1] && booleans[i - 1] == false) continue;
                else {
                    integers.add(nums[i]);
                    booleans[i] = true;
                    help(nums, booleans, all, integers);
                    booleans[i] = false;
                    integers.remove(integers.size() - 1);
                }
            }
        }
    }
}
