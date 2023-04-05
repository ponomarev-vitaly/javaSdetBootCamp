package week9.homework;

/**
 * This is question from the Java certification program. Given the code fragment.
 * And given the requirements:
 * If the value of the qty variable is greater than or equal to 90, discount = 0.5
 * If the value of the qty variable is between 80 and 90, discount = 0.2
 * Which two code fragments can be independently placed at line n1 to meet the requirements? Choose two.
 */
public class TestQuestion59 {
    public static void main(String[] args) {
        /**
         * This code fragment initializes a double variable discount with a value of zero and
         * an integer variable qty with a value obtained from the command-line argument at index 0.
         * The main method is a special method in Java that serves as the entry point of a Java program.
         * It takes an array of String objects as a parameter, which is typically used to pass command-line arguments to the program.
         * In this code, the args array is used to retrieve the value of the first command-line argument,
         * which is assumed to be an integer value.
         * This value is then converted to an int using the Integer.parseInt method and stored in the qty variable.
         * Note that if no arguments are provided when the program is run, this code will throw a java.lang.ArrayIndexOutOfBoundsException
         * because args[0] will be out of bounds.
         */
        double discount = 0;
        int qty = Integer.parseInt(args[0]);
        // line n1
        if(qty >= 90) {discount = 0.5; } // The result is Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException. It's not A.
        if(qty>80 && qty<90) {discount = 0.2; }
//        discount = (qty >= 90) ? 0.5:0; // The result is Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException. Probably, it's not B.
//        discount = (qty > 80) ? 0.2 : 0;
//        discount = (qty >= 90) ? 0.5 : (qty > 80)? 0.2:0;// The result is Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException.
//        if (qty > 80 && qty < 90){ // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
//            discount = 0.2;
//        } else {
//            discount = 0;
//        }
//        if (qty >= 90) {
//            discount = 0.5;
//        } else {
//            discount = 0;
//        }
//        discount = (qty > 80) ? 0.2 : (qty >= 90) ? 0.5 : 0; // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
    }
}
