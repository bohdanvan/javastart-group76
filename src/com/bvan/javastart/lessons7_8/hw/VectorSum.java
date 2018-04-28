package com.bvan.javastart.lessons7_8.hw;

import java.util.Arrays;

public class VectorSum {

    public static void main(String[] args) {
        int[] x = {10, 20, 30, 40, 50, 70};
        int[] y = {5, 4, 7, 7};
        int[] r = vectorSum(x, y);
        System.out.println(Arrays.toString(r));
    }

    public static int[] vectorSum(int[] a, int[] b) {
        int resLength = Math.min(a.length, b.length);
        int[] res = new int[resLength];

        for (int i = 0; i < res.length; i++) {
            res[i] = a[i] + b[i];
        }
        return res;
    }
}
