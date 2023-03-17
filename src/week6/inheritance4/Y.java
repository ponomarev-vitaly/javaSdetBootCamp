package week6.inheritance4;

import week6.inheritance3.C;

public class Y extends X
{
    static void staticMethod()
    {
        System.out.println("Class Y");
    }

    void method(){
        System.out.println("Not static method!");
    }
}


class MainClass
{
    public static void main(String[] args)
    {
        Y.staticMethod(); // Static method and Static variables we can call directly without creating an object.

        Y y = new Y(); // Instance variables and Non-static method we can reach through the object (!!!)
        y.method();
    }
}
