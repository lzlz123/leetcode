package saved;

import java.util.Stack;

public class T98 {
    class Solution {
        public boolean isValidBST(TreeNode root) {
            Stack<TreeNode> stack = new Stack<>();
            TreeNode p = root;
            if (root == null) return false;
            boolean flag = false;
            int before = 0;
            while (p != null || !stack.isEmpty()) {
                if (p != null) {
                    stack.push(p);
                    p = p.left;
                } else {
                    p = stack.pop();
                    if (flag == false) {
                        flag = true;
                        before = p.val;
                        continue;
                    }
                    if (p.val <= before) return false;
                    before = p.val;
                    p = p.right;
                }

            }
            return true;

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
