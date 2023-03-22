package week7.Question8;

public class MethodOverriding {
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        y.m2();
        x.m1();
        y.m1();
        x = y;
        x.m1(); // We call 1 method from the child class Y.
    }
}
