package saved;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class T144 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public List<Integer> preorderTraversal(TreeNode root) {
            Stack<TreeNode> stack = new Stack<>();
            LinkedList<Integer> integers = new LinkedList<>();
            TreeNode p = root;
            while (p != null || !stack.isEmpty()) {
                if (p != null) {
                    integers.add(p.val);
                    stack.push(p);
                    p = p.left;
                } else {
                    p = stack.pop();
                    p = p.right;
                }

            }
            return integers;
        }
    }
}
