package saved;

public class T204 {
    static class Solution {
        public int countPrimes(int n) {
            if (n == 0 || n == 1) return 0;
            boolean[] isVisit = new boolean[n + 1];
            isVisit[0] = isVisit[1] = true;
            int k = 1, sum = 0;
            while (true) {

                for (int i = k + 1; i < n + 1; i++) {
                    if (i == n) {
                        //遍历找出所有false;
                        for (int i1 = 0; i1 < isVisit.length - 1; i1++) {
                            sum += isVisit[i1] == false ? 1 : 0;
                        }
                        return sum;
                    }
                    if (isVisit[i] == false) {
                        k = i;
                        break;
                    }
                }
                int a = k;
                for (int i = 1; a < n + 1; i++) {
                    isVisit[a] = true;
                    a += k;
                }
                isVisit[k] = false;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().countPrimes(3));
    }
}
