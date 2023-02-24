package week3.homework;

public class ConstructorTourists {
    // Fields/instance variables
    String name;
    String familyName;
    String phoneNumber;
    String email;
    String touristPackage;
    int price;

    // Create constructor to get info about the tourist and the tourist package.

    public ConstructorTourists(String name, String familyName, String phoneNumber, String email, String touristPackage, int price) {
        this.name = name;
        this.familyName = familyName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.touristPackage = touristPackage;
        this.price = price;
    }

    // Print info about the tourist and the tourist package.
    public ConstructorTourists(String name, String familyName, String phoneNumber, String touristPackage) {
        this.name = name;
        this.familyName = familyName;
        this.phoneNumber = phoneNumber;
        this.touristPackage = touristPackage;
    }

    public static void main(String[] args) {

    }
}
