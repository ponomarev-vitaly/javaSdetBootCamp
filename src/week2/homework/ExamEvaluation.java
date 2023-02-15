package week2.homework;
import java.util.Scanner;
/*
Homework-2
assign int mid term exam result between 0-100, int mtExam
then assign final exam result between 0-100, int
then calculate mid term exam of %40,and final exam %60,
if it is more than 70, print result as "Passed" and if it is less than 71, print the result.
 */
public class ExamEvaluation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the mid term exam result between from 0 to 100: ");
        int midTermExam = scan.nextInt();
        System.out.println("Please enter the final exam result from 0 to 100: ");
        int finalExam = scan.nextInt();
        int termScore = (int) ((midTermExam * 0.4) + (finalExam * 0.6));
        System.out.println("Your Term Score is " + termScore);
        if(termScore > 70){
            System.out.println("You passed!");
        }else{
            System.out.println("You did not pass this time. Give it another try!");
        }
    }
}
