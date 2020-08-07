package saved;

public class T142 {


    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {
        public ListNode detectCycle(ListNode head) {
            ListNode fast = head;
            ListNode slow = head;
            int fast_length = 0, slow_length = 0;

            while (fast != null) {
                if (fast.next == null) return null;
                fast = fast.next.next;
                fast_length = fast_length + 2;
                slow = slow.next;
                slow_length = slow_length + 1;
                if (fast == slow) {
                    int length = (fast_length - slow_length);
                    fast = head;
                    slow = head;
                    for (int i = 0; i < length; i++) {
                        fast = fast.next;
                    }
                    while (true) {
                        if (fast == slow) return slow;
                        fast = fast.next;
                        slow = slow.next;
                    }

                }


            }
            return null;
        }
    }
}
