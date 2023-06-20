package hw18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class AverageValueCalculatorTest {
    @Test
    public void testCalculateAverage() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        double expectedAverage = 5.5;

        double actualAverage = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        Assertions.assertEquals(expectedAverage, actualAverage, 0.001);
    }
}
