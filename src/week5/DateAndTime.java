package week5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAndTime {
    public static void main(String[] args) {
        /*
        Java Dates

         */
        // LocalDate class:
        System.out.println("Local Date: " + LocalDate.now());
        System.out.println("Local Time: " + LocalTime.now());
        System.out.println("Local Date and time: " + LocalDateTime.now());

        // Manipulating Dates:
        LocalDate date = LocalDate.now();
        System.out.println("Local date: " + date);

        date = date.plusDays(3);
        System.out.println(date);

        date = date.minusDays(6);
        System.out.println(date);

        date = date.plusMonths(7);
        System.out.println(date);

        date = date.minusMonths(4);
        System.out.println(date);

        date = date.minusYears(23);
        System.out.println(date);

        date = date.plusYears(11);
        System.out.println(date);

        // LocalTime manipulating:
        LocalTime time = LocalTime.now();
        System.out.println(time);

        time = time.plusHours(2);
        System.out.println(time);

        time = time.minusHours(8);
        System.out.println(time);

        time = time.plusMinutes(45);
        System.out.println(time);

        time = time.minusMinutes(30);
        System.out.println(time);

        time = time.plusSeconds(10);
        System.out.println(time);

        time = time.minusSeconds(15);
        System.out.println(time);
    }
}
