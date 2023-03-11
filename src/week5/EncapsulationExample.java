package week5;

public class EncapsulationExample {
    private String studentName;
    private String className;

    private String subjectName;

    private double grade;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        EncapsulationExample obj1 = new EncapsulationExample();
        obj1.setStudentName("Mustafa");
        obj1.setClassName("SDET");
        obj1.setSubjectName("Java");
        obj1.setGrade(70);

        String name = obj1.getStudentName();
        String className = obj1.getClassName();
        String subjectName = obj1.getSubjectName();
        double grade = obj1.getGrade();

        System.out.println("object name: " + name + "\nclass name: " + className + "\nsubject name: " + subjectName + "\ngrade: " + grade);

    }
}
