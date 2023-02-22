package week3;

public class MyClass {
    static int num1;
    static String name = "Ali";

    public static void main(String[] args) {
        add();
 //       product(5);
    }

    public static int add() {
        num1++; // From the static method we can only reach static variables.
        int num2 = 6;
        char letter;
        System.out.println("Do addition" + num2);
        return 0;
    }

    public void product(int num3){
        name = "Veli";
        int num2 = 10; // num2 is local variable. We have to give an initial value to num2 variable.
        num2++;
        System.out.println(num3 * num3);

    }
}
