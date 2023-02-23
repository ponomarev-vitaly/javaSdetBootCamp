package week3;

public class Lamp {

        // stores the value for light
        // true if light is on
        // false if light is off
        boolean isOn;

        // method to turn on the light
        void turnOn() {
            isOn = true;
            System.out.println("Light on? " + isOn);

        }

        // method to turnoff the light
        void turnOff() {
            isOn = false;
            System.out.println("Light on? " + isOn);
        }
}

