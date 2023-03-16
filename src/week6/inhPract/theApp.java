package week6.inhPract;

/**
 *
 */
public class theApp {
    public static void main(String[] args) {
        /*
        Clock cl01 = new Clock("ABC", "white", 15);
        cl01.clockDetails();
        cl01.showTime();
        */

        // Watch wt01 = new Watch();
//        DigitalWatch dwt01 = new DigitalWatch();
//        dwt01.setColor("Brown");          // Clock
//        dwt01.setStrColor("Black");       // Watch
//        dwt01.setStrMaterial("Fabric");   // Watch
//        dwt01.setSize(4);                 // Clock
//        dwt01.setBrand("XYZ");            // Clock
//
//        dwt01.clockDetails();            // Clock
//        dwt01.watchDetails();            // Watch
//        dwt01.lightOnOff();              // Watch
//        dwt01.watchDetails();            // Watch
//        dwt01.lightOnOff();              // Watch
//        dwt01.dwDetail();                // DigitalWatch
//        dwt01.brightnessUp();           // DigitalWatch
//        dwt01.brightnessUp();           // DigitalWatch
//        dwt01.brightnessUp();           // DigitalWatch
//        dwt01.brightnessDown();         // DigitalWatch
//        dwt01.brightnessDown();         // DigitalWatch
//        dwt01.brightnessDown();         // DigitalWatch
//        dwt01.brightnessDown();         // DigitalWatch
//        dwt01.brightnessDown();         // DigitalWatch
//        dwt01.setAlarm("6:45");         // DigitalWatch
//        dwt01.setAlarm("7:15");         // DigitalWatch
//        dwt01.dwDetail();                // DigitalWatch
//        dwt01.removeAlarm();            // DigitalWatch
//        dwt01.dwDetail();               // DigitalWatch
//
//        dwt01.showTime();                // Clock
//        dwt01.showDate();                // Watch

        AlarmClock ac01 = new AlarmClock();
        ac01.setColor("Black");
        ac01.setBrand("DEF");
        ac01.setSize(10);
        ac01.clockDetail();
        ac01.acDetail();

        ac01.showTime();
        // ac01.showDate();
        ac01.setAlarm("6:33");
        ac01.setAlarm("6:43");
        ac01.acDetail();
        ac01.removeAlarm();
        ac01.acDetail();

        /*
        Clock cl = new Clock();
        Watch wt = new Watch();
        DigitalWatch dw = new DigitalWatch(); // DigitalWatch is grandchild of Clock.
        System.out.println(wt instanceof DigitalWatch); // instanceof helps us to find the relations between the classes.
        */
    }
}
