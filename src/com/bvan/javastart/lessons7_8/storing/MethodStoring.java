package com.bvan.javastart.lessons7_8.storing;

public class MethodStoring {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int res = sum(x, y);
        System.out.println(res);
    }

    public static int sum(int x, int y) {
        return x + y;
    }
}
