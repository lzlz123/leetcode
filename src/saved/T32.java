package saved;

import com.sun.org.apache.bcel.internal.generic.PUSH;

import java.util.LinkedList;
import java.util.Stack;

public class T32 {
    static class Solution {
        public int longestValidParentheses(String s) {
            assert s != null;
            if (s.length() < 2) {
                return 0;
            }
            Stack<Integer> stack = new Stack<>();
            int max = 0;

            stack.add(-1);

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    stack.push(i);
                } else {
                    stack.pop();
                    if (stack.isEmpty()) {
                        stack.push(i);
                    } else {
                        if (max > (i - stack.peek())) max = max;
                        else max = i - stack.peek();
                    }

                }

            }
            return max;

        }

    }

    public static void main(String[] args) {
        System.out.println("=========" + new Solution().longestValidParentheses(
                "()((())"));
    }
}
