package com.bvan.javastart.lessons7_8.matrix;

public class MatrixExample {

    public static void main(String[] args) {
        int[][] table = new int[3][3];

        int[][] matrix = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        int[] row = matrix[2];
        int elem = row[0];
        System.out.println(elem);

        System.out.println(matrix[2][0]);
    }
}
