package com.pluralsight.lambdas;

public class Exercise8 {
    static void main() {
        Greeter greeter = (name -> System.out.println("Hello " + name));
        greeter.greet("Prince");
        greeter.greet("Maaike");
        greeter.greet("Saint");
    }
}
