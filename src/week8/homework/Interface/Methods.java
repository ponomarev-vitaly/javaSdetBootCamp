package week8.homework.Interface;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Without knowing the specific bugs that you are referring to, I can provide some general suggestions for improving the code:
 * Close the scanner object: You should close the scanner object after you finish using it to prevent resource leaks.
 * Handle input mismatch exceptions: When the user enters invalid input for the "kids" field,
 * you catch the exception but then call the "createEmp()" method recursively, which could potentially cause a stack overflow.
 * Instead, you should use a loop to keep prompting the user for input until they enter a valid integer.
 * Use separate try-catch blocks: Instead of using a single try-catch block with a finally block to handle input exceptions for both the "kids" and "education" fields,
 * you should use separate try-catch blocks for each field. This will allow you to handle the exceptions for each field separately and avoid unexpected behavior.
 * Move scanner object instantiation to createEmp() method: Instead of instantiating the scanner object as a field,
 * you should instantiate it within the "createEmp()" method, since you only need it for that method.
 */
public class Methods {

    public static void main(String[] args) {
        Methods obj = new Methods();
        obj.createEmp();
    }

    public void createEmp(){
        Scanner scan = new Scanner(System.in);

        String fName = null;
        System.out.println("Please enter your full name: ");
        try {
            fName = scan.nextLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new InputMismatchException();
        }

        int empID = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.println("Please enter your valid employee ID number: ");
            try {
                empID = scan.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scan.next();
            }
        }

        int kids = 0;
        boolean validInput1 = false;
        while (!validInput1) {
            System.out.println("How many kids do you have? ");
            try {
                kids = scan.nextInt();
                validInput1 = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scan.next();
            }
        }

        String education = null;
        System.out.println("Please enter your degree: ");
        try {
            education = scan.next();
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid degree.");
        } finally {
            //scan.close(); // We changed scan.close() to

            EmployeePojo Emp01 = new EmployeePojo();
//            Emp01.setEmpID(1000);
//            Database.employeeList.add(Emp01);
            for(EmployeePojo e: Database.employeeList){
                System.out.println(e);
            }
        }
    }
    // We create update method here.
    public void updateEmp(){ // In this method we use the unique value ID number.
        boolean flag = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your employee ID number: ");
        int ID = input.nextInt();
        for (EmployeePojo employeePojo : Database.employeeList) {
            if (employeePojo.getEmpID() == ID) {
                int number = 0;
                System.out.println("Do you want to update your Personal Data? (1-Yes/2-No)");
                 if(number == 1){

                 }



                // Database.employeeList.set();
            }
        }
    }
}
