package hw18;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringToUpperPairTest {

    @Test
    public void testStringToUpperPair() {
        List<String> strings = Arrays.asList("one", "two", "three");

        List<Pair<String, String>> expectedPairs = strings.stream()
                .map(s -> Pair.of(s, s.toUpperCase()))
                .collect(Collectors.toList());

        List<Pair<String, String>> actualPairs = StringToUpperPair.transform(strings);

        assertEquals(expectedPairs, actualPairs);
    }
}

