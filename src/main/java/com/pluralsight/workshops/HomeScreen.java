package com.pluralsight.workshops;

import java.util.Scanner;

public class HomeScreen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Home Screen
                1) Add Shape
                2) Save Image
                0) Exit
                """);
        int homescreen = scanner.nextInt();
        scanner.nextLine();

        switch (homescreen){
            case 1 -> System.out.println("Which shape?");
            case 2 -> System.out.println("Saving image...");
            case 0 -> System.exit(0);
            default -> System.out.println("Invalid choice");
        }
    }
}
