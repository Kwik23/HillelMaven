package hw18;

import javafx.util.Pair;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringUpperCaseConverterTest {
    @Test
    public void testConvertStringsToUppercasePairs() {
        List<String> strings = Arrays.asList("one", "two", "three", "four");

        List<Pair<String, String>> expectedList = strings.stream()
                .map(s -> new Pair<>(s, s.toUpperCase()))
                .collect(Collectors.toList());

        List<Pair<String, String>> actualList = StringUpperCaseConverter.convertStringsToUppercasePairs(strings);

        Assertions.assertEquals(expectedList, actualList);
    }
}
