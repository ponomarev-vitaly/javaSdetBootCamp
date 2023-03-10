package week5.homework;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Question 16. Given the code fragment. Result?
 */
public class TestQuestion16 {
    // private static LocalDateTime dt;

    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2014, 7, 31, 1, 1);
         // These methods are not working. This dt variable is returning the value.
        // According to return type we have to assign the value.
        dt.plusDays(30); // dt = dt.plusDays(30);
        dt.plusMonths(1); // dt = dt.plusMonths(1);
        System.out.print(dt.format(DateTimeFormatter.ISO_DATE));
    }

//    private static Object format(DateTimeFormatter isoDate) {
//    }
}
