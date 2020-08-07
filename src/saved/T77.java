package saved;

import java.util.ArrayList;
import java.util.List;

public class T77 {
    static class Solution {
        public List<List<Integer>> combine(int n, int k) {
            ArrayList<List<Integer>> arrayList = new ArrayList<>();
            ArrayList<Integer> integers = new ArrayList<>();
            help(n, k, 1, 0, arrayList, integers);
            return arrayList;
        }

        public void help(int n, int k, int point, int state, ArrayList<List<Integer>> arrayList, ArrayList<Integer> integers) {
            if (state == k) {
                ArrayList<Integer> integers1 = new ArrayList<>(integers);
                arrayList.add(integers1);
                return;
            }
            for (int i = point; i <= n; i++) {
                integers.add(i);
                state++;
                help(n, k, i + 1, state, arrayList, integers);
                state--;
                integers.remove(integers.size() - 1);
            }

        }
    }

    public static void main(String[] args) {
        new Solution().combine(4, 2);
    }

}
