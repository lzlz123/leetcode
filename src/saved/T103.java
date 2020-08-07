package saved;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class T103 {
    class Solution {
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> all = new ArrayList<>();
            boolean flag = true;
            TreeNode p = root;
            if (p==null)return all;
            ArrayDeque<TreeNode> queue = new ArrayDeque<>();
            queue.add(p);
            while (!queue.isEmpty()) {
                int size = queue.size();
                Integer[] ints = new Integer[2];
                ArrayList<Integer> integers = new ArrayList<>(size);
                for (int i = 0; i < size; i++) {
                    p = queue.removeFirst();
                    if (p.left != null) queue.add(p.left);
                    if (p.right != null) queue.add(p.right);
                    if (flag == true) {
                        integers.add(p.val);
                    } else {
                        integers.add(0, p.val);
                    }
                }
                all.add(integers);
                flag = flag == true ? false : true;

            }


            return all;
        }
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
