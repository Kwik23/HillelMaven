package hw17;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleMathLibraryTest {

    @Test
    public void testAdd() {
        SimpleMathLibrary mathLibrary = new SimpleMathLibrary();
        double result = mathLibrary.add(2.5, 3.5);
        assertEquals(6.0, result, 0.0001);
    }

    @Test
    public void testMinus() {
        SimpleMathLibrary mathLibrary = new SimpleMathLibrary();
        double result = mathLibrary.minus(5.0, 2.0);
        assertEquals(3.0, result, 0.0001);
    }
}
