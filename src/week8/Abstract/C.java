package week8.Abstract;

public class C extends B{
    @Override
    void thirdMethod()
    {
        System.out.println("THIRD");
    }
    public static void main(String[] args)
    {
        C c = new C();

        c.firstMethod();

        c.secondMethod();

        c.thirdMethod();
    }
}
