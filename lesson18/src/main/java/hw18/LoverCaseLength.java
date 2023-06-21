package hw18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LoverCaseLength {
    public List<String> filterStrings() {
        List<String> strings = Arrays.asList("apple", "Orange", "banana", "kiwi");

        List<String> filteredStrings = strings.stream()
                .filter(s -> s.equals(s.toLowerCase()) && s.length() == 4)
                .collect(Collectors.toList());

        return filteredStrings;
    }

    public static void main(String[] args) {
        LoverCaseLength main = new LoverCaseLength();
        List<String> filteredStrings = main.filterStrings();
        filteredStrings.forEach(System.out::println);
    }
}






