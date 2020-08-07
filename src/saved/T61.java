package saved;

public class T61 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */

    class Solution {
        public ListNode rotateRight(ListNode head, int k) {
            if (head == null || head.next == null || k == 0) {
                return head;
            }
            int num = 1;
            ListNode ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
                num++;
            }
            //获取实际需要移动的步数
            int step = k % num;
            //不需要移动
            if (step == 0) {
                return head;
            }
            //尾首相连
            ptr.next = head;
            return moveHelper(head, step, num);
        }

        private ListNode moveHelper(ListNode head, int step, int num) {
            int count = 0;
            ListNode temp = head;
            //找到链表需要断开的位置
            while (count < num - step - 1) {
                temp = temp.next;
                count++;
            }
            //获取结果链表的起点
            ListNode res = temp.next;
            temp.next = null;
            return res;
        }
    }

}
