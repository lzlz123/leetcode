package saved;

public class T24 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode swapPairs(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }

            ListNode first = head;
            ListNode head2 = head.next;
            ListNode second = head.next;
            ListNode before = new ListNode(0);
            before.next = head;
            while (second != null) {
                before.next = second;
                first.next = second.next;
                second.next = first;
                before = first;
                first = first.next;
                if (first == null) {
                    return head2;
                }
                if (first.next == null) {
                    return head2;
                }
                second = first.next;
            }
            return head2;

        }
    }
}
