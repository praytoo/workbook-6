package com.pluralsight.appliedLambdaMiniExercise;

import java.util.ArrayList;
import java.util.List;

import static java.awt.SystemColor.text;

public class Exercise2 {
    static void main() {
    StringFilter filter = text -> text.length() > 5;

    List<String> words = List.of("java", "lambdas", "awesome", "fun");

    Exercise2 ex = new Exercise2();
    List<String> result = ex.filterWords(filter, words);

        System.out.println(result);
    }

    public List<String> filterWords(StringFilter filter, List<String> words) {
        List<String> filteredWords = new ArrayList<>();
        for(String s : words) {
            if (filter.filter(s)) {
                filteredWords.add(s);
            }
        }
        return filteredWords;
    }
}
