package saved;

public class T100 {
    class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            return a(p, q);

        }

        public boolean a(TreeNode one, TreeNode two) {
            if (one == null && two == null) return true;
            if (one == null && two != null) return false;
            if (one != null && two == null) return false;
            if (one.val == two.val) return a(one.left, two.left) && a(one.right, two.right);
            else return false;


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
