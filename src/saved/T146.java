package saved;

import java.util.HashMap;


public class T146 {
    static class LRUCache {
        class DLinkNode {
            DLinkNode left;
            DLinkNode right;
            int key;
            int val;

            public DLinkNode() {
            }

            public DLinkNode(DLinkNode left, DLinkNode right, int key, int val) {
                this.key = key;
                this.left = left;
                this.right = right;
                this.val = val;
            }
        }

        HashMap<Integer, DLinkNode> hashMap;
        private DLinkNode first;
        private DLinkNode last;
        private int size;
        private int capacity;

        public LRUCache(int capacity) {
            this.size = 0;
            this.capacity = capacity;
            hashMap = new HashMap<>(capacity);
            first = new DLinkNode();
            last = new DLinkNode();
            first.right = last;
            last.left = first;
        }

        public int get(int key) {
            DLinkNode dLinkNode = hashMap.get(key);
            if (dLinkNode != null) {
                DLinkNode a = dLinkNode.left;
                DLinkNode b = dLinkNode.right;
                a.right = b;
                b.left = a;
                dLinkNode.right = first.right;
                dLinkNode.left = first;
                first.right.left = dLinkNode;
                first.right = dLinkNode;
                return dLinkNode.val;

            }
            return -1;
        }

        public void put(int key, int value) {
            if (capacity == 0) return;
            DLinkNode dLinkNode = hashMap.get(key);
            if (dLinkNode != null) {
                DLinkNode a = dLinkNode.left;
                DLinkNode b = dLinkNode.right;
                a.right = b;
                b.left = a;
                dLinkNode.val = value;
                dLinkNode.right = first.right;
                dLinkNode.left = first;
                first.right.left = dLinkNode;
                first.right = dLinkNode;
            } else {
                if (size == capacity) {
                    hashMap.remove(last.left.key);
                    DLinkNode a = last.left.left;
                    a.right = last;
                    last.left = a;
                    DLinkNode dLinkNode1 = new DLinkNode(first, first.right, key, value);
                    first.right.left = dLinkNode1;
                    first.right = dLinkNode1;
                    hashMap.put(key, dLinkNode1);
                } else {
                    DLinkNode dLinkNode1 = new DLinkNode(first, first.right, key, value);
                    first.right.left = dLinkNode1;
                    first.right = dLinkNode1;
                    hashMap.put(key, dLinkNode1);
                    size++;
                }


            }

        }
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(1 /* 缓存容量 */);
        cache.put(2, 1);
        System.out.println(cache.get(2));
        cache.put(3, 2);    // 该操作会使得关键字 2 作废
        System.out.println(cache.get(2));
        System.out.println(cache.get(3));


    }

    public static class T152 {
        class Solution {
            public int maxProduct(int[] nums) {
                if (nums.length == 1) return nums[0];
                int max = Integer.MIN_VALUE, imax = nums[0], imin = nums[0], right = 1;
                for (int i = 0; i < nums.length; i++) {


                }
                return max;
            }
        }

    }
}
