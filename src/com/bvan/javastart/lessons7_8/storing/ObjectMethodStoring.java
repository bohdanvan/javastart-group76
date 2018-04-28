package com.bvan.javastart.lessons7_8.storing;

import java.util.Arrays;

public class ObjectMethodStoring {

    public static void main(String[] args) {
        int[] a = new int[10];
        fill(a, 42);
        System.out.println(Arrays.toString(a));
    }

    public static void fill(int[] a, int filler) {
        for (int i = 0; i < a.length; i++) {
            a[i] = filler;
        }
    }
}
