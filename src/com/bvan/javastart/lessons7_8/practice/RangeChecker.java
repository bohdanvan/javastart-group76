package com.bvan.javastart.lessons7_8.practice;

public class RangeChecker {

    public static void main(String[] args) {
        System.out.println(isAllInRange(new double[]{150, 50}, 10, 200)); // true
        System.out.println(isAllInRange(new double[]{150, 50}, 100, 200)); // false

    }

    public static boolean isAllInRange(
            double[] shapes,
            double minShape,
            double maxShape) {

        // iter
        for (double shape : shapes) {
            if (!isInRange(shape, minShape, maxShape)) {
                return false;
            }
        }

        return true;
    }

    public static boolean isInRange(double n, double min, double max) {
        return n >= min && n <= max;
    }
}
