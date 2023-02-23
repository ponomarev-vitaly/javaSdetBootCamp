package week3;
// Homework
// Create 2 methods: 1: getInfo() and 2: printInfo()
// Create objects from different constructors and print the object info(fields).
// While creating object use default value, parameterized constructor and assign the value after creating the object.
public class ConstructorExample {
    // Fields/instance variables:
    String className;
    String subject;
    int roomNumber;
    String teacher;
    String grade;

    // Default constructor
    public ConstructorExample(){
    }
// Other constructor. We have many constructors with the same class but their Signature and parameters are different.
// We call this overloading (as the same things in the methods.
    public ConstructorExample(String className, String subject, int roomNumber, String teacher, String grade) {
        this.className = className;
        this.subject = subject;
        this.roomNumber = roomNumber;
        this.teacher = teacher;
        this.grade = grade;
    }

    public ConstructorExample(String className, String grade) {
        this.className = className;
        this.grade = grade;
    }

    public ConstructorExample(String className, int roomNumber, String grade) {
        this.className = className;
        this.roomNumber = roomNumber;
        this.grade = grade;
    }

    public ConstructorExample(String className, String subject, String grade) {
        this.className = className;
        this.subject = subject;
        this.grade = grade;
    }



    public static void main(String[] args) {
        ConstructorExample constructorExample = new ConstructorExample("Crazy", "7th grade");
        System.out.println(constructorExample.className);
        System.out.println(constructorExample.teacher);
        System.out.println(constructorExample.grade);
    }
}
