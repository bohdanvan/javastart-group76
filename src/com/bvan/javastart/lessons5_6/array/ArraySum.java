package com.bvan.javastart.lessons5_6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArraySum {

    public static void main(String[] args) {
        int[] a = {10, 30, 20};

//        int sum = 0;
//        for (int i = 0; i < a.length; i++) {
//            int elem = a[i];
//            sum += elem;
//        }

        int sum = 0;
        for (int elem : a) { // for-each (90%)
            sum += elem;
        }

        System.out.println("sum = " + sum);
    }
}
