package hw17;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThrows;

public class ArrayManipulatorTest {

    @Test
    public void testExtractElementsAfterLastFour() {
        int[] inputArray1 = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] expectedArray1 = {1, 7};
        assertArrayEquals(expectedArray1, ArrayManipulator.extractElementsAfterLastFour(inputArray1));

        int[] inputArray2 = {4, 2, 3, 4, 1, 7};
        int[] expectedArray2 = {1, 7};
        assertArrayEquals(expectedArray2, ArrayManipulator.extractElementsAfterLastFour(inputArray2));

        int[] inputArray3 = {1, 2, 4, 4, 4, 4, 4};
        int[] expectedArray3 = {};
        assertArrayEquals(expectedArray3, ArrayManipulator.extractElementsAfterLastFour(inputArray3));

        int[] inputArray4 = {1, 2, 3};
        RuntimeException exception = assertThrows(RuntimeException.class,
                () -> ArrayManipulator.extractElementsAfterLastFour(inputArray4));
        String expectedMessage = "Input array does not contain a four";
        String actualMessage = exception.getMessage();
        assert actualMessage.contains(expectedMessage);
    }
}
