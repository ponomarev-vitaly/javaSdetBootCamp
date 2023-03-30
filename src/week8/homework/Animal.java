package week8.homework;

/**
 *
 */
public class Animal {
    String type = "Canine";
    int maxSpeed = 60;

    Animal () {}

    Animal (String type, int maxSpeed){
        this.type = type;
        this.maxSpeed = maxSpeed;
    }
}

class WildAnimal extends Animal {
    String bounds;

    WildAnimal (String bounds){
        super(); // If super is after this we get an error: call to super must be first statement in constructor
        this.bounds = bounds;
//        this ("Canine", 60); // We have to change signature of WildAnimal(String, int) or create constructor in WildAnimal.
//        this.bounds = bounds;
    }

    WildAnimal (String type, int maxSpeed, String bounds) {
        super (type, maxSpeed);
        this.bounds = bounds; // if we use this (bounds); together with the super line of code we get an error, because this() or super() must be on the first place in the constructor.
    }
}

class Main {
    public static void main(String[] args) {
        WildAnimal wolf = new WildAnimal("Long");
        WildAnimal tiger = new WildAnimal("Feline", 80, "Short");
        System.out.println(wolf.type + " " + wolf.maxSpeed + " " + wolf.bounds);
        System.out.println(tiger.type + " " + tiger.maxSpeed + " " + tiger.bounds);
    }
}
