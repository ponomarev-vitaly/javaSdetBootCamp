package week7.PolyRiding;

public class InputDevices {
    // private void whatIdo(){ // Private methods can not be accessed via objects and can not be overridden.
    // public final void whatIdo(){ // If a method is final we are not able to override that method.
    // private static void whatIdo(){ // If a method is static we are not able to override that method.
    public void whatIdo(){ // protected method - in case if we want to access from 2 different packages, we are going to fail.
        System.out.println("I collect inputs from user and pass it to the device.");
    }

    public InputDevices justATest(){
        System.out.println("I am just a test method from the input devices class.");
        return new InputDevices();
    }
}
