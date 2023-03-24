package week7.Vehicle;

public class Truck extends Car{
    private int load;

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    public Truck(String brand, String model, String numOfWheels, String numOfPassengers, String color, boolean isElectric, String vin, int load) {
        super(brand, model, numOfWheels, numOfPassengers, color, isElectric, vin);
        this.load = load;
    }

    public String toString(){
        String temp = super.toString();
        String temp2 = temp.replace("car", "truck");
        return temp2;
    }
}
