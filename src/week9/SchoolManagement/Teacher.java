package week9.SchoolManagement;

public class Teacher extends Person{
    private String department;
    private String teacherID;

    public Teacher(String fullName, String idNumber, int age, String department, String teacherID) {
        super(fullName, idNumber, age);
        this.department = department;
        this.teacherID = teacherID;
    }

    public Teacher(String department, String teacherID) {
        this.department = department;
        this.teacherID = teacherID;
    }

    public Teacher(){
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "department='" + department + '\'' +
                ", teacherID='" + teacherID + '\'' +
                '}';
    }
}
