package com.bvan.javastart.lessons7_8.storing;

public class Example {

    public static void main(String[] args) {
        int x = 10;
        x = inc(x);
        System.out.println(x);
    }

    private static int inc(int x) {
        return x + 1;
    }
}
