package com.company.Unit1;

import java.util.Arrays;
import java.util.List;

public class Unit1Exercise {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", " Carrol", 42),
                new Person("Thomes", "Carlyle", 51),
                new Person("Charlotte", "Bronte",45),
                new Person("Mathew","Arnold",39)
        );

        // Step 1: Sort list by last name
        // Step 2: Create a method that prints all element in the list
        // Step 3: Create a method tha prints all people that have last name begnning with C
    }
}
