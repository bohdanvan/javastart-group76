package com.bvan.javastart.lessons7_8.hw;

public class AgeChecker {

    public static void main(String[] args) {
        System.out.println(isAge(-5)); // false
        System.out.println(isAge(50)); // true
        System.out.println(isAge(120)); // true
        System.out.println(isAge(121)); // false
    }

    public static boolean isAge(int n) {
        return n > 0 && n <= 120;
    }
}
