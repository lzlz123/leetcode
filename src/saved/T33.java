package saved;

public class T33 {
    static class Solution {
        public int search(int[] nums, int target) {
            int mid, left = 0, right = nums.length - 1;
            while (left <= right) {
                mid = (right - left) / 2 + left;
                if (nums[mid] == target) return mid;
                //mid在做半段
                if (nums[mid] > nums[left]) {
                    //在第一段中
                    if (target >= nums[left] && target <= nums[mid]) {
                        right = mid - 1;
                        //证明不在第一段中
                    } else left = mid + 1;
                    //mid在右半段
                } else {
                    //在第四段中
                    if (target > nums[mid] && target <= nums[right]) {
                        left = mid + 1;
                    } else
                        right = mid - 1;


                }

            }
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().search(new int[]{
                4, 5, 6, 7, 0, 1, 2}, 0));
    }
}
