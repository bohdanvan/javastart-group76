package com.bvan.javastart.lessons7_8.storing;

import java.util.Arrays;

public class ArrayStoring {

    public static void main(String[] args) {
        int[] a = {10, 20};
        int[] b = a;

        b[0] = 1000;

        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
    }
}
