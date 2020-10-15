package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Person person = new Person();
        Scanner input = new Scanner(System.in);
        try {
            for (int i = 0; i < 2; i++) {
                System.out.println("enter yor information" + (i + 1));

                System.out.println("name :");
                person.name[i] = input.next();
                System.out.println("family:");
                person.family[i] = input.next();
                System.out.println("age :");
                person.age[i] = input.nextInt();
                System.out.println("id:");
                person.id[i] = input.next();
            }
        } catch (Exception t) {
            Exceptiontr.Persons();
        }
    }
}
