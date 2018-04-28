package com.bvan.javastart.lessons7_8.hw;

public class RangeSum {

    public static void main(String[] args) {
        System.out.println(rangeSum(1, 3)); // 6
        System.out.println(rangeSum(1, 100)); // 5050
        System.out.println(rangeSum(10, 5));
    }

    public static int rangeSum(int from, int to) {
        if (from > to) {
            throw new IllegalArgumentException("from should be <= than to");
        }

        int sum = 0;
        for (int n = from; n <= to; n++) {
            sum += n;
        }
        return sum;
    }
}
