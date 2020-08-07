package saved;

public class T112 {
    class Solution {
        public boolean hasPathSum(TreeNode root, int sum) {
            if (root==null)return false;
            try {
                help(root, sum, 0);
            } catch (RuntimeException e) {
                return true;
            }
            return false;

        }

        public void help(TreeNode root, int sum, int before) {
            if (root.left == null && root.right == null && sum == before + root.val) throw new RuntimeException();
            if (root.left != null) help(root.left, sum, root.val + before);
            if (root.right != null) help(root.right, sum, root.val + before);
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
