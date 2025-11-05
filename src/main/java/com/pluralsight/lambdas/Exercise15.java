package com.pluralsight.lambdas;

public class Exercise15 {
    static void main() {
        String[] names = {"Prince", "Maaike", "Saint"};
        NamePrinter print = s -> System.out.println("Name: " + s);
        for (String name : names) {
            print.print(name);
        }
    }
}
