package week5;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZone {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        ZoneId currentZone= ZoneId.systemDefault();
        ZoneId newZone = ZoneId.of("Europe/Paris");
        ZonedDateTime zonedNow = ZonedDateTime.of(now, currentZone);
        ZonedDateTime newZonedNow = zonedNow.withZoneSameInstant(newZone);
        System.out.println("Local Date Time: " + now);
        System.out.println("Current Time Zone: " + currentZone);
        System.out.println("New Time Zone: " + newZone);
        System.out.println("New Zoned Date Time: " + newZonedNow);
    }
}
