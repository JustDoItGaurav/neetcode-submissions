class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {

            String token = tokens[i];

            if (token.equals("+") || token.equals("-") ||
                token.equals("*") || token.equals("/")) {

                int b = stack.pop();
                int a = stack.pop();

                int y = 0;

                switch (token) {

                    case "+":
                        y = a + b;
                        break;

                    case "-":
                        y = a - b;
                        break;

                    case "*":
                        y = a * b;
                        break;

                    case "/":
                        y = a / b;
                        break;
                }

                stack.push(y);

            } else {

                int x = Integer.parseInt(token);
                stack.push(x);
            }
        }

        return stack.peek();
    }
}