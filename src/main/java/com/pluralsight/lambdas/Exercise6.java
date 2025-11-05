package com.pluralsight.lambdas;

public class Exercise6 {
    static void main() {
        RandomPrinter printRandom = () -> System.out.println(Math.round(Math.random() * 10));
        printRandom.printRandom();
    }
}
