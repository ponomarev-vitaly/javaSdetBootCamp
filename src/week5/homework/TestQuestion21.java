package week5.homework;

/**
 * Question № 21. D. java: non-static variable this cannot be referenced from a static context
 */
public class TestQuestion21 {

    public static void main(String[] args) {
        Vehicle v = new Bus(); // Child class object has the functionality of the parent class.
    }

}

class Vehicle { // Parent class.
    Vehicle() {
        System.out.println("Vehicle");
    }
}

class Bus extends Vehicle { // Child class.
    Bus() {
        System.out.println("Bus");
    }
}


