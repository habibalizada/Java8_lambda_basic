package com.company.Unit2;

import com.company.Unit1.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1ExerciseSolutionJava8 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomes", "Carlyle", 51),
                new Person("Charlotte", "Bronte",45),
                new Person("Mathew","Arnold",39)
        );

        // Step 1: Sort list by last name
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        // Step 2: Create a method that prints all element in the list
        System.out.println("Printing all persons");
        PerformConditionally(people, p -> true, p -> System.out.println(p));

        // Step 3: Create a method tha prints all people that have last name beginning with C
        System.out.println("\nPrinting all person with last name beginning with C");
        PerformConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p));

        System.out.println("\nPrinting all person with first name beginning with C");
        PerformConditionally(people, p -> p.getFirsName().startsWith("C"), p -> System.out.println(p.getFirsName()));

    }

    private static void PerformConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) { // for more info checkout: https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
        for (Person p : people) {
            if (predicate.test(p)){
                consumer.accept(p);
            }
        }
    }
}
