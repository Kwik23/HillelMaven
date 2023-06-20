package hw18;

import java.util.List;

public class AverageValueCalculator {
    public double calculateAverage(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
    }
}
