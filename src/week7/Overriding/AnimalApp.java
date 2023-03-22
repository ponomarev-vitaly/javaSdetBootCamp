package week7.Overriding;

public class AnimalApp {
    public static void main(String[] args) {
        /*
        Overriding is about redeveloping the method for the child class,
        that was earlier defined in the parent class.
         */
        Animal bird = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();

        bird.sound();
        cat.sound(); // In such case we call the sound method from the Cat class, not from the parent class.
        dog.sound();

        // System.out.println(bird.toString());
    }
}
