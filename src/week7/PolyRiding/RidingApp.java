package week7.PolyRiding;

public class RidingApp {
    public static void main(String[] args) {
        /**
         * Polymorphism = Overloading + Overriding
         * overriding =>    Happens between parent and child classes.
         *                  Method name and parameters are supposed the same.
         *                  But functionality of method changes based on the needs of child class.
         * Gokhan -> Driver, Father, photographer
         */

        InputDevices dev01 = new InputDevices();
        Keyboard dev02 = new Keyboard();
        Microphone dev03 = new Microphone();

        dev01.whatIdo(); // We were trying to access private method this time, but failed.
        dev02.whatIdo(); // If we define
        dev03.whatIdo();

        dev01.justATest();
        dev02.justATest();

        //String str1 = new String("Testing");

        //str1.substring();
    }
}
