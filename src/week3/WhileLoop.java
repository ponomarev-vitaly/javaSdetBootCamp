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
    }
}
