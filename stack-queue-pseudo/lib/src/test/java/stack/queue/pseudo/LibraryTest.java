/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.queue.pseudo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test
    void testEnqueuesSingle() {
        pseudoQueue<Integer> pesQue = new pseudoQueue<>();
        pesQue.enqueue(1);
        assertEquals("[1]", pesQue.toString());
    }

    @Test
    void testEnqueuesMultiple() {
        pseudoQueue<Integer> pesQue = new pseudoQueue<>();
        pesQue.enqueue(1);
        pesQue.enqueue(2);
        pesQue.enqueue(3);
        assertEquals("[3] -> [2] -> [1]", pesQue.toString());
    }

    @Test
    void testDequeueSingle() {
        pseudoQueue<Integer> pesQue = new pseudoQueue<>();
        pesQue.enqueue(1);
        pesQue.enqueue(2);
        pesQue.enqueue(3);
        pesQue.dequeue();

        assertEquals("[3] -> [2]", pesQue.toString());
    }

    @Test
    void testDequeueMultiple() {
        pseudoQueue<Integer> pesQue = new pseudoQueue<>();
        pesQue.enqueue(1);
        pesQue.enqueue(2);
        pesQue.enqueue(3);
        pesQue.dequeue();
        pesQue.dequeue();
        pesQue.dequeue();

        assertEquals("", pesQue.toString());
    }



}