package saved;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class T155 {
    class MinStack {
        private Stack<Integer> stack;
        private Stack<Integer> m_stack;
        private int min = Integer.MAX_VALUE;

        /**
         * initialize your data structure here.
         */
        public MinStack() {
            stack = new Stack<>();
            m_stack = new Stack<>();
        }

        public void push(int x) {
            min = getMin();
            if (m_stack.size() == 0) {
                min = x;
                m_stack.push(x);
                stack.push(x);
            } else {
                if (min > x) {
                    min = x;
                    stack.push(x);
                    m_stack.push(x);
                } else {
                    stack.push(x);
                    m_stack.push(min);
                }
            }
        }

        public void pop() {
            stack.pop();
            m_stack.pop();

        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            if (m_stack.size() == 0) return Integer.MAX_VALUE;
            return m_stack.peek();
        }
    }


}
