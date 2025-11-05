package com.pluralsight.lambdas;

public class Exercise4 {
    static void main() {
        Multiplier multiply = (a, b) -> a * b;
        System.out.println(multiply.multiply(4, 6));
    }
}
