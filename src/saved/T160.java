package saved;

public class T160 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode a = headA;
            ListNode b = headB;
            int a_num = 0, b_num = 0;
            while (a != null || b != null) {
                if (a != null) {
                    a_num++;
                    a = a.next;
                }
                if (b != null) {
                    b_num++;
                    b = b.next;
                }
            }
            if (a_num > b_num) {
                a = headB;
                b = headA;
            } else {
                a = headA;
                b = headB;
            }
            int length = Math.abs(a_num - b_num);
            for (int i = 0; i < length; i++) {
                b = b.next;
            }
            while (a != b) {
                a = a.next;
                b = b.next;
            }
            return a;

        }
    }
}
