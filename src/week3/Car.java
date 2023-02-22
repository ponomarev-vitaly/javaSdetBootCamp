package week3;

public class Car {
    // Instance variables/Global variables.
    int price$ = 3000;
    String make;
    String model;

    public static void main(String[] args) {


        // Create an object (object name is car1) from default constructor.
        Car car1 = new Car();
        car1.price$ = 5000;
        car1.make = "Honda";
        car1.model = "Civic";

        Car car2 = new Car();
        car2.price$ = 4000;
        car2.make = "Audi";
        car2.make = "Q5";

        Car car3 = new Car();
        car3.price$ = 3000;
        car3.make = "GMC";
        car3.model = "Yukon";

        System.out.println("car2 price : " + car2.price$);
        System.out.println("car2 make : " + car2.make);
        System.out.println("car2 model : " + car2.model);

        System.out.println("car1 price : " + car1.price$);
        System.out.println("car1 make : " + car1.make);
        System.out.println("car1 model : " + car1.model);

        System.out.println("car3 price : " + car3.price$);
        System.out.println("car3 make : " + car3.make);
        System.out.println("car3 model : " + car3.model);

    }
}
