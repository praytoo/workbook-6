package com.pluralsight.lambdas;

public class Exercise10 {
    static void main() {
        NumberChecker check = n -> {
            if (n % 2 == 0) {
                System.out.println("even");
            }else{
                System.out.println("odd");
            }
        };
        int n = 0;
        for (n = 0; n <= 5; n++){
            check.check(n);
        }
    }
}
