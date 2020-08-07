package saved;

public class T104 {
    class Solution {
        public int maxDepth(TreeNode root) {
            return max(root);

        }

        public int max(TreeNode p) {
            if (p == null) return 0;
            if (p.left == null && p.right == null) return 1;
            return Math.max(max(p.left), max(p.right)) + 1;

        }
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
