package saved;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class T199 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public List<Integer> rightSideView(TreeNode root) {
            ArrayList<Integer> all = new ArrayList<>();
            TreeNode p = root;
            if (root == null) return all;
            ArrayDeque<TreeNode> queue = new ArrayDeque<>();
            queue.push(p);
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode pop = queue.pop();
                    if (i == size - 1) {
                        all.add(pop.val);
                    }
                    if (pop.left != null) queue.add(pop.left);
                    if (pop.right != null) queue.add(pop.right);

                }


            }
            return all;

        }
    }
}
