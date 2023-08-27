package challenge7;

public class LinkedListKth {
    Node head;

    public LinkedListKth() {
        this.head = null;
    }

    public int findKthValue(int K) {
        int count = 0;
        Node current = head;

        while (current != null) {
            current = current.next;
            count++;
        }

        if (K < 0) {
            throw new IllegalArgumentException("k is Negative");
        }

        if (count <=  K) {
            throw new IllegalArgumentException("k is greater than the length of the list");
        }

        current = head;
        for (int i = 1; i < (count - K); i++) {
            current = current.next;
        }

        return current.data;
    }


    public void append(int newValue) {
        Node newNode = new Node(newValue);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next; //ensures that the current pointer points to the last node
            }
            current.next = newNode; //newNode to become the new last node
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("head - >");
        Node current = head;
        while (current != null) {
            result.append(current.data).append(" -> ");
            current = current.next;
        }
        result.append("X");
        return result.toString();
    }



    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }}