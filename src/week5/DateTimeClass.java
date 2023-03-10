package week5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeClass {
    public static void main(String[] args) {
        System.out.println("LocalDate.now() = " + LocalDate.now()); // Call the now method.
        System.out.println("LocalTime.now() = " + LocalTime.now());
        System.out.println("LocalDateTime.now() = " + LocalDateTime.now());

        // LocalDate class
        LocalDate date = LocalDate.now();
        date = date.plusDays(11); // Adding 11 days to today's date.
        System.out.println(date);

        LocalDate inquiryExpereyDate = date.plusMonths(24);
        System.out.println("inquiryExpireyDate: " + inquiryExpereyDate);

        // Minus 25 days.

    }
}
