import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class T914 {
    class Solution {
        public boolean hasGroupsSizeX(int[] deck) {
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            int j;
            for (int i : deck) {
                if (hashMap.get(i) == null) {
                    hashMap.put(i, 1);
                } else {
                    j = hashMap.get(i);
                    hashMap.put(i, j + 1);
                }
            }
            int[] ints = new int[hashMap.size()];
            Set<Map.Entry<Integer, Integer>> entries = hashMap.entrySet();
            Iterator<Map.Entry<Integer, Integer>> iterator = entries.iterator();
            int k = 0;
            while (iterator.hasNext()) {
                Map.Entry<Integer, Integer> next = iterator.next();
                Integer value = next.getValue();
                ints[k++] = value;
            }
            int x = 0;
            for (int i = 0; i < ints.length; i++) {
                x = gcd(x, ints[i]);
                if (x == 1) {
                    return false;
                }
            }


            return true;
        }

    }

    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }


}
