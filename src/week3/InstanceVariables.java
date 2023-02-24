package week3;

public class InstanceVariables {
    public int a = 20; // Instance variable or Global variable: outside the methods, but inside the class.
    public static int c; // Instance variable or Global Variable.
    public float pi = 3.14f; // Instance variable or Global Variable.
    double d = 76.22d; // Instance variable or Global Variable.

    /*
    1 - Local Variable
    2 - Instance Variable or Global Variable
    3 - Static Variable
     */

    /*

     */

    // InstanceVariables iobj = new InstanceVariables();

    public static void main(String[] args) {
        int a = 15; // Local variable
        double dNumber = 5.5; // Local variable
    }

    public void test(){
        int x = 45; // Local variable
        System.out.println(x);
    }

    // Code block or scope
    {
        int number = 55; // Local variable
    }


}
