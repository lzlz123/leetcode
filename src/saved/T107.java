package saved;

import java.util.*;

public class T107 {
    class Solution {
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            ArrayList<List<Integer>> all = new ArrayList<>();
            ArrayDeque<TreeNode> queue = new ArrayDeque<>();
            TreeNode p = root;
            if (p == null) return all;
            queue.add(p);
            while (!queue.isEmpty()) {
                int size = queue.size();
                ArrayList<Integer> integers = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    TreeNode pop = queue.poll();
                    integers.add(pop.val);
                    if (pop.left != null) queue.add(pop.left);
                    if (pop.right != null) queue.add(pop.right);
                }
                all.add(0, integers);

            }


            return all;
        }
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
