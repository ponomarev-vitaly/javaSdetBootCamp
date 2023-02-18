package week2.homework;
import java.util.Scanner; // Import JAVA library for the Scanner.
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
public class CheckingPersonalInformation {
    public static void main(String[] args) {
        String option = " ";
        for(int i = 1; i <= 3; i++) {
                Scanner scan = new Scanner(System.in); // Create a Scanner - object from the Scanner Class.
                System.out.println("Please enter your Name: "); // Directions for the user to enter personal information.
                String name = scan.nextLine(); // Get the data from the user with Scanner object.
                System.out.println("Please enter your Gender: ");
                String gender = scan.nextLine();
                System.out.println("Please enter your Age: ");
                String age = scan.nextLine();
                System.out.println("Please enter your Phone Number: ");
                String phone = scan.nextLine();
                System.out.println("Enter your city: ");
                String city = scan.nextLine();

                Scanner scan1 = new Scanner(System.in);
                System.out.println("Please verify your personal data: \n" + "Name            : " + name + "\nGender          : " + gender +
                        "\nAge             : " + age + "\nPhone Number    : " + phone + "\nCity            : " + city);

                System.out.println("Select an option from below: 1 or 2. \n1 - All given information is correct, \n2 - I need to re-enter the information.");
                option = scan1.next();
        if (option.equals("1")){
            System.out.println("Thanks for your confirmation, we saved your details.");
            break;}
        else if (!option.equals("2"))
            System.out.println("You didn't enter 1 or 2. Please re-enter the your information.");
        }
    }
}
// Go to the beginning and start answering the same questions again!