package com.pluralsight.lambdas;

public class Exercise9 {
    static void main() {
        String prefix = "Message: ";
        Printer print = text -> System.out.println(prefix + text);
        print.print("I love you!");
    }
    //Try to change prefix after defining the lambda — what happens?
    // you can't
}
