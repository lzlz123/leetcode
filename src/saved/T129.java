package saved;

public class T129 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public int sumNumbers(TreeNode root) {
            return help(root, 0, 0);
        }

        public int help(TreeNode root, int sum, int all) {
            if (root == null) return 0;
            if (root.left == null && root.right == null) {
                return sum * 10 + root.val + all;
            }
            if (root.left != null) {
                all = help(root.left, sum * 10 + root.val, all);
            }
            if (root.right != null) {
                all = help(root.right, sum * 10 + root.val, all);
            }
            return all;


        }
    }
}
