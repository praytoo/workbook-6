package com.pluralsight.appliedLambdaMiniExercise;

import java.util.ArrayList;
import java.util.List;

public class Exercise5 {
    static void main() {
    StringMapper map = words -> words.toUpperCase();

    List<String> words = List.of("hello", "world", "java");
     Exercise5 ex = new Exercise5();
     List<String> result = ex.mapStrings(map, words);
        System.out.println(result);

    }

    public List<String> mapStrings(StringMapper mapper, List<String> words) {
        List<String> mappedStrings = new ArrayList<>();
        for(String w : words) {
            mappedStrings.add(mapper.map(w)); // transform each word
        }
        return mappedStrings;
    }
}
