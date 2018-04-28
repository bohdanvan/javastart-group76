package com.bvan.javastart.lessons7_8.storing;

public class Equality {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
