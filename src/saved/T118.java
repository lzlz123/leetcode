package saved;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class T118 {

    static class Solution {
        public List<List<Integer>> generate(int numRows) {
            ArrayList<List<Integer>> all = new ArrayList<>();
            if (numRows == 0) return all;
            ArrayList<Integer> integers1 = new ArrayList<>();
            integers1.add(1);
            all.add(integers1);
            int length = 2;
            //第二行开始  i=1
            for (int i = 1; i < numRows; i++) {
                ArrayList<Integer> integers = new ArrayList<>();
                integers.add(0, 1);
                for (int j = 1; j <= length - 2; j++) {
                    integers.add(j, 0);
                }
                integers.add(length - 1, 1);
                for (int i1 = 1; i1 < length - 1; i1++) {
                    List<Integer> integers2 = all.get(i - 1);
                    integers.set(i1, integers2.get(i1 - 1) + integers2.get(i1));
                }
                all.add(integers);
                length++;

            }
            return all;
        }


    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.generate(6);
    }
}
