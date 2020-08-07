package saved;

import sun.security.util.Length;

public class T114 {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public void flatten(TreeNode root) {
            help(root);
        }

        public void help(TreeNode root) {
            if (root == null) return;
            help(root.left);
            help(root.right);
            TreeNode temp = root.right;
            root.right = root.left;
            root.left=null;
            TreeNode p = root;
            while (p.right != null) p = p.right;
            p.right = temp;

        }
    }

}
