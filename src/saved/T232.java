package saved;

import java.util.Stack;

public class T232 {

    class MyQueue {
        private Stack<Integer> one;
        private Stack<Integer> two;

        /**
         * Initialize your data structure here.
         */
        public MyQueue() {
            one = new Stack();
            two = new Stack();
        }

        /**
         * Push element x to the back of queue.
         */
        public void push(int x) {
            one.push(x);
        }

        /**
         * Removes the element from in front of queue and returns that element.
         */
        public int pop() {

            while (!one.isEmpty()) {
                Integer pop = one.pop();
                two.push(pop);
            }
            Integer pop = two.pop();
            while (!two.isEmpty()) {
                Integer pop1 = two.pop();
                one.push(pop1);
            }
            return pop;

        }

        /**
         * Get the front element.
         */
        public int peek() {
            while (!one.isEmpty()) {
                Integer pop = one.pop();
                two.push(pop);
            }
            Integer pop = two.peek();
            while (!two.isEmpty()) {
                Integer pop1 = two.pop();
                one.push(pop1);
            }
            return pop;

        }

        /**
         * Returns whether the queue is empty.
         */
        public boolean empty() {
            return one.isEmpty();
        }
    }


}
