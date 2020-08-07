package saved;

public class T235 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            TreeNode one = root, two = root, before1 = one;
            while (true) {
                if (one.val == p.val) {
                    return one;
                } else if (one.val > p.val) {
                    before1 = one;
                    one = one.left;
                } else {
                    before1 = one;
                    one = one.right;
                }
                if (two.val == q.val) {
                    return two;
                } else if (two.val > q.val) {
                    two = two.left;
                } else {
                    two = two.right;
                }
                if (one != two) return before1;

            }


        }
    }
}
