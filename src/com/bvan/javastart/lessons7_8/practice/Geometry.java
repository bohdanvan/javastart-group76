package com.bvan.javastart.lessons7_8.practice;

public class Geometry {

    // Client
    public static void main(String[] args) {
        System.out.println(rectangleArea(10, 20)); // 200
        System.out.println(rectangleArea(30, 20)); // 600

        System.out.println(circleArea(10)); // 314
        System.out.println(circleArea(20)); // 1256
    }

    // Creator
    public static double rectangleArea(double width, double height) {
        if (width <= 0) {
            throw new IllegalArgumentException("width is not positive: " + width);
        }
        if (height <= 0) {
            throw new IllegalArgumentException("height is not positive: " + height);
        }

        return width * height;
    }

    public static double circleArea(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("radius is not positive: " + radius);
        }
        return Math.PI * Math.pow(radius, 2);
    }
}
