package com.bvan.javastart.lessons5_6.condition;

/**
 * @author bvanchuhov
 */
public class Min3Args {

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = 2;

//        int min;
//        if (a < b && a < c) {
//            min = a;
//        } else if (b < a && b < c) {
//            min = b;
//        } else {
//            min = c;
//        }

        int min = (a < b) ? a : b;
        min = (min < c) ? min : c;

        System.out.println(min);
    }
}
