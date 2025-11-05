package com.pluralsight.lambdas;

public class Exercise14 {
    static void main() {
    Operation apply = (a, b) -> a + b;
    Exercise14 ex = new Exercise14();
    ex.calculate(apply);
    Operation apply2 = (a, b) -> a - b;
    Exercise14 ex2 = new Exercise14();
    ex.calculate(apply2);
    Operation apply3 = (a, b) -> a * b;
    Exercise14 ex3 = new Exercise14();
    ex.calculate(apply3);
    }

    public void calculate(Operation op){
        System.out.println(op.apply(8, 2));
    }
}
