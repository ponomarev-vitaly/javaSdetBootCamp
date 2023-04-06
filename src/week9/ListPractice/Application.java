package week9.ListPractice;

import java.util.LinkedList;
import java.util.Scanner;

public class Application {
    static Scanner scan = new Scanner(System.in);
    static boolean inMainMenu = true;
    static boolean inListsMenu = false;
    static LinkedList<Lists> listHolder = new LinkedList<Lists>();
    static String input = "";

    public static void main(String[] args) {
        while(input.compareTo("P") != 0){
            if(inMainMenu){
                mainMenuOptions();
            }

            if(inListsMenu){
                listsMenuOptions();
            }
        }
    }

    public static void listsMenuOptions(){
        System.out.println("\n\n\n---------------------All Lists--------------------");
        int counter = 1;
        for(Lists lst : listHolder){
            System.out.println((counter++) + ". " + lst.getlName() + " (" + lst.S() + " items ) ");
        }

        System.out.print("--M------------------------------------------------");

        input = scan.next();

        if(input.compareTo("M") == 0){
            inMainMenu = true;
            inListsMenu = false;
        }
    }

    public static void mainMenuOptions(){
        System.out.println("\n\n\n---------------------MAIN MENU--------------------");
        System.out.println("1. Create List.");
        System.out.println("2. Lists Menu.");
        System.out.print("--P------------------------------------------------");

        input = scan.next();

        if(input.compareTo("1")==0){
            System.out.print("Enter List Name > ");
            input = scan.next();
            listHolder.add(new Lists(input));
        }else if(input.compareTo("2")==0){
            inMainMenu = false;
            inListsMenu = true;
        }
    }
}
