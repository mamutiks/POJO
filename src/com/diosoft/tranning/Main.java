package com.diosoft.tranning;

import com.diosoft.tranning.enums.Position;
import com.diosoft.tranning.objects.Person;

public class Main {

    public static void main(String[] args) {

        Person person_1 = new Person("Alexandr", "Matushevskyi", 35, Position.TRAINEE);
        Person person_2 = new Person("John", "Rambo", 45, Position.DIRECTOR);

        System.out.println(person_1.toString());
        System.out.println(person_2.toString());
        System.out.println(person_1 == person_2);
        System.out.println(person_1.equals(person_2));
        System.out.println(person_1.hashCode());
        System.out.println(person_2.hashCode());
    }
}
