package challenge8;

public class linkedListZip {


   Node head;

    public linkedListZip() {


        this.head = null;
    }

        public void append ( int value){
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

         Node zipLists (Node list1, Node list2){
            Node startPoint = new Node(0);
            Node current = startPoint;

            while (list1 != null && list2 != null) {
                current.next = list1;
                list1 = list1.next;
                current = current.next;

                current.next = list2;
                list2 = list2.next;
                current = current.next;
            }

            if (list1 != null) {
                current.next = list1;
            }

            if (list2 != null) {
                current.next = list2;
            }

            return startPoint.next;
        }


        class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;

            }

            @Override
            public String toString() {
                return String.valueOf(data);
            }
        }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(" -> ");
            }
            current = current.next;
        }
        return sb.toString();
    }
}

