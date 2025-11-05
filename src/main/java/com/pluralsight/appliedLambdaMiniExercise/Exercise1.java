package com.pluralsight.appliedLambdaMiniExercise;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    static void main() {
        IntFilter filter = number -> number % 2 == 0;

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        Exercise1 ex = new Exercise1();
        List<Integer> result = ex.filterNumbers(filter, numbers);

        System.out.println(result);
    }
    public List<Integer> filterNumbers(IntFilter filter, List<Integer> numbers){
        List<Integer> filteredNumbers = new ArrayList<>();
        for(Integer n : numbers) {
            if(filter.filter(n)) {
                filteredNumbers.add(n);
            }
        }
        return filteredNumbers;
    }
    //Create a method in an App class called filterNumbers(IntFilter filter, List<Integer> numbers) that returns a new list of numbers passing the filter.
    //In the main method, write a lambda that returns true if the number is even (number % 2 == 0).
    //Test it with a list like [1,2,3,4,5,6] and print the result.
    //Mini-explanation: Just like with StudentFilter, this lambda checks each number and returns true or false.
}
