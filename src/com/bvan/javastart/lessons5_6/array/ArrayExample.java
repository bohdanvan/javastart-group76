package com.bvan.javastart.lessons5_6.array;


import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayExample {

    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = {10, 20, 30};

        int length = a.length;
        System.out.println(length);

        a[1] = 10;
        a[4] = 30;
        a[a.length - 1] = 50;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
