package challenge5doublelinkedlist;



public class DoubleLinkedList {
    DoublyNode head;


//        DoublyNode current = list.head;
//        while (current != null) {
//            System.out.println(current.data);
//            current = current.next;
//        }



    public DoubleLinkedList() {
        this.head = null;
    }

    class DoublyNode {
        int data;
        DoublyNode prev;
        DoublyNode next;

        // constructor
        DoublyNode(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public void doublyInsert(int value) {
        DoublyNode newNode = new DoublyNode(value);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public boolean doublyIncludes(int value) {
        DoublyNode current = head;
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public String doublyToString() {
        StringBuilder result = new StringBuilder();
        DoublyNode current = head;
        while (current != null) {
            result.append("{ ").append(current.data).append(" } <-> ");
            current = current.next;
        }
        result.append("NULL");
        return result.toString();
    }
}