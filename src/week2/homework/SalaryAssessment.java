package week2.homework;
import java.sql.SQLOutput;
import java.util.Scanner;
/*
Homework-1
write a program that annual earning
           Perfect start for work => =>100
           Good start for work => 80 ~ 99
           Average start for work => 70 ~ 79
           below average start for work => 60 ~ 69
           Not acceptable =>  0 ~ 59
*please just use if-else statement
*/
public class SalaryAssessment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your salary level (from 0 to 100): ");
        int salary = scan.nextInt();
        if(salary >= 100){
            System.out.println("Perfect start for work");
        }else if(salary >= 80){
            System.out.println("Good start for work");
        }else if(salary >= 70){
            System.out.println("Average start for work");
        }else if(salary >= 60){
            System.out.println("Below average start for work");
        }else if(salary >= 0){
            System.out.println("Not acceptable");
        }
    }
}
