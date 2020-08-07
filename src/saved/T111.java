package saved;

public class T111 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public int minDepth(TreeNode root) {

            return help(root, Integer.MAX_VALUE);


        }

        public int help(TreeNode root, int min_dep) {
            if (root == null) return 0;
            if ((root.left == null) && (root.right == null)) {
                return 1;
            }

            if (root.right != null) {
                min_dep = Math.min(help(root.right, min_dep), min_dep);
            }
            if (root.left != null) {
                min_dep = Math.min(help(root.left, min_dep), min_dep);
            }
            return min_dep + 1;


        }
    }
}
