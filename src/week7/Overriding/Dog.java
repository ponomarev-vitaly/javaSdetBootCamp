package week7.Overriding;

public class Dog extends Animal {
    public void sound(){
        System.out.println("Dogs bark load...");
        super.sound();
    }
}
