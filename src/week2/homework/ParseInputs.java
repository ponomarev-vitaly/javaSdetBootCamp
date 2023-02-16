package week2.homework;
import java.util.Scanner;
/*
All the wrapper classes in Java contain methods for parsing string values.
For example, the Integer.parseInt() method can parse an integer value from a given string.
 */
public class ParseInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your name? ");
        String name = scanner.nextLine();

        System.out.printf("So %s. How old are you? ", name);
        // parse the integer from the string
        int age = Integer.parseInt(scanner.nextLine());

        System.out.printf("Cool! %d is a good age to start programming. \nWhat language would you prefer? ", age);
        String language = scanner.nextLine();

        System.out.printf("Ah! %s is a solid programming language.", language);

        scanner.close();

    }

}
