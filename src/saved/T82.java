package saved;

public class T82 {
    static class Solution {
        //1  2  3  3  4  4   5
        public ListNode deleteDuplicates(ListNode head) {
            ListNode p1 = null, p2 = head, p3 = null;
            while (p2 != null) {
                if (p2.next == null) {
                    if (p1 == null) {
                        p1 = p2;
                        p3 = p2;
                        p2 = p2.next;
                        p1.next = null;
                        if (p2 == null) return p3;
                    } else {
                        p1.next = p2;
                        return p3;
                    }
                }
                if (p2.val == p2.next.val) {
                    int x = p2.val;
                    while (p2 != null) {
                        if (p2.val == x) {
                            p2 = p2.next;
                        } else break;
                    }
                } else {
                    if (p1 == null) {
                        p1 = p2;
                        p3 = p2;
                        p2 = p2.next;
                        p1.next = null;
                    } else {
                        p1.next = p2;
                        p1 = p2;

                        p2 = p2.next;
                        p1.next = null;
                    }
                }

            }

            return p3;
        }
    }


    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode listNode0 = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(2);
//        ListNode listNode3 = new ListNode(3);
//        ListNode listNode4 = new ListNode(4);
//        ListNode listNode5 = new ListNode(4);
//        ListNode listNode6 = new ListNode(5);
        listNode0.next = listNode1;
        listNode1.next = listNode2;
//        listNode2.next = listNode3;
//        listNode3.next = listNode4;
//        listNode4.next = listNode5;
//        listNode5.next = listNode6;
        Solution solution = new Solution();
        solution.deleteDuplicates(listNode0);


    }

}
