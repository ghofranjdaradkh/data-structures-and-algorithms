package datastructue.Queue;


import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class Queue <T> {
    Node<T> front;
    Node<T> back;

    public Queue() {
        this.front = null;
        this.back = null;
    }


    public void enqueue(T Value) {
        Node<T> newNode = new Node<>(Value);
        if (front == null) {
            front = newNode;
            back = newNode;
        } else {
            back.next = newNode;
            back = newNode;
        }
    }

    public  T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");

        } else {

            T value = front.data;
            front = front.next;
            return value;
        }
    }


    public T peek() {
        if (isEmpty()) {

            throw new NoSuchElementException("Queue is empty");
        } else {
            return front.data;
        }}


    public  boolean isEmpty() {
        return front == null;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Queue { ");
        Node<T> current = front;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(" -> ");
            }
            current = current.next;
        }
        sb.append(" }");
        return sb.toString();
    }

}
