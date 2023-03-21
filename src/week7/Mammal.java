package week7;

public class Mammal extends Animal{
    public Mammal(int age){
        super();
        System.out.println("Child constructor called by this().");
    }

    public Mammal(){
        this(15);
        System.out.println("Child constructor");
    }

    public Mammal(String name){
        this(); // super() and this() must be in one line of the constructor.
        System.out.println("Name parameter.");
    }

    public static void main(String[] args) {
        Mammal mammal = new Mammal();
//        Mammal m2 = new Mammal(25); // We call parameterized constructor Mammal(int age), after that super() keyword calls the constructor from the parent class.
//        Mammal mammalName = new Mammal("John");
    }
}
