package week6.homework.Animals;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Animals {
    private String color;
    private int weight;
    private boolean yesNoLegs;
    private boolean vegetarian;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isYesNoLegs() {
        return yesNoLegs;
    }

    public void setYesNoLegs(boolean yesNoLegs) {
        this.yesNoLegs = yesNoLegs;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public void eatMethod(){
        boolean hungry = false;
        if(hungry!= false){
            System.out.println("Go and find to grab sth!");
        } else System.out.println("You are full now! Don't eat more!");
    }

    public void sleepMethod(){
        LocalTime time = LocalTime.now();
        DateTimeFormatter nightOrDay = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("The local time is: " + nightOrDay.format(time));
        LocalTime time1 = LocalTime.parse("00:01");
        // LocalTime time2 = LocalTime.parse("08:00");
        // boolean value = time.isAfter(time1);
        if(time.isAfter(time1)) System.out.println("You have to sleep now! ");
            else System.out.println("It's too early and don't sleep!");

    }
}
