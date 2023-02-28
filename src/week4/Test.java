package week4;

public class Test {
    static int i;
    int j;
    // static block:
    static{
        i = 10;
        System.out.println("Static block called ");
    }
    Test(){
        System.out.println("Constructor called ");
    }
    // We created inner main class.
    class Main{
        public static void main(String[] args) {
            // Although we have two objects, static block is executed only once.
            Test t1 = new Test();
            Test t2 = new Test();


        }

    }
}
