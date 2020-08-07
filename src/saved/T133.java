//package saved;
//
//import com.sun.xml.internal.messaging.saaj.soap.impl.HeaderImpl;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//
//public class T133 {
//
//    static class Node {
//        public int val;
//        public List<Node> neighbors;
//
//        public Node() {
//            val = 0;
//            neighbors = new ArrayList<Node>();
//        }
//
//        public Node(int _val) {
//            val = _val;
//            neighbors = new ArrayList<Node>();
//        }
//
//        public Node(int _val, ArrayList<Node> _neighbors) {
//            val = _val;
//            neighbors = _neighbors;
//        }
//    }
//
//    class Solution {
//        public Node cloneGraph(Node node) {
//            if (node == null) return node;
//            HashMap<Node, Node> visit = new HashMap<>();
//            Node clone = new Node(node.val);
//            Node node2 = clone;
//            visit.put(node, clone);
//            help(node, clone, visit);
//            return node2;
//        }
//
//        public void help(Node node, Node clone, HashMap<Node, Node> visit) {
//            for (Node neighbor : node.neighbors) {
//                if (visit.containsKey(neighbor)) {
//                    clone.neighbors.add(visit.get(neighbor));
//                } else {
//                    Node node1 = new Node(neighbor.val);
//                    clone.neighbors.add(node1);
//                    visit.put(neighbor, node1);
//                    help(neighbor, node1, visit);
//                }
//
//
//            }
//
//        }
//    }
//
//
//    public static void main(String[] args) {
//        Node node1 = new Node(1);
//        Node node2 = new Node(2);
//        Node node3 = new Node(3);
//        Node node4 = new Node(4);
//        node1.neighbors.add(node2);
//        node1.neighbors.add(node4);
//        node2.neighbors.add(node1);
//        node2.neighbors.add(node3);
//        node3.neighbors.add(node2);
//        node3.neighbors.add(node4);
//        node4.neighbors.add(node3);
//        node4.neighbors.add(node1);
//        new Solution().cloneGraph(node1);
//    }
//}
