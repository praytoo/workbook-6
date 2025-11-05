package com.pluralsight.lambdas;

public class Exercise7 {
    static void main() {
        Divider divide = ( a,  b) -> a/b;
        System.out.println(divide.divide(49, 7));
    }
}
