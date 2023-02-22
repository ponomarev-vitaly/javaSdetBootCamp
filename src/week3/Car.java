package week3;

public class Car {
    // Instance variables/Global variables.
    int price$ = 3000;
    String make;
    String model;

    public Car(int price$, String make, String model) {
        this.price$ = price$;
        this.make = make;
        this.model = model;
    }

    public Car() {
        this.price$ = 1000;
        this.make = "TOYOTA";
        this.model = "Corolla";
    }

    public Car(int price$, String model){
        this.price$ = price$;
        this.model = model;
        this.make = "Camaro";
    }

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

        Car car4 = new Car(5500,  "KIA", "Sportage");

        System.out.println("car4 price : " + car4.price$);
        System.out.println("car4 make : " + car4.make);
        System.out.println("car4 model : " + car4.model);

        Car car5 = new Car();
        Car car6 = new Car(8800, "Volkswagen", "Atlas");
        Car car7 = new Car(11500, "Chevrolet");

        System.out.println(car5.price$);
        System.out.println(car5.make);
        System.out.println(car5.model);

        System.out.println(car6.price$);
        System.out.println(car6.make);
        System.out.println(car6.model);

        System.out.println(car7.price$);
        System.out.println(car7.make);
        System.out.println(car7.model);

    }
}
