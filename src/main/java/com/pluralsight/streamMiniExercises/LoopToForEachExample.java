package com.pluralsight.streamMiniExercises;

import java.util.List;

public class LoopToForEachExample {
    static void main() {
        List<String> strings = List.of("java", "python", "javascript");

        strings.forEach(s -> System.out.println(s));
    }
}
