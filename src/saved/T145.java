package saved;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class T145 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public List<Integer> postorderTraversal(TreeNode root) {
            LinkedList<Integer> integers = new LinkedList<>();
            TreeNode p = root;
            TreeNode before = null;
            Stack<TreeNode> stack = new Stack<>();
            stack.push(p);
            while (stack.isEmpty()) {
                if (p != null) {
                    stack.push(p);
                    p = p.left;
                } else {
                    p = stack.peek();
                    if (p.right == before || p.right == null) {
                        p = stack.pop();
                        integers.add(p.val);
                        before = p;
                        p = null;
                    } else {
                        before = p;
                        p = p.right;
                    }
                }
            }
            return integers;
        }
    }
}
