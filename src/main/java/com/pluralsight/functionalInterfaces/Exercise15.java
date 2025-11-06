package com.pluralsight.functionalInterfaces;

import java.util.List;

public class Exercise15 {
    static void main() {

        int[] numbers = {2, 5, 10, 13, 20};

        NumberTester test = number -> number % 2 == 0;

        for (int n : numbers) {
            System.out.println(n + " is even? " + test.test(n));
        }
    }
}
