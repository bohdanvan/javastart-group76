package com.bvan.javastart.lessons3_4.hw;

/**
 * @author bvanchuhov
 */
public class Casting {

    public static void main(String[] args) {
        byte b = 10;
        int x = b;
        System.out.println(x);

        int y = 200;
        byte b1 = (byte) y; // bad practice
        System.out.println(b1);
    }
}
