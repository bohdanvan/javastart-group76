package com.bvan.javastart.lessons7_8.storing;

public class StringStoringV2 {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = s1;

        s2 = s2.concat(", world");

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }
}
