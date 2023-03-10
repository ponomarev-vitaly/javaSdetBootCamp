package week5;

import java.util.Calendar;

/**
 * Write Java program to create a Date object using the Calendar class.
 */
public class Calendar1 {
    public static void main(String[] args) {
        int year = 2023;
        int month = 5;
        int date = 15;

        Calendar calendar = Calendar.getInstance();
        // Sets the given calendar field value and the time value.
        calendar.clear();
        System.out.println();
        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DATE, date);
        System.out.println(calendar.getTime());

    }
}
