package week4.homework;

/**
 *
 */

public class Students { // Create the class.
    int studentsNumber; // Create global variables.
    int id;
    String name;
    String surname;
    int age;
    char grade;
    int total;

    public Students() { // Create the default constructor.
        this.name = "James"; // I assigned the default values.
        this.surname = "Bond";
    }

    public Students(int studentsNumber, String name, String surname, int age, int id, char grade) { // Create the constructor.
        this.studentsNumber = studentsNumber;
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.grade = grade;
    }

    public Students(int studentsNumber, String name, String surname, int total) { // Create the constructor for total number of students.
        this.studentsNumber = studentsNumber;
        this.name = name;
        this.surname = surname;
        this.total = total;
    }


    public static void main(String[] args) { // Create main method.
       Students student1 = new Students(1, "Ivan", "Ivanov", 24, 12345678, 'B'); // Create an object.
       Students student2 = new Students(21, "Jennifer", "Lopez", 50); // Create an object by using another constructor.
       Students student3 = new Students(); // Create an object by using the default constructor.

        // Print out everything what we have on student1.
        System.out.println(student1.studentsNumber);
        System.out.println(student1.name);
        System.out.println(student1.surname);
        System.out.println(student1.age);
        System.out.println(student1.id);
        System.out.println(student1.grade);
        // Print out everything what we have on student2.
        System.out.println(student2.name);
        System.out.println(student2.studentsNumber);
        System.out.println(student2.id);
        System.out.println(student2.surname);
        System.out.println(student2.total);
        // Print out what we have on student3.
        System.out.println(student3.name); // We get 'null' because in the default constructor we have nothing.
        System.out.println(student3.surname);
    }

}
