package com.pluralsight.functionalInterfaces;

public class LambdaExample {
    static void main() {
        NumericOperator operate = (a, b) -> a + b;
        System.out.println(operate.operate(4, 6));
    }
}
