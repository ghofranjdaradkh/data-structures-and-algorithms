/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    public void testEmptyTreeInstantiation() {
        BinarySearchTree tree = new BinarySearchTree();
        assertNull(tree.getRoot());
    }

    @Test
    public void testSingleRootNode() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(10);
        assertNotNull(tree.getRoot());
        assertEquals(10, tree.getRoot().data);
    }

    @Test
    public void testAddLeftAndRightChild() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(1);
        tree.add(0);
        tree.add(2);

        assertNotNull(tree.getRoot());
        assertEquals(1, tree.getRoot().data);

        assertNotNull(tree.getRoot().left);
        assertEquals(0, tree.getRoot().left.data);

        assertNotNull(tree.getRoot().right);
        assertEquals(2, tree.getRoot().right.data);
    }

    @Test
    public void testPreOrderTraversal() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(5);
        tree.add(3);
        tree.add(7);
        tree.add(2);
        tree.add(4);

        List<Integer> result = tree.preOrder(tree.getRoot());
        assertEquals(List.of(5, 3, 2, 4, 7), result);
    }

    @Test
    public void testInOrderTraversal() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(5);
        tree.add(3);
        tree.add(7);
        tree.add(2);
        tree.add(4);

        List<Integer> result = tree.inOrder(tree.getRoot());
        assertEquals(List.of(2, 3, 4, 5, 7), result);
    }

    @Test
    public void testPostOrderTraversal() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(5);
        tree.add(3);
        tree.add(7);
        tree.add(2);
        tree.add(4);

        List<Integer> result = tree.postOrder(tree.getRoot());
        assertEquals(List.of(2, 4, 3, 7, 5), result);
    }

    @Test
    public void testContainsExistingValue() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(1);
        tree.add(2);
        tree.add(3);

        assertTrue(tree.contains(1));
        assertTrue(tree.contains(2));
        assertTrue(tree.contains(3));
    }

    @Test
    public void testContainsNonExistingValue() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(1);
        tree.add(2);
        tree.add(3);

        assertFalse(tree.contains(4));
        assertFalse(tree.contains(8));
    }
}
