package challenge5linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import challenge5.LinkedList;

public class LibraryTest {

    @Test
    public void testEmptyLinkedList() {
        // Arrange
        LinkedList list = new LinkedList();

        // Act
        String result = list.linkedListToString();

        // Assert
        assertEquals("Null", result);
    }

    @Test
    public void testInsertSingleValue() {
        // Arrange
        LinkedList list = new LinkedList();

        // Act
        list.linkedListInsert(10);

        // Assert
        assertEquals("{10} -> Null", list.linkedListToString());
    }

    @Test
    public void testInsertMultipleValues() {
        // Arrange
        LinkedList list = new LinkedList();

        // Act
        list.linkedListInsert(10);
        list.linkedListInsert(20);
        list.linkedListInsert(30);

        // Assert
        assertEquals("{30} -> {20} -> {10} -> Null", list.linkedListToString());
    }

    @Test
    public void testLinkedListIncludes() {
        // Arrange
        LinkedList list = new LinkedList();
        list.linkedListInsert(10);
        list.linkedListInsert(20);
        list.linkedListInsert(30);

        // Act
        boolean includes30 = list.linkedListInclude(30);
        boolean includes40 = list.linkedListInclude(40);

        // Assert
        assertTrue(includes30);
        assertTrue(!includes40);
    }

    @Test
    public void testLinkedListToString() {
        // Arrange
        LinkedList list = new LinkedList();
        list.linkedListInsert(10);
        list.linkedListInsert(20);
        list.linkedListInsert(30);

        // Act
        String result = list.linkedListToString();

        // Assert
        assertEquals("{30} -> {20} -> {10} -> Null", result);
    }
}
