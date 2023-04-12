package week9.SchoolManagement;

/**
 *
 */
public class Student extends Person{
    private int studentNumber;
    private String course;

    public Student(String fullName, String idNumber, int age, int studentNumber, String course) {
        super(fullName, idNumber, age);
        this.studentNumber = studentNumber;
        this.course = course;
    }

    public Student(String fullName, int age, int studentNumber, String course) {
        super(fullName, age);
        this.studentNumber = studentNumber;
        this.course = course;
    }

    public Student(int studentNumber, String course) {
        this.studentNumber = studentNumber;
        this.course = course;
    }

    public Student(){
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                "studentNumber=" + studentNumber +
                ", course='" + course + '\'' +
                '}';
    }
}
