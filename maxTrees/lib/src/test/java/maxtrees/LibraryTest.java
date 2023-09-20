/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package maxtrees;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {


    @Test
    public void testFindMaximumValue() {
        treeMax treeMax=new treeMax();
        // Arrange
        treeMax.add(14);
        treeMax.add(5);
        treeMax.add(15);
        treeMax.add(3);
        treeMax.add(7);
        treeMax.add(12);
        treeMax.add(18);

        int maxValue = treeMax.findMaximumValue();
        assertEquals(18, maxValue);
    }

    @Test
    public void testFindMaximumValue_ExpectException() {
        treeMax treeMax=new treeMax();
    assertThrows(IllegalStateException.class, () -> {
        treeMax.findMaximumValue();
    });
}

}