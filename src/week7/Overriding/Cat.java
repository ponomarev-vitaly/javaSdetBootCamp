package week7.Overriding;

public class Cat extends Animal{
    // overriding methods
    public void sound(){
        System.out.println("Cat says Meow...");
    }

    public int testing(){
        return 0;
    }

    public Cat test2(){ // Because Cat is a subset of Animal.
        return this;
    }
}
