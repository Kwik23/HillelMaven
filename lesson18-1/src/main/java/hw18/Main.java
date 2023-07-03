package hw18;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        double average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
        System.out.println("Среднее значение: " + average);

        // Задача 2
        List<String> strings = Arrays.asList("one", "two", "three");
        List<Pair<String, String>> pairs = strings.stream()
                .map(s -> new Pair<>(s, s.toUpperCase()))
                .collect(Collectors.toList());
        System.out.println("Преобразованные строки: " + pairs);

        // Задача 3
        List<String> words = Arrays.asList("apple", "banana", "Cat", "dog");
        List<String> filteredWords = words.stream()
                .filter(s -> s.equals(s.toLowerCase()) && s.length() == 4)
                .collect(Collectors.toList());
        System.out.println("Фильтрованные строки: " + filteredWords);
    }

    static class Pair<K, V> {
        private final K key;
        private final V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        @Override
        public String toString() {
            return "{" + key + ":" + value + "}";
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Pair<?, ?> pair = (Pair<?, ?>) obj;
            return Objects.equals(key, pair.key) && Objects.equals(value, pair.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key, value);
        }
    }
    static double calculateAverage(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
    }

    static List<Pair<String, String>> convertToUpperCasePairs(List<String> strings) {
        return strings.stream()
                .map(s -> new Pair<>(s, s.toUpperCase()))
                .collect(Collectors.toList());
    }

    static List<String> filterLowerCaseWordsWithLengthFour(List<String> words) {
        return words.stream()
                .filter(s -> s.length() == 4 && s.toLowerCase().equals(s))
                .collect(Collectors.toList());
    }



}

