package com.bvan.javastart.lessons3_4.type.double_type;

/**
 * @author bvanchuhov
 */
public class InfinityExample {

    public static void main(String[] args) {
        System.out.println(1.0 / 0); // Infinity
        System.out.println(-1.0 / 0); // -Infinity
        System.out.println(0.0 / 0); // NaN
    }
}
