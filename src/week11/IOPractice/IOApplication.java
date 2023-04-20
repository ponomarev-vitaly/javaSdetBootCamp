package week11.IOPractice;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class IOApplication {
    private static boolean isMainMenu = true;
    private static boolean isStatMenu = false;
    private static boolean isProfileMenu = false;
    private static boolean isLoginMenu = false;
    private static boolean isCreateMenu = false;
    private static String input = "";
    private static Scanner scan = new Scanner(System.in);
    private static HashMap<String, String> allUsers = new HashMap<>();

    public static void main(String[] args) {
        updateUserSystem();
        // Change false to true and back gives an opportunity to create the user or the manager.
//        User test1 = new User("test1", "test", "one", 123123, false);
        User test2 = new User("newManager", "test", "two", 456456, true);
//        User test3 = new User("test3", "test", "one", 123456, false);
//        User test4 = new User("test4", "test", "one", 555333, true);
//        User test5 = new User("test5", "test", "one", 777777, false);

        while (input.compareTo("P") != 0){
            if(isMainMenu){
                mainMenu();
            }else if(isCreateMenu){
                createMenu();
            }else if(isLoginMenu){
                System.out.println("PLace logic for Login Menu");
            }else if(isProfileMenu){
                System.out.println("PLace logic for Profile Menu");
            }
        }

    }

    public static void updateUserSystem(){
        int managerCounter = 0;
        int userCounter = 0;

        File files = new File(User.getLocation());

        for(File file: files.listFiles()) {
            String fileName = file.getName();
            if (fileName.contains(".txt")) {

                fileName = file.getName();
                int found = findTheNumber(fileName);
                if (fileName.substring(0, 2).compareTo("M_") == 0) {
                    if(managerCounter < found){
                        managerCounter = found;
                    }
                }
                if (fileName.substring(0, 2).compareTo("U_") == 0) {
                    if(userCounter < found){
                        userCounter = found;
                    }
                }
            }
        }
        User.setManagerID(managerCounter);
        User.setUserID(userCounter);
        System.out.println(allUsers);
    }

    public static int findTheNumber(String fileName){
        int firstUS = fileName.indexOf("_");
        int secondUS = fileName.indexOf("_",firstUS + 1);
        int found = Integer.parseInt(fileName.substring(firstUS+1, secondUS));
        return found;
    }

//    public static void getAllUsers(String fileName){
//        int firstUS = fileName.indexOf("_");
//        int secondUS = fileName.indexOf("_",firstUS + 1);
//        int found = Integer.parseInt(fileName.substring(secondUS+1, dotTxt));
//        allUsers.put(uName, fileName);
//    }

    public static void mainMenu(){
        System.out.println("\n\n\n-------------------- USER APPLICATION --------------------");
        System.out.println("\n\n\n-------------------- MAIN MENU ---------------------------");
        System.out.println("(C)reate a User");
        System.out.println("(L)ogin");
        System.out.println("(S)tatistics");
        System.out.println("(P)ower off");
        System.out.println("*<------------------------------------------------------------>*");

        input = scan.nextLine().toUpperCase().substring(0,1);
        if(input.compareTo("C")==0){
            isMainMenu = false;
            isCreateMenu = true;
        } else if (input.compareTo("L")==0){
            isMainMenu = false;
            isCreateMenu = true;
        } else if (input.compareTo("S")==0){
            statMenu();
        }
    }

    public static void statMenu(){
        System.out.println("\n\n\n-------------------- USER APPLICATION --------------------");
        System.out.println("\n\n\n-------------------- STATISTICS --------------------------");
        System.out.println("Number of Managers: " + User.getManagerID());
        System.out.println("Number of Users: "+ User.getUserID());
        System.out.println("*<------------------------------------------------------------>*");
    }

    public static void createMenu(){
        String uName = "";
        String fName = "";
        String lName = "";
        int pass = 0;
        boolean isManager = false;

        System.out.println("\n\n\n-------------------- USER APPLICATION --------------------");
        System.out.println("\n\n\n-------------------- CREATE USER -------------------------");
        boolean repeat = false;
//        do {
//            if(repeat){
//                System.out.println(input + " username already present in the system. Please enter different username.");
//            }
//            repeat = true;
//            System.out.println("Username > ");
//            input = scan.nextLine().toUpperCase();
//        } while (allUsers.containsKey(input);
        uName = input;
        System.out.println("First Name > ");
        fName = scan.nextLine().toUpperCase();
        System.out.println("Last Name > ");
        lName = scan.nextLine().toUpperCase();
        System.out.println("Password > ");
        // pass = scan.nextLine().toUpperCase();
        System.out.println("Is Manager (T/F) > ");
        isManager = scan.nextLine().toUpperCase().compareTo("T") == 0 ? true: false;

        new User(uName, fName, lName, pass, isManager);
        System.out.println("Do you want to create a new user (Y/N) > ");
        if(scan.nextLine().toUpperCase().compareTo("N") == 0){
            isCreateMenu = false;
            isMainMenu = true;
        }

    }
}
