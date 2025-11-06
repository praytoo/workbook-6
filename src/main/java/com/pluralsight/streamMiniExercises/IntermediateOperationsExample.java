package com.pluralsight.streamMiniExercises;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class IntermediateOperationsExample {
    static void main() {
        List<String> words = List.of("java", "python", "javascript");

        List<String> char6 = words.stream()
                .filter(word -> word.length() >= 6)
                .map(word -> word.toUpperCase())
                .toList();
        char6.forEach(System.out::println);
    }
}
