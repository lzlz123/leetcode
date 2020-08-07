package saved;

import java.util.HashMap;

public class T106 {


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    static class Solution {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        public TreeNode buildTree(int[] inorder, int[] postorder) {
            for (int i = 0; i < inorder.length; i++) {
                hashMap.put(inorder[i], i);
            }
            return build(inorder, postorder, 0, inorder.length - 1, 0, inorder.length - 1);

        }

        public TreeNode build(int[] inorder, int[] postorder, int in_left, int in_right, int post_left, int post_right) {
            if (in_left <= in_right) {
                Integer in_root = hashMap.get(postorder[post_right]);
                int left_size = in_root - in_left;
                TreeNode root = new TreeNode(postorder[post_right]);
                root.right = build(inorder, postorder, in_root + 1, in_right, post_left + left_size, post_right);
                root.left = build(inorder, postorder, in_left, in_root - 1, post_left, post_left + left_size - 1);

                return root;

            } else return null;
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.buildTree(new int[]{9, 3, 15, 20, 7}, new int[]{9, 15, 7, 20, 3});
    }


}
