package week4;

public class JavaExample {
    static int i = 10; //The initialization of the static integer variable.
    static String s = "Beginnersbook";
    String name = "Ahmet";

    public static void main(String[] args) {
        System.out.println("i: " + i);
        System.out.println("s: " + s);
        // Created an object from Java example class.
        JavaExample javaExample = new JavaExample();
        // We are calling instance variable through the object.
        System.out.println(javaExample.name); // Non-static variable can not be reached.
    }

}
