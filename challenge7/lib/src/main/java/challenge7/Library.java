package challenge7;

public class Library {
    public static void main(String[] args) {
        LinkedListKth list = new LinkedListKth();
        list.append(1); //1 -> null
        list.append(3); //1 -> 3 - > null
        list.append(8); //  1 -> 3 -> 8 -> null
        list.append(2); // -> 3 -> 8 -> 2 -> null

        try {
            System.out.println("Linked List: " + list);
            System.out.println("kth from end k = 2: " + list.findKthValue(2));
            System.out.println("kth from end k = 0: " + list.findKthValue(0));
            System.out.println("kth from end k = 1: " + list.findKthValue(1));
            System.out.println("kth from end k = 4: " + list.findKthValue(4));



        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }


    }
}

