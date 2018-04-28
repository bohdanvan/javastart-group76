package com.bvan.javastart.lessons7_8.hw;

import java.util.Arrays;

public class ArraysHW {

    public static void main(String[] args) {
        // 1
        boolean[] bools = new boolean[30];

        // 2
        double[] doubles = {10.2, 5.6, 7.8, 11.9};

        // 3
        int length = doubles.length;
        System.out.println(length);

        // 4
        System.out.println(Arrays.toString(doubles));

        // 5
        int[] a = new int[10];
        Arrays.fill(a, 42);
        System.out.println(Arrays.toString(a));

        // 6
        int[] b = {10, 30, 5, 20};
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
        System.out.println();

        // 7
        int[] c = {-5, 10, -10, 0, 20, 30};
        for (int i = 0; i < c.length; i++) {
            if (c[i] > 0) {
                System.out.println(i);
            }
        }
        System.out.println();

        // 8
        // for with index
        for (int i = 0; i < c.length; i++) {
            int elem = c[i];
            if (elem > 0) {
                System.out.println(elem);
            }
        }
        System.out.println();

        // for-each
        for (int elem : c) {
            if (elem > 0) {
                System.out.println(elem);
            }
        }
        System.out.println();

        // BAD CODE
//        for (int elem : c) {
//            System.out.println(c[elem]);
//        }

        // 9
        for (int i = c.length - 1; i >=0; i--) {
            int elem = c[i];
            if (elem > 0) {
                System.out.println(elem);
            }
        }
    }
}
