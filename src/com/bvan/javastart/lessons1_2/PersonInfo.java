package com.bvan.javastart.lessons1_2;

/**
 * @author bvanchuhov
 */
public class PersonInfo {
    public static void main(String[] args) {
        String firstName = "007";
        int age = 45;

        firstName = firstName + " Bond";
        age = age - 10;

        System.out.println("Hello, my name is " + firstName);
        System.out.println("I'm " + age + " years old");
    }
}
