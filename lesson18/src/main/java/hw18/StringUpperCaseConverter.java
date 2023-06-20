package hw18;

import javafx.util.Pair;

import java.util.List;
import java.util.stream.Collectors;

public class StringUpperCaseConverter {
    public List<Pair<String, String>> convertStringsToUppercasePairs(List<String> strings) {
        return strings.stream()
                .map(s -> new Pair<>(s, s.toUpperCase()))
                .collect(Collectors.toList());
    }
}
