import java.lang.reflect.Array;

public class Quick {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = new int[]{0, 1, 2, 2, 2, 1, 3, 6, 3, 1, 8, 2, 5, 3, 11, 4, 11, 12, 6, 2, 7, 19, 20, 16, 23, 6, 23, 4, 3, 25, 19, 15, 15, 17, 26, 30, 24, 31, 2, 26, 32, 6, 27, 21, 3, 6, 18, 46, 14, 13, 43, 19, 17, 50, 46, 40, 13, 2, 10, 43, 6, 5, 8, 23, 41, 21, 58, 10, 28, 22, 25, 63, 7, 40, 64, 50, 7, 57, 61, 43, 45, 64, 78, 50, 49, 15, 45, 10, 27, 66, 14, 68, 81, 48, 51, 33, 17, 35, 71, 31};
        solution.all(a, 0, a.length - 1, a.length - 1);
        for (int i : a) {
            System.out.println(i);
        }
    }

}

class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        all(arr, 0, arr.length - 1, k);
        int[] ints = new int[k];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = arr[i];
        }
        return ints;
    }

    public static void all(int[] arr, int left, int right, int k) {
        if (left < right) {
            int mid = Once(arr, left, right, k);
            if (mid + 1 == k) {
                return;
            } else if (mid + 1 > k) {
                all(arr, left, mid - 1, k);
            } else {
                all(arr, mid + 1, right, k);
            }
        }


    }

    public static int Once(int[] arr, int left, int right, int k) {
        int temp = arr[left];
        while (left < right) {
            while (left < right && arr[right] >= temp) {
                right--;
            }
            arr[left] = arr[right];
            while (left < right && arr[left] <= temp) {
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = temp;
        return left;

    }
}
