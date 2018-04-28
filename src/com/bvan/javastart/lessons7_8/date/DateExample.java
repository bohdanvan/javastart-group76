package com.bvan.javastart.lessons7_8.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateExample {

    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        LocalDate now = LocalDate.now();
        LocalDate nowYearAgo = now.minusYears(1);
        DayOfWeek dayOfWeek = nowYearAgo.getDayOfWeek();
        System.out.println(dayOfWeek.getValue());

        LocalDate elvisBirthDate = LocalDate.of(1935, 1, 8);
        System.out.println(elvisBirthDate.isLeapYear());
    }
}
