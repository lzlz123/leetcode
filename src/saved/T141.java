package saved;

import java.lang.management.BufferPoolMXBean;

public class T141 {


    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {
        public boolean hasCycle(ListNode head) {

            ListNode fast = head;
            ListNode slow = head;
            while (fast != null) {
                if (fast.next == null) return false;
                fast = fast.next.next;

                slow = slow.next;
                if (fast == slow) return true;

            }
            return false;
        }
    }
}
