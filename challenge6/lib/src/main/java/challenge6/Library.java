package challenge6;

public class Library {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.append(1);
        list.append(3);
        list.append(2);
        System.out.println(list.printList());

        LinkedList list1 = new LinkedList();
        list1.append(1);
        list1.append(3);
        list1.append(2);
        list1.insertBefore(3, 5);
        System.out.println(list1.printList());

        LinkedList list2 = new LinkedList();
        list2.append(1);
        list2.append(3);
        list2.append(2);
        list2.insertAfter(3, 5);
        System.out.println(list2.printList());
    }
}
