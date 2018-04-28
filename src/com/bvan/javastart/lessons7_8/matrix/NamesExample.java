package com.bvan.javastart.lessons7_8.matrix;

import java.util.Arrays;

public class NamesExample {

    public static void main(String[] args) {
        String[] names = {
                "John",
                "Bob",
                "Phil"
        };

        String name = names[2];
        char c = name.charAt(0);
        System.out.println(c);

        System.out.println(Arrays.toString(names));
    }
}

