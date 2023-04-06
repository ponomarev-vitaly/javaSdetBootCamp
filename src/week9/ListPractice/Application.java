package week9.ListPractice;

import week8.Interface1.Inside;

import java.util.LinkedList;
import java.util.Scanner;

public class Application {
    static Scanner scan = new Scanner(System.in);
    static boolean inMainMenu = true;
    static boolean inListsMenu = false;
    static boolean theListsMenu = false;
    static LinkedList<Lists> listHolder = new LinkedList<Lists>();
    static String input = "";
    static int selectedList;

    public static void main(String[] args) {
        while(input.compareTo("P") != 0){
            if(inMainMenu){
                mainMenuOptions();
            }

            if(inListsMenu){
                listsMenuOptions();
            }

            if(inListsMenu){
                listsMenuOptions();
            }

            if(theListsMenu){
                listHolder.get(selectedList).D();
                listInteraction();
            }
        }
    }

    public static void listInteraction(){
        System.out.println("--A--AF--AL--I--R--RF--RL--I--SW--I--L-- ");
        input = scan.next();
        if(input.compareTo("A")==0){
            System.out.println("Please enter an item >");
            input = scan.next();
            listHolder.get(selectedList).A(input);
        } else if(input.compareTo("L") == 0){
            inMainMenu = false;
            inListsMenu = false;
            theListsMenu = false;
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
        }else {
           selectedList = Integer.parseInt(input) - 1;
           if(selectedList>0){
               inMainMenu = false;
               inListsMenu = false;
               theListsMenu = true;
           }
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
