package com.bvan.javastart.lessons7_8.practice;

public class AreasSumCalculator {

    public static void main(String[] args) {
        double[] rs = {10, 20};
        double areaSum = circleAreasSum(rs);
        System.out.println(areaSum); // 1570.7963267948967
    }

    public static double circleAreasSum(double[] radiuses) {
        double areasSum = 0;
        for (double radius : radiuses) {
            double area = Geometry.circleArea(radius);
            areasSum += area;
        }
        return areasSum;
    }

    public static double circleAreasSumV1(double[] radiuses) {
        double[] areas = new double[radiuses.length];
        for (int i = 0; i < radiuses.length; i++) {
            areas[i] = Geometry.circleArea(radiuses[i]);
        }

        double areasSum = 0;
        for (int i = 0; i < areas.length; i++) {
            areasSum += areas[i];
        }
        return areasSum;
    }

    public static double circleAreasSumV2(double[] radiuses) {
        double areasSum = 0;
        for (int i = 0; i < radiuses.length; i++) {
            double area = Geometry.circleArea(radiuses[i]);
            areasSum += area;
        }
        return areasSum;
    }
}
