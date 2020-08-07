package saved;

public class T110 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public boolean isBalanced(TreeNode root) {
            if (root == null) return true;
            try {
                help(root);
            } catch (RuntimeException e) {
                return false;
            }

            return true;
        }

        public int help(TreeNode root) {
            if (root == null) return 0;
            if (root.left == null && root.right == null) return 1;
            int left_level = help(root.left) + 1;
            int right_level = help(root.right) + 1;
            if (left_level - right_level >= 2) throw new RuntimeException();
            if (right_level - left_level >= 2) throw new RuntimeException();
            return Math.max(left_level, right_level);

        }

    }
}
