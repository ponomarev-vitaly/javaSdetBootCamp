package week2.homework;
import java.util.Scanner;
/*
7- Write a java program to find if the student is passed the exam (user scanner class for user inputs)
    Note: passing mark is : 65
 */

public class ExamChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Please enter your mark: ");
        int mark = scan.nextInt();
        if (mark >0 && mark <100) {
            if (mark >= 65)
                System.out.printf("Congrats! You have passed your exam!");
            else
                System.out.printf("Revive your knowledge! Re-exam!");
        }
        else
            System.out.println("You have entered wrong mark. Give it another try!");

    }
}

