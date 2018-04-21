package com.bvan.javastart.lessons5_6.practice;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class Cakes3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter cakes: ");
        int cakes = scan.nextInt();

        System.out.println("I have " + cakes + " cakes.");
        for (int cake = 1; cake <= cakes; cake++) {
            System.out.println("I have eaten " + cake + " cake.");

            if (cake % 2 == 0) {
                System.out.println("Wonderful world.");
            }
        }
    }
}
