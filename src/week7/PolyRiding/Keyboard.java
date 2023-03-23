package week7.PolyRiding;

public class Keyboard extends InputDevices{

    // protected void whatIdo(){ // Access modifier cannot be more restrictive than parent access modifier.
    // public int whatIdo(){ // Return types should be in the range what parent ethod dictates.
    public void whatIdo(){
        System.out.println("I have buttons that user can type text.");
        // return 0;
    }

    public Keyboard justATest(){
        // This works because the return types are from the same parent (InputDevices) this can be overridden.
        System.out.println("I am just a test method from the keyboard class.");
        return new Keyboard();
    }
}
