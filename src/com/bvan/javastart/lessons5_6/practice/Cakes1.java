package com.bvan.javastart.lessons5_6.practice;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class Cakes1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter cakes: ");
        int cakes = scan.nextInt();

        System.out.println("I have " + cakes + " cakes.");
        for (int cakeIndex = 1; cakeIndex <= cakes; cakeIndex++) {
            System.out.println("I have eaten " + cakeIndex + " cake.");
        }
    }
}
