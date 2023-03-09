package week3;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        // Find the factorial for the given number
        /*
        5! = 5*4*3*2*1=120
        8! = 8*7*6*5*4*3*2*1
         */
        Scanner scan = new Scanner(System.in);
        System.out.printf("Please enter the factorial number to calculate: ");

        int fact = scan.nextInt(); // 7! = ? --> 7*6*5*4*3*2*1
        int result =1;
        int counter = 0;
        while(fact >= 1){
           result = result * fact;
           fact--;
           counter++;
           System.out.println(result);
        }
        System.out.println(counter + "! = " + result);

        /*
        print the Numbers from 1 to 100, only even Numbers; output: 2, 4, 6, 8 ... 100
         */

        System.out.println("Please enter the highest number to write even Numbers: ");
        int num = 100;
        int result1 = 1;
        while(result1 <= 100){
            // if(result2 == 100) System.out.println(result2); // This is the first option to handle the task.
            // else if(result2 % 2 == 0) System.out.print(result2 + ", ");

            if(result1 % 2 == 0) System.out.print(result1 + ","); // // This is the first option to handle the task.
            result1++;
        }
        System.out.println();
// print the Numbers from 1 to 100, only odd Numbers; output: 1, 3, 5, 7 ... 99
        int result2 = 1;
        while(result2 <= 100){
            if(result2 == 99) System.out.println(result2); // This is the first option to handle the task.
            else if(result2 % 2 != 0) System.out.print(result2 + ", ");
            result2++;
        }
    }
}
