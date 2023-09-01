package challenge9;

public class Palindrome {

    Node head;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("head");
        Node current = head;
        while (current != null) {
            stringBuilder.append(" > ").append(current.data);
            current = current.next;
        }
        return stringBuilder.toString();
    }


    public static boolean isPalindrome(Node head) {
        Node current = head;
        Node middle = head;

        // Find the middle of the linked list
        while (current != null && current.next != null) {
            middle = middle.next;
            current = current.next.next;
        }

        Node reversedSecondHalf = reverseList(middle);

        // Compare elements of the first and reversed second halves
        while (reversedSecondHalf != null) {
            if (head.data != reversedSecondHalf.data) {
                return false;
            }
            head = head.next;
            reversedSecondHalf = reversedSecondHalf.next;
        }

        return true;
    }

    public static Node reverseList(Node head) {
        Node prev = null;
        while (head != null) {
            Node temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
    class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
}
