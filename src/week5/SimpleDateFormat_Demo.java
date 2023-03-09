package week5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateFormat_Demo {
    public static void main(String[] args) throws ParseException {
        // use parse() method to parse
        // Date from String
        SimpleDateFormat SDFormat = new SimpleDateFormat("MM/ dd/ yyyy");
        Calendar calendar = Calendar.getInstance();

        String date = "11/ 15/ 2030";
        System.out.println("The unparsed string is: " + date);

        calendar.setTime(SDFormat.parse(date));
        System.out.println("Time parsed: " + calendar.getTime());
    }
}
