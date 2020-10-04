package com.company.Unit1;

import java.util.Objects;

public class Person {
    private String firsName;
    private String lastName;
    private int age;

    public Person(String firsName, String lastName, int age) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(firsName, person.firsName) &&
                Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firsName, lastName, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
