package week5.homework;

/**
 * Question 22. The result is: java: variable ans might not have been initialized. Problem in the line n2.
 */
public class TestQuestion22 {
    public static void main(String[] args) {
        int ans; // Pay attention to the variable! The variable must be initialized!!!
        try{
            int num = 10;
            int div = 0;
            ans = num / div;
        } catch (ArithmeticException ae) {
            ans = 0; // line n1
        } catch (Exception e) {
            System.out.println("Invalid calculation");
        }
        // System.out.println("Answer = " + ans); // line n2
    }
}
