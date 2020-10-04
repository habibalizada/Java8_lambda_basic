package com.company.Unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
        printConditionally(people, p -> true);

        // Step 3: Create a method tha prints all people that have last name beginning with C
        System.out.println("\nPrinting all person with last name beginning with C");
        printConditionally(people, p -> p.getLastName().startsWith("C"));

        System.out.println("\nPrinting all person with first name beginning with C");
        printConditionally(people, p -> p.getFirsName().startsWith("C"));

    }

    private static void printConditionally(List<Person> people, Condition condition) {
        for (Person p : people) {
            if (condition.test(p)){
                System.out.println(p);
            }
        }
    }


    interface Condition{
        boolean test(Person p);
    }
}
