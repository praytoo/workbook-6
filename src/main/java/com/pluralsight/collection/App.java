package com.pluralsight.collection;

import java.time.LocalDate;

public class App {
    static void main() {
        FixedList<Integer> numbers = new FixedList<>(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        // numbers.add(4); this line would fail

        System.out.println(numbers.getItems().size());

        FixedList<LocalDate> dates = new FixedList<>(2);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
        // dates.add(LocalDate.now()); this line would fail
    }
}
