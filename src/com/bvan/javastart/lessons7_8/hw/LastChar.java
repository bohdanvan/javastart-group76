package com.bvan.javastart.lessons7_8.hw;

public class LastChar {

    public static void main(String[] args) {
        System.out.println(lastChar("Hello"));
        System.out.println(lastChar("A"));
        System.out.println(lastChar(""));
    }

    public static char lastChar(String s) {
        if (s.isEmpty()) {
            throw new IllegalArgumentException("can't find last char in empty string");
        }
        return s.charAt(s.length() - 1);
    }
}
