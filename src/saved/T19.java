package saved;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public class T19 {
        class Solution {
            public ListNode removeNthFromEnd(ListNode head, int n) {
                ListNode point = head;
                ListNode before;
                if (head.next == null && n == 1) {
                    return null;
                }
                for (int i = 0; i < n + 1; i++) {
                    point = point.next;
                }
                before = head;
                while (point != null) {
                    point = point.next;
                    before = before.next;
                }
                before.next = before.next.next;

                return head;
            }
        }
    }
}
