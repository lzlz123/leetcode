package saved;

import java.util.ArrayList;

import java.util.Stack;

public class T173 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static class BSTIterator {
        private ArrayList<Integer> nums;
        private TreeNode root;
        private int point = 0;

        public BSTIterator(TreeNode root) {
            this.root = root;
            nums = new ArrayList();
            Stack<TreeNode> stack = new Stack<>();
            TreeNode p = root;
            //中序遍历;
            while (!stack.isEmpty() || p != null) {
                if (p != null) {
                    stack.push(p);
                    p = p.left;
                } else {
                    p = stack.pop();
                    nums.add(p.val);
                    p = p.right;
                }
            }
        }


        /**
         * @return the next smallest number
         */
        public int next() {
            return nums.get(point++);
        }

        /**
         * @return whether we have a next smallest number
         */
        public boolean hasNext() {
            if (point == nums.size() - 1) return false;
            return true;

        }
    }

    /**
     * Your BSTIterator object will be instantiated and called as such:
     * BSTIterator obj = new BSTIterator(root);
     * int param_1 = obj.next();
     * boolean param_2 = obj.hasNext();
     */
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        new BSTIterator(root);
    }
}
