package week6.inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee extends Person{ // Employee class has all the FEATURES (methods and proprieties) that Person has.
    private String employer;
    private String empID;

    public String getEmployer() {
        return employer;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public void empIntro(){
        System.out.println("I am working at " + employer + ". My employee ID is: " + empID + ". ");
    }

    /*public static void main(String[] args) throws ParseException { // THIS METHOD MAKES A CODE RUN DESPITE THE ERRORS IN THE CODE.
        Employee emp01 = new Employee();
        emp01.gender = "Male";
        emp01.fName = "John";
        emp01.lName = "Doe";
        emp01.employer = "Clarusway";
        emp01.empID = "CW202000123";

        String  myDOB = "12-12-2000"; // THIS IS YET A STRING, NOT A OBJECT.
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date dob = sdf.parse(myDOB); // AFTER THIS LINE DATE TURNS INTO A DATE, NOT A STRING.

        emp01.setDOB(dob); // emp01.DOB = dob; // We have an error: DOB has private access in week6.inheritance.Person

        emp01.intro();
        emp01.empIntro();
    }

     */
}
