package saved;

public class T83 {
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null) return head;
            if (head.next == null) return head;
            ListNode p1 = head, p2 = head.next;
            p1.next = null;
            while (p2 != null) {
                if (p1.val == p2.val) {
                    p1.next = null;
                    p2 = p2.next;
                } else {
                    p1.next = p2;
                    p1 = p2;
                    p2 = p2.next;
                }
            }
            return head;
        }
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
