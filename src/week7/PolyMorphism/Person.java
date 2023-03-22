package week7.PolyMorphism;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 */
public class Person { // Class Person with the 4 parameters.
    private String fName;
    private String lName;
    private Date DOB; // OBJECT AS A DATE.
    private String gender;

    public Person(String fName, String lName, Date DOB, String gender){
        this.fName = fName;
        this.lName = lName;
        this.DOB = DOB;
        this.gender = gender;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void intro(){
        SimpleDateFormat sdf = new SimpleDateFormat( "dd/MM/yyyy");
        System.out.println("Hi this is " + fName + " " + lName + " ("+gender+"). I was born on " + sdf.format(DOB) + ". ");
    }
}


