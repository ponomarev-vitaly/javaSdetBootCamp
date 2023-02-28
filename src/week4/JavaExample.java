package week4;

public class JavaExample {
    // Static variables belong to class.
    static int i = 100; //The initialization of the static integer variable.
    static String s = "Beginnersbook";
    // Instance variable belongs to object.
    String name = "Ahmet";

    // Static method.
    static void display(){
        System.out.println("i: " + i);
        System.out.println("s: " + s);
        // System.out.println(name); // We can only call static variables. For instance variables we have to call through an object.
    }

    // non-static method
    void funcn(){
        // static methods can call in static methods.
        display();
    }

    // static main method
    public static void main(String[] args) {
        System.out.println("i: " + i);
        System.out.println("s: " + s);
        // Created an object from Java example class.
        JavaExample javaExample = new JavaExample();
        // We are calling instance variable through the object.
        System.out.println(javaExample.name); // Non-static variable can not be reached.
        // We need to call non-static methods through the object.
        javaExample.funcn();
        display(); // We can call static methods directly from static methods.
        // funcn(); // Non-static method can not be called. We need to create an object.
    }

}
