package week9.SchoolManagement;

import java.util.Scanner;

import static week9.SchoolManagement.Person.personType;

public class Methods implements SchoolManagement{
    static Scanner input=  new Scanner(System.in);
    @Override
    public void create() {
        System.out.println(" *** Welcome to create " + personType + " page ***");
             // Teacher(String fullName, String idNumber, int age, String department, String teacherID)

        System.out.println("Enter fullname: ");
        String name = input.next();

        System.out.println("Enter ID number: ");
        try {
            String idNumber = input.next();
            idNumber = idNumber.replace(" ", ""); // This line of code is to catch the spaces when they come from the user.

            if (personType.equals("STUDENT")) {
                System.out.println("Enter age: ");
                try {
                    int age = input.nextInt();
                    if (age < 8 || age > 19) {
                        throw new ArithmeticException("Your age is out of the range.");
                    } else {
                        // studentNumber, String course
                        System.out.println("Enter your student number ");
                        int studentNumber = input.nextInt();

                        System.out.println("Enter your course ");
                        String course = input.next();

                        Student std = new Student(name, idNumber, age, studentNumber, course);
                        student.add(std);
                        System.out.println("Added student is: " + std.getFullName());

                    }
                } catch (Exception e) {
                    throw new ArithmeticException(e.getMessage());
                }

                } else { // For teacher.
                    System.out.println("Enter your age: ");
                    int age = input.nextInt();

                    System.out.println("Enter your department: ");
                    String department = input.next();

                    System.out.println("Enter your teacher ID number: ");
                    String teacherID = input.next();

                    Teacher teacher = new Teacher(name, idNumber, age, department, teacherID);
                    teachers.add(teacher);
                    System.out.println("Added teacher: " + teacher.getFullName());

                }

            } catch(Exception e){
                System.out.println("You have entered wrong information.");
                create();
            }
    }

    @Override
    public void subMenu() {
            System.out.println("============= OPERATIONS =============\n" +
                    "1- ADD\n" +
                    "2- SEARCH\n" +
                    "3- LIST\n" +
                    "4- DELETE\n" +
                    "5- MAIN MENU\n" +
                    "Q- EXIT");
            String option=input.next();

            switch(option){
                case "1":
                    create();
                    subMenu();
                    break;
                case "2":
                    create();
                    subMenu();
                    break;
                case "3":
                    create();
                    subMenu();
                    break;
                case "4":
                    create();
                    subMenu();
                    break;
                case "5":
                    create();
                    subMenu();
                    break;
            }
    }

    @Override
    public void search() {

    }

    @Override
    public void list() {

    }

    @Override
    public void exit() {

    }

    @Override
    public void delete() {

    }
}
