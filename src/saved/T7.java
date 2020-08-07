package saved;

public class T7 {
    static class Solution {
        public int reverse(int x) {

            int j = 0;
            long rNum = 0;
            while (x != 0) {
                j = x % 10;
                rNum = rNum * 10 + j;
                x = x / 10;
            }
            return (int) rNum == rNum ? (int) rNum : 0;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverse(1234567891));
    }

}
