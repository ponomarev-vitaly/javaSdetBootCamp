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

        LocalDate inquiryExpiryDate = date.plusMonths(24);
        System.out.println("inquiryExpireyDate: " + inquiryExpiryDate);

        LocalDate newYear = date.plusYears(3);
        System.out.println("newYear: " + newYear);

        // Minus 25 days.
        LocalDate result = date.minusDays(25);
        System.out.println(result);

        inquiryExpiryDate = date.minusMonths(24); // Months to subtract: 24.
        System.out.println("inquiryExpiryDate = " + inquiryExpiryDate);

        newYear = date.minusYears(3);
        System.out.println("newYear = " + newYear);
        System.out.println("---------------------------------------");

        // LocalTime class.
        LocalTime time = LocalTime.now();
        System.out.println("time: " + time);

        LocalTime addHours = time.plusHours(5);
        System.out.println("addHours = " + addHours);

        LocalTime addMinutes = time.plusMinutes(35);
        System.out.println("addMinutes = " + addMinutes);

        LocalTime addSeconds = time.plusSeconds(25);
        System.out.println("addSeconds = " + addSeconds);

        LocalTime addNanoSeconds = time.plusNanos(2322222);
        System.out.println("addNanoSeconds = " + addNanoSeconds);

        LocalTime minusHours = time.minusHours(6);
        System.out.println("minusHours = " + minusHours);


    }
}
