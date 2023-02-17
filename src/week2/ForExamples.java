package week2;
import java.util.Scanner;

/*
5! = 5*4*3*2*1=120

 */
public class ForExamples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number from 1 to 10: ");
        int fact = scan.nextInt();
        int result = 1;
        for(int mult = 1; mult<=fact; mult++){  // this is the mult value
            result = result * mult;    // result *= mult         // 1 2 3 4 5 *result
            // 1 *1 = 1
            // 1 *2 = 2
            // 2 *3 = 6
            // 6 *4 = 24
            // 24*5 = 120

        }
        System.out.println("Result of " + fact + " factor is " + result);

    }
}
