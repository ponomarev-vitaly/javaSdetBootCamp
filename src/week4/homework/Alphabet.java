package week4.homework;

import java.util.Scanner;

/**
 * 11- Write a java program to print the alphabets with the given range via keyboard.
 */
public class Alphabet {
    public static void main(String[] args) {
        System.out.println("PLease insert how many times you want to repeat printing alphabets: ");
        Scanner scan = new Scanner(System.in);
        int timesToRepeat = scan.nextInt();

        for(int i = 1; i <= timesToRepeat; i++){
            String alphabet[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
            System.out.println("Please enter the range of the alphabet to display: 1 - the index number of the letter you want to begin, 2 - the index number of the letter you want to finish: ");
            int whereToStart = scan.nextInt();
            int whereToFinish = scan.nextInt();
            if(whereToStart>=1&&whereToStart<=26&&whereToFinish>=1&&whereToFinish<=26){
//

            }else System.out.println("You entered the number(s) out of the range!");
        }

    }

    // Create method to find the indexes of the elements we want to find.
    public static void printTheRangeOfTheAlphabet(String[] arr, int number1, int number2){
        String[] newArr;
        for(int i = 0; i < arr.length; i++){
            if(number2>number1){

            }else System.out.println("You have entered the Numbers out of the range!");
        }
    return;
    }
}
