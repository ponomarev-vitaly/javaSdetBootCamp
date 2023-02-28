package week4;
public class Car { // We created the Car class.
    int price; // Default value is zero.
    String make; // Default value is null.
    String model;

    public Car() { // We created the constructor.
        this.price = 2000;
        this.make = "Honda";
        this.model = "Civic";
    }

    public Car(int price, String make, String model) {
        this.price = price;
        this.make = make;
        this.model = model;
    }

    public Car(int price) {
        this.price = price;
    }

    public Car(int price, String make) {
        this.price = price;
        this.make = make;
    }


    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.price);
        System.out.println(car1.make);
        System.out.println(car1.model);

        Car car2 = new Car(5000, "Audi", "Q5");
        System.out.println(car2.price);
        System.out.println(car2.make);
        System.out.println(car2.model);

        Car car4 = new Car();
        System.out.println("Car 4 price: " + car4.price);
        System.out.println(car4.make);
        System.out.println(car4.model);

        Car car3=  new Car(4000, "GMC");
        System.out.println("Car3 price: " + car3.price);
        System.out.println(car3.make);
        System.out.println(car3.model);

    }
}
