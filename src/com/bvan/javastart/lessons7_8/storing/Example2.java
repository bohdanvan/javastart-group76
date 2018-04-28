package com.bvan.javastart.lessons7_8.storing;

import java.util.Arrays;

public class Example2 {

    public static void main(String[] args) {
        int[] a = {10, 20};
        f(a);
        System.out.println(Arrays.toString(a));
    }

    private static void f(int[] a) {
//        a = new int[]{100, 200};

        a[0] = 100;
        a[1] = 200;
    }
}
