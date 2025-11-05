package com.pluralsight.lambdas;

public class Exercise2 {
    public static void main(String[] args) {
        Greeter greeter = name -> System.out.println("Hi " + name + "! Have a great day!");
        greeter.greet("Prince");
    }
}
