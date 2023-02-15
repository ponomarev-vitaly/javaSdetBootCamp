package week2.homework;
import java.util.Scanner;

/*
Homework-4
declare variable year and department
years should be 1,2,3,4
deparments Computer and Machine Learning
Use the first if statement to check the department of the student.
Use the inner if statement to check in which year the student is.
Display the result.
i.e;
The student is in the Computer Science department
The student is in 2nd year
Please use nested if
 */

public class StudentsEvaluation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the year of your course (years should be 1,2,3,4): ");
        int year = scan.nextInt();
        System.out.println("Please enter your department: 1 - Computer and Machine Learning Department, 2 - Computer Science Department");
        int department = scan.nextInt();
        if (department == 1){
            if (year==1){
                System.out.println("You are the " + year + "st year Student. Your Department is Computer and Machine Learning Department.");
            } else if (year == 2){
                System.out.println("You are the " + year + "nd year Student. Your Department is Computer and Machine Learning Department.");
            } else if (year == 3){
                System.out.println("You are the " + year + "rd year Student. Your Department is Computer and Machine Learning Department.");
            } else if (year == 4){
                System.out.println("You are the " + year + "th year Student. Your Department is Computer and Machine Learning Department.");
            }
        } else if (department == 2) {
            if (year==1){
                System.out.println("You are the " + year + "st year Student. Your Department is Computer Science Department.");
            } else if (year == 2){
                System.out.println("You are the " + year + "nd year Student. Your Department is Computer Science Department.");
            } else if (year == 3){
                System.out.println("You are the " + year + "rd year Student. Your Department is Computer Science Department.");
            } else if (year == 4){
                System.out.println("You are the " + year + "th year Student. Your Department is Computer Science Department.");
            }
        }  else
           System.out.println("You are not the Student of the Computer and Machine Learning Department OR Computer Science Department OR the year of your course is not accepted yet.");

    }
}
