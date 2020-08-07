public class T1103 {
    class Solution {
        public int[] distributeCandies(int candies, int num_people) {
            int j = 1;
            int[] nums = new int[num_people];
            while (candies > 0) {
                for (int i = 0; i < nums.length; i++) {
                    if (candies >= j) {
                        nums[i] += j;
                        candies -= j;
                    } else {
                        nums[i] += j;
                        return nums;
                    }
                }
            }
            return nums;
        }
    }
}
