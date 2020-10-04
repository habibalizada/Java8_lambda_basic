package com.company.Unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExcerciseSolutionJava7 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomes", "Carlyle", 51),
                new Person("Charlotte", "Bronte",45),
                new Person("Mathew","Arnold",39)
        );

        // Step 1: Sort list by last name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().trim().compareTo(o2.getLastName().trim());
//                return o2.getLastName().compareTo(o1.getLastName());
            }
        });

        // Step 2: Create a method that prints all element in the list
        System.out.println("Printing all persons");
        printAll(people);

        // Step 3: Create a method tha prints all people that have last name begnning with C
        System.out.println("\nPrinting all person with last name beginning with C");
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("C");
            }
        });

        System.out.println("\nPrinting all person with first name beginning with C");
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getFirsName().startsWith("C");
            }
        });

    }

    private static void printConditionally(List<Person> people, Condition condition) {
        for (Person p : people) {
            if (condition.test(p)){
                System.out.println(p);
            }
        }
    }

    private static void printAll(List<Person> people) {
        for (Person p : people) {
            System.out.println(p);
        }
    }

    interface Condition{
        boolean test(Person p);
    }
}
