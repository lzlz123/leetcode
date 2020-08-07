package saved;

public class T21 {


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode point1 = l1;
            ListNode point2 = l2;
            ListNode before = new ListNode(0), first = null;
            while (point1 != null && point2 != null) {
                if (point1.val > point2.val) {
                    before.next = point2;
                    before = point2;
                    if (first == null) first = point2;
                    point2 = point2.next;
                } else {

                    before.next = point1;
                    before = point1;
                    if (first == null) first = point1;
                    point1 = point1.next;
                }

            }
            if (first == null) {
                if (point1 == null) first = point2;
                else first = point1;
                return first;
            }
            if (point1 == null && point2 != null) before.next = point2;
            else before.next = point1;
            return first;
        }
    }
}
