/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tree.breadth.first;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {



    @Test
    public void testBreadthFirst() {

        Node root = new Node(2);
        root.left = new Node(7);
        root.right = new Node(5);
        root.left.left = new Node(2);
        root.left.right = new Node(6);
        root.right.right = new Node(9);
        root.left.right.left = new Node(5);
        root.left.right.right = new Node(11);
        root.right.right.left = new Node(4);


        int[] expected = {2, 7, 5, 2, 6, 9, 5, 11, 4};


        List<Integer> result = breadthFirst.breadthFirstMethod(root);

        assertArrayEquals(expected, result.stream().mapToInt(Integer::intValue).toArray());
    }}