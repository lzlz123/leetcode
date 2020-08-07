package saved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T39 {
    static class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            Arrays.sort(candidates);
            ArrayList<List<Integer>> all = new ArrayList<>();
            ArrayList<Integer> number = new ArrayList<>();
            help(candidates, all, number, target, 0, 0);
            return all;
        }

        public void help(int[] canditates, ArrayList<List<Integer>> all, ArrayList<Integer> number, int target, int sum, int point) {
            if (sum == target) {
                ArrayList<Integer> integers = new ArrayList<Integer>(number);
                for (Integer integer : integers) {
                    System.out.println(integer);
                }
                all.add(integers);
                return;
            } else if (sum > target) return;
            else {
                for (int i = point; i < canditates.length; i++) {

                    number.add(canditates[i]);
                    sum += canditates[i];
                    help(canditates, all, number, target, sum, i);
                    sum -= canditates[i];
                    number.remove(number.size() - 1);
                }

            }

        }
    }

    public static void main(String[] args) {
        new Solution().combinationSum(new int[]{2, 3, 5}, 8);
    }
}
