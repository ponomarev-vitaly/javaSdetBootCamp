package week9.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// import static jdk.internal.org.jline.utils.Colors.s;

/**
 * Test question 43. Java certification program.
 * No, the code will not run as it has a syntax error.
 * The syntax to initialize an array in Java is by enclosing the values in curly braces {}, not parentheses ().
 * So, the line String[] arr = ("Hi", "How", "Are", "You"); should be corrected as follows:
 * Moreover, there is a syntax error in the lambda expression passed to the removeIf() method of arrList.
 * The return keyword is unnecessary and should be removed. Also, the variable s is not defined outside of the lambda expression,
 * so it cannot be printed in the println() statement. Instead, the code should use System.out.println(arrList + " removed");
 * to print the modified list.
 */
public class TestQuestion43 {
    public static void main(String[] args) {
//        String[] arr = ("Hi", "How", "Are", "You");
//        List<String> arrList = new ArrayList<>(Arrays.asList(arr));
//        if (arrList.removeIf((String s) -> (return s.length() <= 2;))){
//            System.out.println(s + "removed");
//        }
    }
}
