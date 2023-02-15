package week2;
import java.util.Scanner;
public class NestedIf {
    public static void main(String[] args) {

        boolean male = false;
        int age = 30;
        if (male){
            if (age < 20){
                System.out.println("Boy");
            }else{
                System.out.println("Man");
            }
        }else{
            if (age < 20){
                System.out.println("Girl");
            }else{
                System.out.println("Woman");
            }
        }

    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter your car brand: ");
    String car = scan.nextLine();
    System.out.println(car);
    System.out.println("Please enter your age: ");
    int myAge = scan.nextInt();


    if(car == "Mercedes") {
        if (myAge >= 18) {
            System.out.println("You are eligible to drive my car");
        } else System.out.println("Sorry, you can not drive my car");
    }else System.out.println("Your car is not matching");

    }
}


