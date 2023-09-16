package challenge14;

import java.util.LinkedList;

public class GetMax {

    private LinkedList<Integer> stack = new LinkedList<>();
    private LinkedList<Integer> maxStack = new LinkedList<>();

    public void push(int value) {
        int max = value;
        if (!maxStack.isEmpty() && maxStack.getLast() > value) {
            max = maxStack.getLast();
        }
        stack.add(value);
        maxStack.add(max);
    }

    public void pop() {
        if (!stack.isEmpty()) {
            stack.removeLast();
            maxStack.removeLast();
        }
    }

    public int getMaxValue() {
        if (!maxStack.isEmpty()) {
            return maxStack.getLast();
        }
        throw new RuntimeException("Stack is empty");
    }
}
