package week7.PolyLoad;

public class GreetingApp {
    public static void main(String[] args) {
        /**
         * Polymorphism = Overloading + Overriding
         * overloading => Method name is same, but number or type of parameters are different.
         * Gokhan -> Driver, Father, photographer
         */

        Greetings gr01 = new Greetings();

        gr01.greet();
        gr01.greet("John");
        gr01.greet("John", "Doe");
        gr01.greet("Angela", "Smith", true);

    }
}
