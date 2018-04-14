package com.bvan.javastart.lessons3_4.loop;

/**
 * @author bvanchuhov
 */
public class WorkingWeekWhile { // 9 %

    public static void main(String[] args) {
        int day = 6; // (1) - init counter

        while (day <= 5) { // (2) - loop condition
            System.out.println(day + " - Work");
            day++; // (3) - counter changing
        }

        System.out.println("Yahoooooo!");
    }
}
