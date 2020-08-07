package saved;



import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class T102 {
    static class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            ArrayDeque<TreeNode> queue = new ArrayDeque<>();
            List<List<Integer>> all = new ArrayList<List<Integer>>();
            ArrayList<Integer> integers = null;
            TreeNode p = root;
            if (p == null) return all;
            int size;
            queue.add(p);
            while ( !queue.isEmpty()) {
                size = queue.size();
                integers = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                     p = queue.pop();
                    if (p.left != null) queue.add(p.left);
                    if (p.right != null) queue.add(p.right);
                    integers.add(p.val);
                }
                all.add(integers);
            }
            return all;

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

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.levelOrder(new TreeNode(1));
    }
}
