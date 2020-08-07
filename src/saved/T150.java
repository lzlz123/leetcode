package saved;

public class T150 {
    class Solution {
        public int evalRPN(String[] tokens) {
            int[] ints = new int[tokens.length / 2 + 1];
            int index = 0;
            for (int i = 0; i < tokens.length; i++) {
                switch (tokens[i]) {

                    case "+":
                        ints[index - 2] += ints[--index];
                        break;
                    case "-":
                        ints[index - 2] -= ints[--index];
                        break;
                    case "*":
                        ints[index - 2] *= ints[--index];
                        break;
                    case "/":
                        ints[index - 2] /= ints[--index];
                        break;
                    default:
                        // numStack[index++] = Integer.valueOf(s);
                        //valueOf改为parseInt，减少自动拆箱装箱操作
                        ints[index++] = Integer.parseInt(tokens[i]);
                        break;
                }


            }
            return ints[index - 1];
        }
    }
}
