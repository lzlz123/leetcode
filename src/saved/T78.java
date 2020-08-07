package saved;

import java.util.ArrayList;
import java.util.List;

public class T78 {
    static class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            ArrayList<List<Integer>> all = new ArrayList<>();
            for (int i = 0; i <= nums.length; i++) {
                ArrayList<Integer> integers = new ArrayList<>();
                back(0, all, nums, integers, i);
            }
            return all;
        }

        public void back(int first, ArrayList<List<Integer>> all, int[] nums, ArrayList<Integer> integers, int size) {
            if (integers.size() == size) {

                all.add(new ArrayList<>(integers));
                return;
            }
            for (int i = first; i < nums.length; i++) {
                integers.add(nums[i]);
                back(i + 1, all, nums, integers, size);
                integers.remove(integers.size() - 1);

            }


        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.subsets(new int[]{1, 2, 3}).size());
    }
}
