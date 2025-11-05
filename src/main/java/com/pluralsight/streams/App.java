package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class App {
    static void main() {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Ava", "Johnson", 22));
        people.add(new Person("Liam", "Turner", 31));
        people.add(new Person("Noah", "Reed", 19));
        people.add(new Person("Emma", "Bennett", 27));
        people.add(new Person("Oliver", "Hayes", 25));
        people.add(new Person("Sophia", "Miller", 29));
        people.add(new Person("Ethan", "Brooks", 33));
        people.add(new Person("Mia", "Parker", 20));
        people.add(new Person("Lucas", "Gray", 24));
        people.add(new Person("Isabella", "Walker", 30));

        List<Person> allAges = new ArrayList<>();

        int ageTotal = 0;
        int average = 0;
        for (Person p : people) {
            ageTotal += p.getAge();
            average = ageTotal / people.size();
        }
        System.out.println(average);

        int maxAge = 0;
        for (Person pe : people) {
            if (pe.getAge() > maxAge) {
                maxAge = pe.getAge();
            }
        }
        System.out.println(maxAge);

        int minAge = people.get(0).getAge();
        for (Person pe : people) {
            if (pe.getAge() < minAge) {
                minAge = pe.getAge();
            }
        }
        System.out.println(minAge);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first or last name");
        String name = scanner.nextLine();
        List<Person> matches = new ArrayList<>();
        for (Person p : people) {
            if (p.getFirstName().equals(name) || p.getLastName().equals(name)) {
                matches.add(p);
            }
        }
        for (Person m : matches) {
            System.out.println(matches);
        }
    }
}
