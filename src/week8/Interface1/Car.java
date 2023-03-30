package week8.Interface1;

public abstract class Car {
    // Created abstract method -> without body.
    public abstract void move();

    // Created concrete methods -> with body.
    public void diesel(){
        System.out.println("This car works with diesel.");
    }

    public void gas(){
        System.out.println("This car works with cas.");
    }
}
