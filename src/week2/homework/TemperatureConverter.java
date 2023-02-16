package week2.homework;
import java.util.Scanner;
/*
3- Write a java program to convert it to Celsius using user input.
    Formula: Celsius= (Fahrenheit-32)*5/9
    Given : 87F
    Calculation:  (87-32)*5/9=30.5 Celcius
 */
public class TemperatureConverter {
    public static void main(String[] args) {
        System.out.println("Please enter the temperature in Fahrenheit: ");
        Scanner scan = new Scanner(System.in);
        double fahrenheit = scan.nextDouble();
        System.out.println("You entered the meaning of temperature in Fahrenheit: " + fahrenheit + " F");
        double celcius = (fahrenheit-32) * 5 / 9;
        System.out.println("Temperature in Celcius after convertion: " + celcius + " Celcius");
    }

}
