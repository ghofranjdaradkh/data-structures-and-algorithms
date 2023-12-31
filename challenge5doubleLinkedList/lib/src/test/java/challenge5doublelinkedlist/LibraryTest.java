/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge5doublelinkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {



    @Test public   void testEmptyDoubleLinkedList() {
        DoubleLinkedList list = new DoubleLinkedList();

        // Act
        String result = list.doublyToString();

        // Assert
        assertEquals("NULL", result);

    }

    @Test public  void testInsertSingleValue() {
        DoubleLinkedList list = new DoubleLinkedList();
        list.doublyInsert(1);
        assertEquals( "{ 1 } <-> NULL",list.doublyToString());

    }

    @Test public  void testInsertMultipleValues() {
        DoubleLinkedList list = new DoubleLinkedList();
        list.doublyInsert(1);
        list.doublyInsert(2);
        list.doublyInsert(3);
        assertEquals( "{ 3 } <-> { 2 } <-> { 1 } <-> NULL",list.doublyToString());

    }

    @Test public  void testDoubleLinkedListIncludes() {
        DoubleLinkedList list = new DoubleLinkedList();
        list.doublyInsert(1);
        list.doublyInsert(2);
        list.doublyInsert(3);
        Boolean test1=list.doublyIncludes(2);
        Boolean test2=list.doublyIncludes(4);
        assertTrue(test1);
        assertFalse(test2);

    }

    @Test public void testDoubleLinkedListToString() {
        DoubleLinkedList list = new DoubleLinkedList();
        list.doublyInsert(1);
        list.doublyInsert(2);
        list.doublyInsert(3);

assertEquals("{ 3 } <-> { 2 } <-> { 1 } <-> NULL",list.doublyToString());
    }
}

