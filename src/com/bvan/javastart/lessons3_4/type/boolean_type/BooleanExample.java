package com.bvan.javastart.lessons3_4.type.boolean_type;

/**
 * @author bvanchuhov
 */
public class BooleanExample {

    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;

        int x = 10;
        boolean b3 = x < 20; // true
        boolean b4 = x >= 15; // false

        System.out.println(x < 10); // false
        System.out.println(x > 5); // true
        System.out.println(x >= 10); // true
        System.out.println(x <= 11); // true
        System.out.println(x == 20); // false
        System.out.println(x != 20); // true
    }

}
