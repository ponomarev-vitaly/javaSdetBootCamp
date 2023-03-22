package week7.PolyMorphism;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Lecturer extends Employee {
    private ArrayList<String> subjects; // Try to make more private than default or sth.

    public Lecturer(String fName, String lName, Date DOB, String gender, String employer, String empID){
        super(fName, lName, DOB, gender, employer, empID);
        subjects = new ArrayList<>();
    }

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<String> subjects) {
        this.subjects = subjects;
    }

    public void intro(){
        super.intro();
        if(subjects.size() > 0){
            System.out.println("I teach the below subjects: ");
            int i = 1;
            for(String sub : subjects){
                if(sub != null) {
                    System.out.println("\t" + (i++) + ". " + sub);
                }
            }
        }
    }
}
