package week7.PolyMorphism;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee extends Person { // Employee class has all the FEATURES (methods and proprieties) that Person has.
    private String employer;
    private String empID;

    public Employee(String fName, String lName, Date DOB, String gender, String employer, String empID) {
        super(fName, lName, DOB, gender);
        this.employer = employer;
        this.empID = empID;
    }


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

    public void intro() {
        super.intro();
        System.out.println("I am working at " + employer + ". My employee ID is " + empID);
    }

}
