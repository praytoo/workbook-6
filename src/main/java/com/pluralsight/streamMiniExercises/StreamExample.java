package com.pluralsight.streamMiniExercises;

import java.util.List;
import java.util.stream.Stream;

import static java.lang.StableValue.map;

public class StreamExample {
    static void main() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        List<Integer> evenNumbers = numbers.stream()
                        .filter(n -> n % 2 == 1)
                        .map(n -> n * n)
                        .toList();
                        evenNumbers.forEach(System.out::println);
    }
}
