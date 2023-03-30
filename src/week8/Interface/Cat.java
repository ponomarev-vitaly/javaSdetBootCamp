package week8.Interface;

// Create new class Cat.
public abstract class Cat implements Animal, Mammal {
//    @Override
//    public void eat() {
//        System.out.println("Cats can eat fish.");
//    }
//
//    @Override
//    public void drink() {
//        System.out.println("Cats drink milk.");
//    }
// We do not have to implement all the methods from interface.
    @Override
    public void nurse() {
        System.out.println("Cats nurse their young child with milk.");
    }

    @Override
    public void blood() {
        System.out.println("Cats are warm-blooded.");
    }

    @Override
    public void heart() {
        System.out.println("Cats possess four-chambered heart.");
    }
}
