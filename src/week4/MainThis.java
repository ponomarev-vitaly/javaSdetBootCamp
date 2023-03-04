package week4;

public class MainThis {
    int instVar;

//    MainThis (int instVar){ // In the constructor we have paremeter.
//        this.instVar = instVar;
//        System.out.println("This reference: " + this.instVar);
//    }
    MainThis(int instVar){
        instVar = instVar;
    }
    MainThis(){ // Create default constructor.

    }

    public static void main(String[] args){
        MainThis obj = new MainThis(15); // We assigned the value.
        System.out.println("Object reference: " + obj.instVar);
    }
}
