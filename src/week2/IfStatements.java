package week2;

public class IfStatements {
    public static void main(String[] args) {
        int num = 15;
        if(num>10){
            System.out.println("num is greater than 10");
            System.out.println("num is greater than 10 that's why you are qualify to go to cinema");
        }

        if((num % 5) == 4){
            //if the condition is true and then execute the following line's code
            System.out.println("well done");
        }
        // if the condition is false, continue from the following line directly
        System.out.println("the code continues from this line");

    }
}
