package com.pluralsight.streamMiniExercises;

import java.util.List;
import java.util.stream.Stream;

public class TerminalOperationsExample {
    static void main() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        long evenNumbers = numbers.stream()
                                    .filter(n -> n % 2 == 0)
                                    .count();
        System.out.println(evenNumbers);
    }
}
