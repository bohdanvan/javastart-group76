package com.bvan.javastart.lessons5_6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayFiller {

    public static void main(String[] args) {
        int[] a = new int[5];

        int filler = 42;
        for (int i = 0; i < a.length; i++) {
            a[i] = filler;
        }

        System.out.println(Arrays.toString(a));
    }
}
