package com.pluralsight.lambdas;

public class Exercise11 {
    static void main() {
    Action run = () -> System.out.println("Running from lambda!");
        run.run();
    }
    public void perform(Action action){
        action.run();
    }
}
