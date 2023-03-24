package week7.Vehicle;

public class Car extends Vehicle{

    private boolean isElectric;



    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public Car(String brand, String model, String numOfWheels, String numOfPassengers, String color, boolean isElectric, String vin){
        super(brand, model, numOfWheels, numOfPassengers, color, vin); // Order is important.
        this.isElectric = isElectric;
    }

    public Car(){

    }
    public String toString(){
        String temp = super.toString();
        temp += "This is " + (isElectric ? " electric " : "gasoline ") + "car.";
        return temp;
    }
}
