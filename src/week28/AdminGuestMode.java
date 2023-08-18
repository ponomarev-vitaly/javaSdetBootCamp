package week28;

import java.util.Scanner;

public class AdminGuestMode {
    public static void main(String[] args) {
        /**
         * Admin and Guest mode for application
         * Implement console program which will meet the following requirements:
         * Program can be started in ‘admin’ and ‘guest’ mode
         * To start program in ‘admin’ mode any of multiple string arguments should be equal to ‘--admin’
         * To start program in ‘guest’ mode any of multiple string arguments should be equal to ‘--guest’
         * Program cannot be started with ‘--admin’ and ‘--guest’ arguments simultaneously
         * If program is started in ‘admin’ mode then "Hello, Admin!" is printed to console
         * If program is started in ‘guest’ mode then "Hello, Guest!" is printed to console
         * If program is started with ‘--admin’ and ‘--guest’ arguments then program prints
         * "Please, select either 'ADMIN' or 'GUEST' mode for this program" to console
         */
        // Solution 1.
        // String inputMode;
        //Scanner scan = new Scanner(System.in);
        //System.out.println("This is the main menu. Please enter your choice: for admin mode --admin; for guest mode --guest.");
        //System.out.print("Your choice print hear: ");
        //inputMode = scan.nextLine();
        //switch(inputMode){
        //    case "--admin" -> System.out.println("Hello, Admin!");
        //    case "--guest" -> System.out.println("Hello, Guest!");
        //    default -> System.out.println("Please, select either 'ADMIN' or 'GUEST' mode for this program");
        //}

        // Solution 2.
        String inputArguments = String.join(",", args);
        String adminFlag = "--admin";
        String guestFlag = "--guest";
        if (inputArguments.contains(adminFlag) && inputArguments.contains(guestFlag)) {
            System.out.println("Please, select either 'ADMIN' or "
                    + "'GUEST' mode for this program");
        } else if (inputArguments.contains(adminFlag)) {
            System.out.println("Hello, Admin!");
        } else if (inputArguments.contains(guestFlag)) {
            System.out.println("Hello, Guest!");
        }
    }
}
