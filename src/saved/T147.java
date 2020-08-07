package saved;

public class T147 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

    }


    static class Solution {
        public ListNode insertionSortList(ListNode head) {
            ListNode ok = head;
            if (head == null) return head;
            ListNode p = head.next;
            while (p != null) {
                if (p.val >= ok.val) {
                    ok = ok.next;
                    p = p.next;
                } else {
                    ListNode q = p.next;
                    ListNode a = head;
                    ListNode b = null;
                    while (a != ok) {
                        if (a.val < p.val) {
                            b = a;
                            a = a.next;
                        } else break;
                    }
                    //插在头部
                    if (b == null) {
                        ok.next = p.next;
                        p.next = head;
                        head = p;
                        p = q;
                    } else {
                        ok.next = p.next;
                        b.next = p;
                        p.next = a;
                        p = q;
                    }

                }
            }
            p = head;
            while (p != null) {
                System.out.println(p.val);
                p = p.next;
            }
            return head;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        //[-1,5,3,4,0]
        ListNode node = new ListNode(-1);//[4,2,1,3]

        ListNode node1 = new ListNode(5);//[4,2,1,3]

        ListNode node2 = new ListNode(3);//[4,2,1,3]
        ListNode node3 = new ListNode(4);//[4,2,1,3]
        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        solution.insertionSortList(node);
        System.out.println(node);


    }
}
