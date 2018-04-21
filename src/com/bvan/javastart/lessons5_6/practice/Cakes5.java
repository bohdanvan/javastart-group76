package com.bvan.javastart.lessons5_6.practice;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class Cakes5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter people: ");
        int people = scan.nextInt();

        System.out.print("Enter cakes: ");
        int cakes = scan.nextInt();

        for (int person = 1; person <= people; person++) {
            System.out.println("I'm " + person + " person. I have " + cakes + " cakes.");
            for (int cake = 1; cake <= cakes; cake++) {
                System.out.println("I'm " + person + " person. I have eaten " + cake + " cake.");
            }
            System.out.println();
        }
    }
}
