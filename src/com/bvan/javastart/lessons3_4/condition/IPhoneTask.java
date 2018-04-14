package com.bvan.javastart.lessons3_4.condition;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class IPhoneTask {

    public static void main(String[] args) {
        long iPhonePrice = 999;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter money: ");
        long money = scan.nextLong();

        System.out.print("Are you happy? (yes/no): ");
        boolean isHappy = scan.next().equals("yes");

        System.out.print("Does your girlfriend want? (yes/no): ");
        boolean girlfriendWants = scan.next().equals("yes");

        if ((!isHappy || girlfriendWants) && money >= iPhonePrice) {
            System.out.println("Buy iPhone");
            money -= iPhonePrice;
        } else {
            System.out.println("Sadly :(");
        }

        System.out.println(money + " left");
    }
}
