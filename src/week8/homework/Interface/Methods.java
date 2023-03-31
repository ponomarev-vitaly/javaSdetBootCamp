package week8.homework.Interface;

import week8.Interface1.Inside;

import java.util.Scanner;

public class Methods {
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Methods obj = new Methods();
        obj.createEmp();
    }

    public void createEmp(){
        System.out.println("Please enter your full name: ");
        String fName = scan.nextLine();
        System.out.println("How many kids do you have? ");
        int kids = scan.nextInt();
        System.out.println("Please enter your degree: ");
        scan.next();
        String education = scan.next();


        EmployeePojo Emp01 = new EmployeePojo(fName, kids, education);
        Emp01.setEmpID(1000);
        Employee.employeeList.add(Emp01);
        System.out.println(Employee.employeeList);
    }
}
