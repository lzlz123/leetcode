package saved;

import java.util.ArrayDeque;

public class T115 {

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }


    class Solution {
        public Node connect(Node root) {
            ArrayDeque<Node> nodes = new ArrayDeque<>();
            Node p = root;
            if (p == null) return root;
            nodes.addFirst(p);
            while (!nodes.isEmpty()) {
                int size = nodes.size();
                for (int i = 0; i < size; i++) {
                    Node pop = nodes.pop();
                    if (i == size - 1) pop.next = null;
                    else pop.next = nodes.peek();
                    if (pop.left != null) nodes.add(pop.left);
                    if (pop.right != null) nodes.add(pop.right);
                }
            }
            return root;
        }
    }
}
