package saved;

public class T108 {
    class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            if (nums == null) return null;
            return help(nums, 0, nums.length - 1);
        }

        public TreeNode help(int[] nums, int left, int right) {
            if (left <= right) {
                int mid = (left + right + 1) / 2;
                TreeNode root = new TreeNode(nums[mid]);
                root.left = help(nums, left, mid - 1);
                root.right = help(nums, mid + 1, right);
                return root;

            }
            return null;

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
