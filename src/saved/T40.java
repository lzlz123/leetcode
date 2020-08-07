package saved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T40 {
    static class Solution {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            Arrays.sort(candidates);
            ArrayList<List<Integer>> all = new ArrayList<>();
            ArrayList<Integer> numbers = new ArrayList<>();
            help(candidates, target, 0, all, numbers);
            return all;

        }

        public void help(int[] candidates, int target, int point, ArrayList<List<Integer>> all, ArrayList<Integer> numbers) {
            if (target == 0) {
                all.add(new ArrayList<>(numbers));
                return;
            } else if (target < 0) {
                return;
            } else {
                for (int i = point; i < candidates.length; i++) {
                    //以1125目标8为例
                    //第一轮  125直接加入
                    //第二轮  首先是 i=1，p=0  会直接跳过；
                    if(i > point && candidates[i] == candidates[i - 1]) continue;
                    numbers.add(candidates[i]);
                    help(candidates, target - candidates[i], i + 1, all, numbers);
                    numbers.remove(numbers.size() - 1);
                }


            }


        }
    }

    public static void main(String[] args) {
        new Solution().combinationSum2(new int[]{1,1,2,5},4);
    }
}
