package stack.queue.pseudo;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class pseudoQueue <T> {
    Stack<T> stack1 = new Stack();
    Stack<T> stack2 = new Stack();


    public void enqueue(T value) {

        stack1.push(value);


    }

    public T dequeue() {

        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                throw new NoSuchElementException();
            } else {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());


                }
            }

        }
        return stack2.pop();
    }


    @Override
    public String toString() {
        StringBuilder SB = new StringBuilder();
        if (!stack1.isEmpty()) {
            Stack<T>.Node<T> current = stack1.top;
            while (current != null) {
                SB.append("[").append(current.data).append("]");
                if (current.next != null) {
                    SB.append(" -> ");
                }
                current = current.next;
            }
        } else if (!stack2.isEmpty()) {
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
            Stack<T>.Node<T> current = stack1.top;
            while (current != null) {
                SB.append("[").append(current.data).append("]");
                if (current.next != null) {
                    SB.append(" -> ");
                }
                current = current.next;
            }
        }
        return SB.toString();
    }
}




