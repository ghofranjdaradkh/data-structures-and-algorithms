package challenge5;

public class linkedlistTest {
    public static void main(String[] args) {
        testEmptyLinkedList();
        testInsertSingleValue();
        testInsertMultipleValues();
        testLinkedListIncludes();
        testLinkedListToString();
    }

    private static void testEmptyLinkedList() {
        // Arrange
        LinkedList list = new LinkedList();

        // Act
        String result = list.linkedListToString();

        // Assert
        System.out.println("Test Empty Linked List: "+ result);


    }

    private static void testInsertSingleValue() {
        // Arrange
        LinkedList list = new LinkedList();

        // Act
        list.linkedListInsert(10);

        // Assert
        System.out.println("Test Insert Single Value: "+list.linkedListToString());


    }

    private static void testInsertMultipleValues() {
        // Arrange
        LinkedList list = new LinkedList();

        // Act
        list.linkedListInsert(10);
        list.linkedListInsert(20);
        list.linkedListInsert(30);

        // Assert
        System.out.println("Test Insert Multiple Values: "+list.linkedListToString());

    }

    private static void testLinkedListIncludes() {
        // Arrange
        LinkedList list = new LinkedList();
        list.linkedListInsert(10);
        list.linkedListInsert(20);
        list.linkedListInsert(30);

        // Act
        boolean includes30 = list.linkedListInclude(30);
        boolean includes40 = list.linkedListInclude(40);

        // Assert
        System.out.println("Test Linked List Includes:  "+"Includes 30: " + includes30 +" / "+"Includes 40: " + includes40);

    }

    private static void testLinkedListToString() {
        // Arrange
        LinkedList list = new LinkedList();
        list.linkedListInsert(10);
        list.linkedListInsert(20);
        list.linkedListInsert(30);

        // Act
        String result = list.linkedListToString();

        // Assert
        System.out.println("Test Linked List to String: "+result);

    }
}
