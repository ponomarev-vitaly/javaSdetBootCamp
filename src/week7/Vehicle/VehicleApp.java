package week7.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleApp {
    static Scanner scan = new Scanner(System.in);
    static List<Vehicle> vehicles = new ArrayList<>(); // The name of the constructor in this line is after equals sign.
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
                case 8:
                    removeVehicle();
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
        String numOfWheels = scan.next();
        System.out.print("Passengers cap. ...> ");
        String numOfPassengers = scan.next();
        System.out.print("Enter the color ...> ");
        String color = scan.next();
        System.out.print("(E) Electric (X) Gasoline ...> ");
        String gas = scan.next();
        boolean electric = gas.compareToIgnoreCase("E") == 0 ? true : false;
        System.out.print("Enter the VIN ...> ");
        String vin = scan.next();

        Car temp = new Car(brand, model, numOfWheels, numOfPassengers, color, electric, vin);
        vehicles.add(temp);
    }

    public static void addTruck(){
        // String brand, String model, int NOW, int NOP, String color, boolean isElectric, String VIN
        System.out.print("Enter the brand ...> ");
        String brand = scan.next();
        System.out.print("Enter the model ...> ");
        String model = scan.next();
        System.out.print("Enter number of wheels ...> ");
        String numOfWheels = scan.next();
        System.out.print("Passengers cap. ...> ");
        String numOfPassengers = scan.next();
        System.out.print("Enter the color ...> ");
        String color = scan.next();
        System.out.print("(E) Electric (X) Gasoline ...> ");
        String gas = scan.next();
        boolean electric = gas.compareToIgnoreCase("E") == 0 ? true : false;
        System.out.print("Enter the VIN ...> ");
        String vin = scan.next();
        System.out.println("Enter the Load ...> ");
        int load = scan.nextInt();

        Truck temp = new Truck(brand, model, numOfWheels, numOfPassengers, color, electric, vin, load);
        vehicles.add(temp);
    }

    public static  void listAll(){
        int counter = 1;
        for(Vehicle v : vehicles){
            System.out.println((counter++) + " -> " + v.toString() );
        }
    }

    public static boolean removeVehicle(){ // We should apply to the unique number - like VIN.
        boolean flag = false;
        System.out.println("Please enter VIN number to remove.");
        String vinRemove = scan.next();

        for (Vehicle v:vehicles // w - vehicles is listed one by one.
             ) {
            if (v.equals(vinRemove)){
                System.out.printf(String.valueOf(v));
                vehicles.remove(v);
                flag = true;
            }
        }
        return flag;
    }
}
