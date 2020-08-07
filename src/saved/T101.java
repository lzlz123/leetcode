package saved;

public class T101 {

    class Solution {
        public boolean isSymmetric(TreeNode root) {
            if (root == null) return true;
            return a(root.left, root.right);
        }

        public boolean a(TreeNode ta, TreeNode tb) {
            if (ta == null && tb == null) return true;
            if (ta == null && tb != null) return false;
            if (ta != null && tb == null) return false;
            return (ta.val == tb.val) && a(ta.left, tb.right) && a(ta.right, tb.left);

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
