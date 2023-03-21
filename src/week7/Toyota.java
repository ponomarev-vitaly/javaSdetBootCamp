package week7;

public class Toyota extends Car{

    protected int num3 = 12;
    public String name2 = "Vitalii";
    private int num4 = 13;

    public Toyota(){
        System.out.println(this.num1);
        System.out.println(super.num1);

        System.out.println(this.getNum2());
        System.out.println(super.getNum2());

        this.setNum2(23);

        System.out.println(this.getNum2());
        System.out.println(super.getNum2());

        super.setNum2(55);
        System.out.println(this.getNum2());
        System.out.println(super.getNum2());

        System.out.println(this.num3);
        System.out.println(this.num4); // We can not call the same class with the super keyword.

        System.out.println(this.name);
        System.out.println(super.name);

        System.out.println(this.name2);
    }
    public static void main(String[] args) {
        Car car = new Car(); // In static method we can call only static methods and variables. In other case we have to use object.
        int num2 = car.getNum2();
        car.setNum2(50);
        Toyota toyota = new Toyota();
    }
}
