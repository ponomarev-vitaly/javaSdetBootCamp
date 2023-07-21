package week24;

import java.util.Scanner;

public class ConverterHexToDec {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter hexadecimal name to convert into decimal: ");
        String hexNameString = scan.nextLine();

        try{
            int decimalValue = Integer.parseInt(hexNameString, 16);
            System.out.println("The decimal value is: " + decimalValue);
        } catch (NumberFormatException e){
            System.out.println("Invalid input!" + e);
        }
    }
}
