package challenge5;

public class LinkedList {
    public Node head;




    public class Node {
        int data;
        public Node next;

        // constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void linkedListInsert(int data) {
        Node newItem = new Node(data);
        newItem.next = head;
        head = newItem;
    }

    public boolean linkedListInclude(int data) {
        Node value = head;
        while (value != null) {
            if (value.data == data) {
                return true;
            } else {
                value = value.next;
            }
        }
        return false;
    }

    public String linkedListToString() {
        StringBuilder result = new StringBuilder();
        Node current = head;
        while (current != null) {
            result.append("{").append(current.data).append("} -> ");
            current = current.next;
        }
        result.append("Null");
        return result.toString();
    }
}
