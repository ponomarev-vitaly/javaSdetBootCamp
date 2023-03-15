package week6.inheritance;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 */
public class Person { // Class Person with the 4 parameters.
    protected String fName;
    String lName;
    private Date DOB; // OBJECT AS A DATE.
    protected String gender;

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public void intro(){
        SimpleDateFormat sdf = new SimpleDateFormat( "dd/MM/yyyy");
        System.out.println("Hi this is " + fName + " " + lName + " ("+gender+"). I was born on " + sdf.format(DOB) + ". ");
    }
}


