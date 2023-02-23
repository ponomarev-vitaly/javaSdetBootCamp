package week3;

public class Main {

        public static void main(String[] args) {

            // create objects led and halogen
            Lamp led = new Lamp();
            Lamp halogen = new Lamp();

            // turn on the light by
            // calling method turnOn()
            led.turnOn();

            // turn off the light by
            // calling method turnOff()
            halogen.turnOff();
        }
}

