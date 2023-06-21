package hw18;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AverageTest {

    @Test
    public void testAverage() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        double expectedAverage = 3.0;

        double actualAverage = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        assertEquals(expectedAverage, actualAverage);
    }
}

