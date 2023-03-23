package week7.Vehicle;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleApp {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Vehicle> vehicles = new ArrayList<>();
    public static void main(String[] args) {
        // scan.next(); // To call the Scanner object class from the main method there's another option: create an object, call the method.
        int option = -1;

        while(option != 0){
            option = mainMenu();
            switch (option){
                case 1:
                    addCar();
                    break;
                case 2:
                    addTruck();
                    break;
                case 5:
                    listAll();
                    break;
            }
            for(Vehicle v: vehicles){
                v.toString();
            }
        }
    }

    public static int mainMenu(){
        int input = 0;
        System.out.println("-----------------MAIN MENU----------------");
        System.out.println("1. Add Car");
        System.out.println("2. Add Truck");
        System.out.println("3. Add Boat");
        System.out.println("4. Add Plane");
        System.out.println("5. List All");
        System.out.println("6. List By Type");
        System.out.println("7. List By Brand");
        System.out.println("8. Remove Vehicle");
        System.out.println("0. EXIT");
        System.out.println("-------------------------------------------");
        input = scan.nextInt();
        return input;
    }

    public static void addCar(){
        // String brand, String model, int NOW, int NOP, String color, boolean isElectric, String VIN
        System.out.print("Enter the brand ...> ");
        String brand = scan.next();
        System.out.print("Enter the model ...> ");
        String model = scan.next();
        System.out.print("Enter number of wheels ...> ");
        int NOW = scan.nextInt();
        System.out.print("Passengers cap. ...> ");
        int NOP = scan.nextInt();
        System.out.print("Enter the color ...> ");
        String color = scan.next();
        System.out.print("(E) Electric (X) Gasoline ...> ");
        String gas = scan.next();
        boolean electric = gas.compareToIgnoreCase("E") == 0 ? true : false;
        System.out.print("Enter the VIN ...> ");
        String VIN = scan.next();

        Car temp = new Car(brand, model, NOW, NOP, color, electric, VIN);
        vehicles.add(temp);
    }

    public static void addTruck(){
        // String brand, String model, int NOW, int NOP, String color, boolean isElectric, String VIN
        System.out.print("Enter the brand ...> ");
        String brand = scan.next();
        System.out.print("Enter the model ...> ");
        String model = scan.next();
        System.out.print("Enter number of wheels ...> ");
        int NOW = scan.nextInt();
        System.out.print("Passengers cap. ...> ");
        int NOP = scan.nextInt();
        System.out.print("Enter the color ...> ");
        String color = scan.next();
        System.out.print("(E) Electric (X) Gasoline ...> ");
        String gas = scan.next();
        boolean electric = gas.compareToIgnoreCase("E") == 0 ? true : false;
        System.out.print("Enter the VIN ...> ");
        String VIN = scan.next();
        System.out.println("Enter the Load ...> ");
        int load = scan.nextInt();

        Truck temp = new Truck(brand, model, NOW, NOP, color, electric, VIN, load);
        vehicles.add(temp);
    }

    public static  void listAll(){
        int counter = 1;
        for(Vehicle v : vehicles){
            System.out.println((counter++) + " -> " + v.toString() );
        }
    }
}
