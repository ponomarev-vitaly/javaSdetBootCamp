package week2.homework;
import java.util.Scanner;
/*
Homework-3
Assign age and weight,
for blood donation,
 people should be bigger than 21
 and
 more than 90 pound
 please use nested if
 */

public class BloodDonation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = scan.nextInt();
        System.out.println("Please enter your weight in pounds: ");
        int weight = scan.nextInt();
        if(age>21){
            if(weight>90)
                System.out.println("Congratulations! You are a good candidate for blood donation! Please help people!");
            else
                System.out.println("Your weight must be more than 90 pounds! Come again in one month.");
        }
        else
            System.out.println("You are too young yet! Come again in a year!");
    }
}
