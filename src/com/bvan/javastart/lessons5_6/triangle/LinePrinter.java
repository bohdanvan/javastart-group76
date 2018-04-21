package com.bvan.javastart.lessons5_6.triangle;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class LinePrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter count: ");
        int count = scanner.nextInt(); // 5

        for (int n = 1; n <= count; n++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
