package hw18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class MainTest {
    @Test
    void testCalculateAverage() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        double expectedAverage = 3.0;

        double actualAverage = Main.calculateAverage(numbers);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    void testConvertToUpperCasePairs() {
        List<String> strings = Arrays.asList("one", "two", "three");
        List<Main.Pair<String, String>> expectedPairs = Arrays.asList(
                new Main.Pair<>("one", "ONE"),
                new Main.Pair<>("two", "TWO"),
                new Main.Pair<>("three", "THREE")
        );

        List<Main.Pair<String, String>> actualPairs = Main.convertToUpperCasePairs(strings);

        Assertions.assertEquals(expectedPairs, actualPairs);
    }

    @Test
    void testFilterLowerCaseWordsWithLengthFour() {
        List<String> words = Arrays.asList("apple", "banana", "Cat", "dog");
        List<String> expectedFilteredWords = Arrays.asList("apple");

        List<String> actualFilteredWords = Main.filterLowerCaseWordsWithLengthFour(words);

        Assertions.assertEquals(expectedFilteredWords, actualFilteredWords);
    }

}


