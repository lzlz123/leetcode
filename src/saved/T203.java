package saved;

public class T203 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            ListNode a = new ListNode(0);
            ListNode b = a;
            a.next = null;
            ListNode point = head;
            while (point != null) {
                if (point.val != val) {
                    a.next = point;
                    point = point.next;
                    a = a.next;
                    a.next = null;
                } else {
                    point = point.next;
                }
            }
            return b.next;
        }

    }
}
