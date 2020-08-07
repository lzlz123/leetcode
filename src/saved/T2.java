package saved;

public class T2 {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode point1 = l1;
            ListNode point2 = l2;
            ListNode before1 = null;
            before1.next = l1;
            ListNode before2 = null;
            before2.next = l2;
            ListNode before3 = null;
            int i = 0, sum = 0;
            while (point1 != null && point2 != null) {
                if (point1 == null) {
                    point1.val = 0;
                    point1.next = point1;
                }
                if (point2 == null) {
                    point2.val = 0;
                    point2.next = point2;
                }
                sum = point1.val + point2.val + i;
                if (sum >= 10) {
                    sum -= 10;
                    i = 1;
                } else {
                    i = 0;
                }
                if (point1 != null) {
                    point1.val = sum;
                } else {
                    before1.next = point2;
                    point2.val = sum;
                }
                if (point1.next == null) {
                    before1 = point1;
                }
                point1 = point1.next;
                point2 = point2.next;

            }
            if (i == 1) {

            }
            return l1;


        }


        class ListNode {
            int val;
            ListNode next;

            ListNode(int x) {
                val = x;
            }
        }
    }
}
