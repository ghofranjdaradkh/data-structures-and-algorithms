/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package mergesort;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test
    public void testMergeSort() {
        int[] arr = {10, 1, 3, 15,13, 6, 7};
        int[] expected = {1,3, 6, 7, 10, 13, 15};

        mergeSort.mergeSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMerge() {
        int[] left = {5, 10, 17};
        int[] right = {7, 7, 12};
        int[] arr = new int[6];
        int[] expected = {5, 7, 7, 10, 12, 17};

        mergeSort.merge(arr, left, right);

        assertArrayEquals(expected, arr);
    }
}

