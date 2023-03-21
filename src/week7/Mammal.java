package week7;

public class Mammal extends Animal{
    public Mammal(int age){
        super(); // super() keyword is calling parent class constructor
        System.out.println("Child constructor called by this().");
    }

    public Mammal(){
        this(15); // this() keyword is calling the constructor inside this class
        System.out.println("Child constructor");
    }

    public Mammal(String name){
        this(); // super() and this() must be in one line of the constructor.
        System.out.println("Name parameter.");
    }

    public static void main(String[] args) {
        Object mammal = new Mammal(); // We can use Object (like FATHER from the class). We can use var to declare the object beginning from the 10th of Java.
// If we use Animal except Mammal we USE ALL THE FUNCTIONALITY of the parent class (all variables, objects, methods, etc.).
//        Mammal m2 = new Mammal(25); // We call parameterized constructor Mammal(int age), after that super() keyword calls the constructor from the parent class.
//        Mammal mammalName = new Mammal("John");
    }
}
