package week2.homework;
import java.util.Scanner;
/*
2-) Write a java program to get below inputs from user
    Enter your Name
    Enter your Gender
    Enter your Age
    Enter your Phone Number
    Enter your City
    And print these in puts in below format:
    Please verify below details are correct:
    Choose one of the option(1 or 2):
    1- All given informations are correct
    2- I need to re-enter the informations
    Name            : John Doe
    Gender          : Male
    Age             : 35
    Phone Number    : 7775554433
    City            : Colorado
    If user enters 1 then print the below message:
    Thanks for your confirmation, we saved your details.
    If user enters 2 then go to the beginning and start asking the same questions again.
 */
public class CheckingPersonalData {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your Name: ");
        String name = scan.nextLine();
        System.out.println("Please enter your Gender: ");
        String gender = scan.nextLine();
        System.out.println("Please enter your Age: ");
        int age = scan.nextInt();
        System.out.println("Please enter your Phone Number: ");
        String phone = scan.nextLine();
        System.out.println("Enter your city: ");
        String city = scan.nextLine();
        System.out.println("Please verify your personal data: \n" + "Name            :\n" + name + "Gender          :" + gender + "Age             :" + age + "Phone Number    :" + phone + "City            :" + city);

    }
}
