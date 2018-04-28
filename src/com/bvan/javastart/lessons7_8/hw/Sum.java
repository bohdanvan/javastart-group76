package com.bvan.javastart.lessons7_8.hw;

public class Sum {

    public static void main(String[] args) {
        int x = sum(10, 20, 30);
        System.out.println(x);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
}
