package week5.homework;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Question №3. D.
 */
public class TestQuestion03 {
    public static void main(String[] args) {
        try {
            String date = LocalDate.parse("2014-05-04T11:30:00:123123").format(DateTimeFormatter.ISO_DATE_TIME);
            System.out.println(date);
        } catch (Exception e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }
}
