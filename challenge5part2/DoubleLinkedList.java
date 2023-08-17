package challenge5part2;

public class DoubleLinkedList {
    DoublyNode head;

    public static void main(String[] args) {
        // create list
        DoubleLinkedList list = new DoubleLinkedList();
        list.doublyInsert(10);
        list.doublyInsert(20);
        list.doublyInsert(30);

        System.out.println(list);
        System.out.println(list.doublyIncludes(7));
        System.out.println(list.doublyIncludes(20));
        System.out.println(list.doublyToString());

        DoublyNode current = list.head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }


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


