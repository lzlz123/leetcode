package saved;

public class T88 {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int p = nums1.length - 1;
            n--;
            m--;
            while (n >= 0) {
                if (m == -1) {
                    m = 0;
                    nums1[m] = Integer.MIN_VALUE;
                }
                if (nums1[m] > nums2[n]) {
                    nums1[p] = nums1[m];
                    p--;
                    m--;
                } else {
                    nums1[p] = nums2[n];
                    p--;
                    n--;
                }
            }

        }
    }
}
