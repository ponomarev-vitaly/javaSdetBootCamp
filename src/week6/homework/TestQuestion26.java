package week6.homework;

/**
 * Question 26.
 */
public class TestQuestion26 {
    Character c;
    boolean b;
    float f;

    int x; // Can work in such way, because the x variable is out of the void printAll() scope.
    void printAll() {
        // int x; // It won't work like this, because we have to initialize the x variable.
        System.out.println(x);
        System.out.println("c = " + c);
        System.out.println("b = " + b);
        System.out.println("f = " + f);
    }

    public static void main(String[] args) {
        TestQuestion26 f = new TestQuestion26();
        f.printAll();
    }
}
