package week28;

import java.util.Scanner;

/**
 * Implement console program which will meet the following requirements:
 * Program is started and user is asked to enter one of possible events:
 * login
 * sign_up
 * terminate_program
 * main_menu
 * about_app
 * Based on user input program prints to console different text. Mapping is below:
 * User Input
 * Console output
 * login
 * Please, enter your username
 * sign_up
 * Welcome!
 * terminate_program
 * Thank you! Good bye!
 * main_menu
 * Main menu
 * about_app
 * This app is created by me with support of ®IT-Bulls.com
 * <any other input>
 * Please, enter one of these values: login, sign_up, terminate_program, main_menu, about_app
 */
public class UserActivitySelector {
    public static void main(String[] args) {
        System.out.println("<==================== Main menu ====================>");
        System.out.println("<==================== Please enter one of possible events: ====================>");
        System.out.println("<==================== login ====================>");
        System.out.println("<==================== sign_up ====================>");
        System.out.println("<==================== terminate_program ====================>");
        System.out.println("<==================== main_menu ====================>");
        System.out.println("<==================== about_app ====================>");
        System.out.print("Please, enter action name: ");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        switch(userInput){
            case "login" -> System.out.println("Please, enter your username");
            case "sign_up" -> System.out.println("Welcome!");
            case "terminate_program" -> System.out.println("Thank you! Good bye!");
            case "main_menu" -> System.out.println("Main menu");
            case "about_app" -> System.out.println("This app is created by me with support of ®IT-Bulls.com");
            default -> System.out.println("Please, enter one of these values: login, sign_up, terminate_program, main_menu, about_app");
        }
    }
}
