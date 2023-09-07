package stack.queue.brackets;

import java.util.Stack;

public class validateBrackets {

    Stack<Character> stack = new Stack<>();

    public boolean validBracket(String exp) {
        for (int i = 0; i < exp.length(); i++) {
            char expChar = exp.charAt(i);
            if (expChar == '{' || expChar == '[' || expChar == '(') {
                stack.push(expChar);
            } else if (expChar == '}' || expChar == ']' || expChar == ')') {
                if (stack.isEmpty() || !pairBracket(stack.pop(), expChar)) {
                    return false;
                }
            }
        }
        return stack.isEmpty(); // Check if the stack is empty after processing all characters
    }

    public boolean pairBracket(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }


}
