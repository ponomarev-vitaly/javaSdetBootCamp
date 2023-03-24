package week7.Vehicle;

public class Vehicle {
    private String brand;
    private String model;
    public String numOfWheels;
    public String numOfPassengers;
    private String color;

    public String vin;

//    public String getBrand() {
//        return brand;
//    }
//
//    public void setBrand(String brand) {
//        this.brand = brand;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public int getNumOfWheels() {
//        return numOfWheels;
//    }
//
//    public void setNumOfWheels(int numOfWheels) {
//        this.numOfWheels = numOfWheels;
//    }
//
//    public int getNumOfPassengers() {
//        return numOfPassengers;
//    }
//
//    public void setNumOfPassengers(int numOfPassengers) {
//        this.numOfPassengers = numOfPassengers;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Vehicle(String brand, String model, String numOfWheels, String numOfPassengers, String color, String vin){
        this.brand = brand;
        this.model = model;
        this.numOfWheels = numOfWheels;
        this.numOfPassengers = numOfPassengers;
        this.color = color;
        this.vin = vin;
    }

    public Vehicle(){

    }

    public String toString(){
        return brand + " " + model + " ( " + color + " ) has " +
                numOfPassengers + " passenger capacity. It has " + numOfWheels + " wheels.";
    }
}
