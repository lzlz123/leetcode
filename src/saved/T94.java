package saved;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class T94 {

    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            TreeNode pt = root;
            ArrayList<Integer> integers = new ArrayList<>();
            Stack<TreeNode> tstack = new Stack<>();
            while (pt != null || !tstack.isEmpty()) {
                while (pt != null) {
                    tstack.push(pt);
                    pt = pt.left;
                }

                if (!tstack.isEmpty()) {
                    TreeNode pop = tstack.pop();
                    integers.add(pop.val);
                    pt = pt.right;
                }
            }
            return integers;

        }
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

