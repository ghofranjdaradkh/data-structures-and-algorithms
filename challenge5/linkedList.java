package challenge5;

class LinkedList {
    Node head;

    public static void main(String[] args) {
        //create list
        LinkedList list = new LinkedList();
        list.linkedListInsert(10);
        list.linkedListInsert(20);
        list.linkedListInsert(30);

        System.out.println(list);
        System.out.println(list.linkedListToString());
        System.out.println(list.linkedListInclude(5));

        Node current = list.head;
        while (current != null) {
            current = current.next;
        }
    }

    class Node {
        int data;
        Node next;

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
