package week3;

import java.util.Scanner;

public class AccountInfo {
    // Fields or instance variables.
    String name;
    String surname;
    String address;
    int idNumber;
    int phoneNumber;
    int dob;
    String gender;

    public static void main(String[] args) {
        AccountInfo accountInfo = new AccountInfo();
        AccountInfo accountInfo1 = new AccountInfo("Adam", "John", 8235835, "male"); // Fix the issue with the gender, because the result for the gender is null.
        System.out.println("Name: " + accountInfo1.name);
        System.out.println("Surname: " + accountInfo1.surname);
        System.out.println("Gender: " + accountInfo1.gender);
    }

    // method to get an info
    public void getInfo() {
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter your name: "); // Give directions to a client or patient.
        name = scan.nextLine();
        System.out.println("Please enter your surname: ");
        surname = scan.nextLine();
        System.out.println("Please enter your address: ");
        address = scan.nextLine();
        System.out.println("Please enter your Id number: ");
        idNumber = scan.nextInt();
        System.out.println("Please enter your phone number: ");
        phoneNumber = scan.nextInt();
        System.out.println("Please enter your DoB: ");
        dob = scan.nextInt();
        System.out.println("Please enter your gender: ");
        gender = scan1.nextLine();

    }
// Default Constructor created by JAVA for each class. That's why we can create an object even if we didn't create a constructor.
    public AccountInfo(){
    }

    public AccountInfo(String name, String surname, int phoneNumber, String number) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    // void method to print method
    public void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Address: " + address);
        System.out.println("Id Number: " + idNumber);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("DoB: " + dob);
        System.out.println("Gender: " + gender);

    }
}
