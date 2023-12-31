/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.queue.brackets;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test
    public void testValidBracketsTrue() {
        validateBrackets validator = new validateBrackets();


        assertTrue(validator.validBracket("{[()]}"));
        assertTrue(validator.validBracket("()"));
        assertTrue(validator.validBracket("({})"));
        assertTrue(validator.validBracket("{([])}"));
    }
        @Test
        public void testValidBracketFalse() {
            validateBrackets validator = new validateBrackets();

        assertFalse(validator.validBracket("{[()]"));
        assertFalse(validator.validBracket("{[()]}]"));
        assertFalse(validator.validBracket("{[(])}"));
        assertFalse(validator.validBracket("[)"));

    }
}


