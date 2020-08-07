package saved;

import java.util.ArrayList;
import java.util.List;

public class T113 {
    class Solution {
        public List<List<Integer>> pathSum(TreeNode root, int sum) {
            ArrayList<List<Integer>> all = new ArrayList<>();
            return help(root, sum, 0, all, new ArrayList<Integer>());
        }

        public List<List<Integer>> help(TreeNode root, int sum, int before, ArrayList<List<Integer>> all, ArrayList<Integer> one) {
            if (root == null) return all;
            if (root.left == null && root.right == null && before + root.val == sum) {
                one.add(root.val);
                ArrayList<Integer> b = new ArrayList<>();
                for (int i = 0; i < one.size(); i++) {
                    b.add(one.get(i));
                }
                all.add(b);
                one.remove(one.size() - 1);
            }

            if (root.left != null) {
                one.add(root.val);
                help(root.left, sum, root.val + before, all, one);
                one.remove(one.size() - 1);
            }

            if (root.right != null) {
                one.add(root.val);
                help(root.right, sum, root.val + before, all, one);
                one.remove(one.size() - 1);
            }

            return all;

        }
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
