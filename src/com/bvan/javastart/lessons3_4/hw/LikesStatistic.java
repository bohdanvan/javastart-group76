package com.bvan.javastart.lessons3_4.hw;

/**
 * @author bvanchuhov
 */
public class LikesStatistic {

    public static void main(String[] args) {
        long likesCount = 9;
        int registrationYear = 2018;

        int currentYear = java.time.Year.now().getValue();
        double likesPerYear =
                (double) likesCount / (currentYear - registrationYear + 1);
        System.out.println(likesPerYear + " likes / year");
    }
}

// OUTPUT
// 9, 2017 -> 4.5 likes / year
// 9, 2019 -> 9.0 likes / year
