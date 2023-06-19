package hw17;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ArrayCheckerTest {

    @Test
    public void testCheckArrayComposition() {
        int[] inputArray1 = {1, 4, 4, 1};
        assertTrue(ArrayChecker.checkArrayComposition(inputArray1));

        int[] inputArray2 = {1, 1, 4, 4};
        assertTrue(ArrayChecker.checkArrayComposition(inputArray2));

        int[] inputArray3 = {1, 1, 1, 1};
        assertFalse(ArrayChecker.checkArrayComposition(inputArray3));

        int[] inputArray4 = {4, 4, 4, 4};
        assertFalse(ArrayChecker.checkArrayComposition(inputArray4));
    }
}