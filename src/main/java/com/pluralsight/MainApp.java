package com.pluralsight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainApp {
    static void main() {
        Box<Integer> a = new Box<>(List.of(42));
        Box<String> b = new Box<>(List.of("hi"));
        System.out.println(a.get()); // 42
        System.out.println(b.get()); // hi

        Holder<Double> h1 = new Holder<>(List.of(3.14));
        Holder<Character> h2 = new Holder<>(List.of('Z'));
        h1.setValue(List.of(2.71));
        System.out.println(h1.getValue()); // 2.71
        System.out.println(h2.getValue()); // Z

        OptionalLite<String> o1 = OptionalLite.of("x");
        OptionalLite<String> o2 = OptionalLite.empty();
        System.out.println(o1.isPresent()); // true
        System.out.println(o2.isPresent()); // false

    }
}
