package com.bvan.javastart.lessons5_6.condition;

/**
 * @author bvanchuhov
 */
public class IfExample {

    public static void main(String[] args) {
        int x = 15;

        if (x < 20) {
            if (x > 10 && x < 15) {
                System.out.println("3");
            }
            System.out.println("1");
        } else {
            System.out.println("2");
        }
    }
}
