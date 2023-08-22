package challenge7;

public class Library {
    public static void main(String[] args) {
        LinkedListKth list = new LinkedListKth();
        list.insert(1);
        list.insert(3);
        list.insert(8);
        list.insert(2);

        try {
            System.out.println("Linked List: " + list);
            System.out.println("kth from end k = 2: " + list.findKthValue(2));
            System.out.println("kth from end k = 4: " + list.findKthValue(4));
            System.out.println("kth from end k = 0: " + list.findKthValue(0));
            System.out.println("kth from end k = 0: " + list.findKthValue(6));


        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }



    }
}

