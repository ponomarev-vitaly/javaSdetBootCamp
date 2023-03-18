package week6.inheritance5;

public class Y extends X{
    public Y(int i) {
        //
        super(i); // If we have a constructor in the parent class, we have to call it with the super keyword. Ex.: super(the value/variable);
        System.out.println(2);
    }
}

