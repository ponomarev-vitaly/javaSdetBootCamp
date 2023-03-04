package week4;

public class MainThis {
    int instVar;

    MainThis (int instVar){
        this.instVar = instVar;
        System.out.println("This reference: " + this);
    }

    public static void main(String[] args){
        MainThis obj = new MainThis(8);
        System.out.println("Object reference: " + obj);
    }
}
