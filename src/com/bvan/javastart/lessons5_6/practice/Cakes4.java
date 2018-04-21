package com.bvan.javastart.lessons5_6.practice;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class Cakes4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter cakes: ");
        int cakes = scan.nextInt();

        System.out.print("Enter border cake: ");
        int borderCake = scan.nextInt();

        System.out.println("I have " + cakes + " cakes.");
        for (int cake = 1; cake <= cakes; cake++) {
            System.out.println("I have eaten " + cake + " cake.");

            if (cake >= borderCake) {
                System.out.println("I'm feeling bad.");
            }
        }
    }
}
