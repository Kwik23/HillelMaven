package hw18;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LowercaseStringFilterTest {
    @Test
    public void testFilterAndPrintLowercaseStrings() {
        List<String> strings = Arrays.asList("one", "two", "Three", "four", "five", "Six");

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream oldOut = System.out;
        System.setOut(printStream);

        LowercaseStringFilter.filterAndPrintLowercaseStrings(strings);

        System.out.flush();
        System.setOut(oldOut);

        String expectedOutput = "one\nfour\n";
        String actualOutput = outputStream.toString().trim();

        assertEquals(expectedOutput, actualOutput);
    }
}

