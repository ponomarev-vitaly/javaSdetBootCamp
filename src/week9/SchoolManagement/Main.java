package week9.SchoolManagement;

import java.util.Scanner;

public class Main extends Person{
    static Methods methods = new Methods();
    public static void main(String[] args) {

        mainMenu();


    }

    private static void mainMenu() {
        System.out.println("STUDENT AND TEACHER MANAGEMENT PANEL\n" +
                "1- STUDENT OPERATIONS\n" +
                "2- TEACHER OPERATIONS\n" +
                "Q- EXIT");

        Scanner input = new Scanner(System.in);
        String choose = input.next().toUpperCase();

        if(choose.equals("1")){
            personType = "STUDENT";
            methods.subMenu();
        } else if(choose.equals("2")){
            personType = "TEACHER";
            methods.subMenu();
        } else if(choose.equalsIgnoreCase("Q")){
            methods.exit();
        } else {
            System.out.println("You entered wrong operation. Try again.");
            mainMenu();
        }
    }
}
