package saved;

import java.util.ArrayList;
import java.util.List;

public class T216 {
    static class Solution {
        public List<List<Integer>> combinationSum3(int k, int n) {
            ArrayList<List<Integer>> all = new ArrayList<>();
            ArrayList<Integer> integers = new ArrayList<>();
            help(k, n, 1, 0, 0, all, integers);
            return all;
        }

        void help(int k, int n, int start, int i, int sum, ArrayList<List<Integer>> all, ArrayList<Integer> integers) {
            //只有当两个i和sum都等于的时候，返回
            if (i == n) {
                if (sum == k) {
                    ArrayList<Integer> integers1 = new ArrayList<>(integers);
                    all.add(integers1);
                    return;
                } else {
                    return;
                }
            }
            for (int j = start; j <= 9; j++) {
                if (sum + start > k) return;
                integers.add(start);
                i++;
                sum = sum + start;
                start++;
                help(k, n, start, i, sum, all, integers);
                integers.remove(integers.size() - 1);
                i--;
                start--;
                sum -= start;
                start++;
            }

        }

    }

    public static void main(String[] args) {
        System.out.println(new Solution().combinationSum3(15, 3).isEmpty());
    }


}
