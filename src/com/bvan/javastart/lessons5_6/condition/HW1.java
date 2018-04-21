package com.bvan.javastart.lessons5_6.condition;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class HW1 {

    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day: ");
        int day = scanner.nextInt();

        // Validation
        if (day < 1 || day > 7) {
            System.out.println("Error");
            System.exit(0);
        }

        // BL
//        String dayType;
//        if (day <= 5) {
//            dayType = "weekday";
//        } else {
//            dayType = "weekend";
//        }

        String dayType = (day <= 5) ? "weekday" : "weekend";

        // Output
        System.out.println(dayType);
    }
}
