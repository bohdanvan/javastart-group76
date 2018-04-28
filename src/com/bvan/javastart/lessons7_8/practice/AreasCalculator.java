package com.bvan.javastart.lessons7_8.practice;

import java.util.Arrays;

public class AreasCalculator {

    public static void main(String[] args) {
        double[] ws = {10, -30};
        double[] hs = {20, 20};

        double[] as = rectangleAreas(ws, hs);// {200, 600}

        System.out.println(Arrays.toString(as));
    }

    public static double[] rectangleAreas(
            double[] widths,
            double[] heights) {

        if (widths.length != heights.length) {
            throw new IllegalArgumentException("length of widths is not equal to length of heights");
        }

        double[] areas = new double[widths.length];
        for (int i = 0; i < areas.length; i++) {
            areas[i] = Geometry.rectangleArea(widths[i], heights[i]);
        }
        return areas;
    }

}
