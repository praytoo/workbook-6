package com.pluralsight.lambdas;

public class Exercise5 {
    static void main() {
        SquareCalculator square = (x -> x * x);
        int result = square.square(4);
        System.out.println("Calculating square..." + result);
    }
}
