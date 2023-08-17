package challenge5part2;

public class doublelinkedlistTest {


    public static void main(String[] args) {
        testEmptyDoubleLinkedList();
        testInsertSingleValue();
        testInsertMultipleValues();
        testDoubleLinkedListIncludes();
        testDoubleLinkedListToString();
    }

    private static void testEmptyDoubleLinkedList() {
        DoubleLinkedList list = new DoubleLinkedList();
        System.out.println("Test Empty Doubly Linked List: "+list.doublyToString());

    }

    private static void testInsertSingleValue() {
        DoubleLinkedList list = new DoubleLinkedList();
        list.doublyInsert(1);
        System.out.println("Test Insert  Value:" +list.doublyToString());

    }

    private static void testInsertMultipleValues() {
        DoubleLinkedList list = new DoubleLinkedList();
        list.doublyInsert(1);
        list.doublyInsert(2);
        list.doublyInsert(3);
        System.out.println("Test Insert Multiple Values:" + list.doublyToString());

    }

    private static void testDoubleLinkedListIncludes() {
        DoubleLinkedList list = new DoubleLinkedList();
        list.doublyInsert(1);
        list.doublyInsert(2);
        list.doublyInsert(3);
        System.out.println("Test Doubly Linked List Includes: " +"Includes 2: " + list.doublyIncludes(2)+" /"+"Includes 4: " + list.doublyIncludes(4) );

    }

    private static void testDoubleLinkedListToString() {
        DoubleLinkedList list = new DoubleLinkedList();
        list.doublyInsert(1);
        list.doublyInsert(2);
        list.doublyInsert(3);
        System.out.println("Test Doubly Linked List to String:" +list.doublyToString());

    }
}
