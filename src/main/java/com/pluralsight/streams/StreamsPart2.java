package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class StreamsPart2 {
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

        double averageOfAges = people.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);
        System.out.println(averageOfAges);

        Person maxAge = people.stream()
                .max((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()))
                .orElse(null);
        System.out.println(maxAge);

        Person minAge = people.stream().min((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()))
                .orElse(null);
        System.out.println(minAge);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first or last name");
        String name = scanner.nextLine();
        List<Person> matches = people.stream()
                .filter(p ->p.getFirstName().equals(name) || p.getLastName().equals(name))
                .toList();

        System.out.println(matches);
    }
}
