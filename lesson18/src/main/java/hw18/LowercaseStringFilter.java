package hw18;

import java.util.List;

public class LowercaseStringFilter {
    public List<String> filterLowercaseStrings(List<String> strings) {
        return strings.stream()
                .filter(s -> s.length() == 4 && s.equals(s.toLowerCase()))
                .collect(Collectors.toList());
    }
}