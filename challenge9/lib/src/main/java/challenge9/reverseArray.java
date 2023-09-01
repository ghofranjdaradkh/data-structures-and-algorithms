package challenge9;



public class reverseArray {
    Node head;


    public void append(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            return;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("head");
        Node current = head;
        while (current != null) {
            sb. append(" > ").append(current.data);
            current = current.next;
        }

        return sb.toString();
    }

    public void reverseLinkedList() {

        Node prev = null;
        Node current = head;
        Node   nextNode; //new node to point on current for next (node number2)

        while (current != null) {
            nextNode = current.next;//to make  new pointer(newtNode )point in reverse way
            current.next = prev; //to make pointer for the first node point to prev
            prev = current;
            current = nextNode;
        }

        head = prev;





    }


    class Node {
        int data ;
        Node next ;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
