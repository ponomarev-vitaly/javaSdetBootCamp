package week8.homework.Interface;

public class EmployeePojo implements Database {
    private String fName;
    private int empID;
    private int kids;
    private String education;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }


    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public int getEmpID() {
        return empID;
    }

    public int getKids() {
        return kids;
    }

    public void setKids(int kids) {
        this.kids = kids;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public EmployeePojo(String fName, int empID, int kids, String education) {
        this.fName = fName;
        this.kids = kids;
        this.education = education;
        this.empID = empID;
    }

    public EmployeePojo(){

    }

    @Override
    public String toString() {
        return "EmployeePojo{" +
                "fName='" + fName + '\'' +
                ", empID=" + empID +
                ", kids=" + kids +
                ", education='" + education + '\'' +
                '}';
    }
}
