package week1;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int total = 20 + 5; // total is 25
        System.out.println(total);
        int num1 = 30;
        int num2 = 20;
        int total1 = 10 + num2; // total is 30
        System.out.println(total1);
        int total2 = num1 + num2; // total is 50
        System.out.println(total2);
        // let's have a look at subtraction
        int result = 20 - 5; //result is 15
        int num3 = 30;
        int num4 = 20;
        int result1 = 40 - num4; //result is 20
        int result2 = num3 - num4; //result is 10 now
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        // let's have a look at %Modulus, Increment, Decrement
        int mod = 20 % 3;
        // --> 20/3 = 6 (2 remainder)
        // --> mod = 2
        System.out.println(mod);
        int randomNumber = 1;
        int num5 = ++randomNumber;
        System.out.println(num5);
        int num6 = randomNumber++;
        System.out.println(num6); // It seems there is no difference between the ++ before the variable and after.
        int anotherRandomNumber = 46;
        int num7 = --anotherRandomNumber;
        System.out.println(num7);
        int num8 = anotherRandomNumber--;
        System.out.println(num8); //Now let's try out the decrement.


    }
}
