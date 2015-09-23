package com.diosoft.tranning.objects;

import com.diosoft.tranning.enums.Position;

/**
 * Created by Сандро on 24.09.2015.
 */
public class Person {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final Position position;

    public Person(String firstName, String lastName, int age, Position position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.position = position;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }


    public Position getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (!firstName.equals(person.firstName)) return false;
        if (!lastName.equals(person.lastName)) return false;
        if (position != person.position) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + age;
        result = 31 * result + position.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", position=" + position +
                '}';
    }
}
