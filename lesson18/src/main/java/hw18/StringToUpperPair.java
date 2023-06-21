package hw18;

import org.apache.commons.lang3.tuple.Pair;

import java.util.List;
import java.util.stream.Collectors;

public class StringToUpperPair {

    public static List<Pair<String, String>> transform(List<String> strings) {
        return strings.stream()
                .map(s -> Pair.of(s, s.toUpperCase()))
                .collect(Collectors.toList());
    }
}


