///*
// * This Java source file was generated by the Gradle 'init' task.
// */
package challenge6.lib.src.test.java.challenge6;
import static org.junit.Assert.assertEquals;
import challenge6.lib.src.main.java.challenge6.LinkedList;
import org.junit.Test;

public class LibraryTest {

    @Test
    public void testAppendSingleNode() {
        LinkedList list = new LinkedList();
        list.append(1);
        assertEquals("head -> 1 -> X", list.printList());
    }

    @Test
    public void testAppendMultipleNodes() {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(3);
        list.append(2);
        assertEquals("head -> 1 -> 3 -> 2 -> X", list.printList());
    }

    @Test
    public void testInsertBeforeMiddle() {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(3);
        list.append(2);
        list.insertBefore(3, 5);
        assertEquals("head -> 1 -> 5 -> 3 -> 2 -> X", list.printList());
    }

    @Test
    public void testInsertBeforeFirst() {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(3);
        list.append(2);
        list.insertBefore(1, 4);
        assertEquals("head -> 4 -> 1 -> 3 -> 2 -> X", list.printList());
    }

    @Test
    public void testInsertAfterMiddle() {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(3);
        list.append(2);
        list.insertAfter(3, 6);
        assertEquals("head -> 1 -> 3 -> 6 -> 2 -> X", list.printList());
    }

    @Test
    public void testInsertAfterLast() {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(3);
        list.append(2);
        list.insertAfter(2, 7);
        assertEquals("head -> 1 -> 3 -> 2 -> 7 -> X", list.printList());
    }
}

