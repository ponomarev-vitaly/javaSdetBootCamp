package week8.homework.Interface;

import week8.Interface1.Inside;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Methods {
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Methods obj = new Methods();
        obj.createEmp();
    }

    public void createEmp(){

        String fName = null;
        System.out.println("Please enter your full name: ");
        try {
            fName = scan.nextLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new InputMismatchException();
        }

        int kids = 0;
        System.out.println("How many kids do you have? ");
        try {
            kids = scan.nextInt();
        } catch (Exception e) {
            throw new InputMismatchException();
        }

        String education = null;
        System.out.println("Please enter your degree: ");
        try {
            education = scan.next();
        } catch (Exception e) {
            throw new InputMismatchException();
        }

        EmployeePojo Emp01 = new EmployeePojo(fName, kids, education);
        Emp01.setEmpID(1000);
        Database.employeeList.add(Emp01);
        for(EmployeePojo e: Database.employeeList){
            System.out.println(e);
        }
        // System.out.println(Employee.employeeList); // We have to fix [] until next meeting.
    }
}
