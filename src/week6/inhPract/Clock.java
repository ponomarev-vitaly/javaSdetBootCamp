package week6.inhPract;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class Clock {
    /*
    public Clock(String br, String cl, int sz){
        brand = br;
        color = cl;
        size = sz;
    }
    */
    private String brand;
    private String color;
    private int size; // The size is the length of the diameter of the clock.

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void showTime(){
        // LocalDateTime.now();
        SimpleDateFormat sdt = new SimpleDateFormat("HH:mm");
        System.out.println("The time is \"" +sdt.format(new Date())+ "\"");
    }

    public void clockDetail(){
        System.out.println("This clock was manufactured for " + brand + " brand, it is " + color + " in color, with " + size + " cm diameter.");
    }
}
