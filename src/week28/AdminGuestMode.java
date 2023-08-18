package week28;

import java.util.Scanner;

public class AdminGuestMode {
    public static void main(String[] args) {
        String inputMode;
        Scanner scan = new Scanner(System.in);
        System.out.println("This is the main menu. Please enter your choice: for admin mode --admin; for guest mode --guest.");
        System.out.print("Your choice print hear: ");
        inputMode = scan.nextLine();
        switch(inputMode){
            case "--admin" -> System.out.println("Hello, Admin!");
            case "--guest" -> System.out.println("Hello, Guest!");
            default -> System.out.println("Please, select either 'ADMIN' or 'GUEST' mode for this program");
        }
    }
}
