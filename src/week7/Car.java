package week7;

public class Car {
    protected int num1 = 10;
    public String name = "Mustafa";
    private int num2 = 11;

    public void setNum2(int num2){
        this.num2 = num2; // this. is calling the variables in this class
        // this.getNum2();
    }

    public int getNum2(){
        return num2;
    }
}
