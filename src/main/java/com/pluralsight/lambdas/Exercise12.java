package com.pluralsight.lambdas;

public class Exercise12 {
    static void main() {
        Action run = () -> System.out.println("Start");
        run.run();
        Action run2 = () -> System.out.println("Still running...");
        run2.run();
        Action run3 = () -> System.out.println("Done");
        run3.run();
    }
}
