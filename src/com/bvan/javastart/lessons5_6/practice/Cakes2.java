package com.bvan.javastart.lessons5_6.practice;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class Cakes2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter cakes: ");
        int cakes = scan.nextInt();

        System.out.println("I have " + cakes + " cakes.");
        // n = (cakes - 1) ... 0
        for (int cakesLeft = cakes - 1; cakesLeft >= 0; cakesLeft--) {
            System.out.println("I have eaten a cake. "
                    + cakes + " are left.");
        }
    }
}
