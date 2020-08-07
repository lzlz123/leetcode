package saved;

public class T263 {
    class Solution {
        public boolean isUgly(int num) {
            if (num == 0) return false;
            if (num == 1) return true;
            boolean a = false, b = false, c = false;
            if (num % 5 == 0) a = isUgly(num / 5);
            if (num % 3 == 0) b = isUgly(num / 3);
            if (num % 2 == 0) c = isUgly(num / 2);
            return a || b || c;
        }


    }

}
