package saved;

import java.util.HashMap;

public class T138 {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }


    class Solution {
        public Node copyRandomList(Node head) {
            HashMap<Node, Node> hashMap = new HashMap<>();
            Node create = new Node(0);
            Node b = create, p = head;
            while (p != null) {
                if (hashMap.containsKey(p)) {
                    create.next = hashMap.get(p);
                } else {
                    Node node = new Node(p.val);
                    create.next = node;
                    hashMap.put(p, node);
                }
                if (p.random != null) {
                    if (hashMap.containsKey(p.random)) {
                        create.next.random = hashMap.get(p.random);
                    } else {
                        Node node = new Node(p.random.val);
                        create.next.random = node;
                        hashMap.put(p.random, node);
                    }
                }
                p = p.next;
                create = create.next;
            }
            return b.next;
        }


    }


}
