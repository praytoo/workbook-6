package com.pluralsight.appliedLambdaMiniExercise;

import java.util.ArrayList;
import java.util.List;

public class Exercise4 {
    public static void main(String[] args) {
    DogFilter filteredDogByAge = dog -> dog.getAge() > 5;
    DogFilter filteredDogLabs = dog -> dog.getBreed().contains("Labrador");

    List<Dog> dogs = new ArrayList<>();
    Dog dog1 = new Dog("Alex", 5, "Labrador");
    Dog dog2 = new Dog("Allie", 6, "Chihuahua");
    Dog dog3 = new Dog("Arnold", 4, "Labrador");

    dogs.add(dog1);
    dogs.add(dog2);
    dogs.add(dog3);

        Exercise4 ex = new Exercise4();
        List<Dog> result = ex.filterDogs(filteredDogByAge, dogs);
        System.out.println(result);

        Exercise4 ex2 = new Exercise4();
        List<Dog> result2 = ex2.filterDogs(filteredDogLabs, dogs);
        System.out.println(result2);
    }
    public List<Dog> filterDogs(DogFilter filter, List<Dog> dogs){
        List<Dog> filteredDogs = new ArrayList<>();
        for(Dog d : dogs) {
            if (filter.filter(d)) {
                filteredDogs.add(d);
            }
        }
        return filteredDogs;
    }
}
