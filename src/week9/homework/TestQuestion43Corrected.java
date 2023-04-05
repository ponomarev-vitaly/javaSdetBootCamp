package week9.homework;
import java.util.*;
public class TestQuestion43Corrected {
    /**
     * Test question 43. The important comment.
     * The removeIf() method removes all the elements from the list that satisfy the condition specified by the lambda expression.
     * In this case, the lambda expression s.length() <= 2 checks whether the length of the given string s is less than or equal to 2.
     * Therefore, in the original list, "Hi" has a length of 2, so it satisfies the condition and is removed.
     * "How", "Are", and "You" have lengths greater than 2, so they remain in the list. Hence, the resulting list is [How, Are, You].
     * Finally, the if statement checks whether any elements were removed from the list by the removeIf() method.
     * Since some elements were removed, the println() statement is executed, printing the modified list along with the message "removed".
     */
    public static void main(String[] args) {
        String[] arr = {"Hi", "How", "Are", "You"};
        List<String> arrList = new ArrayList<>(Arrays.asList(arr));
        if (arrList.removeIf((String s) -> s.length() <= 2)){
            System.out.println(arrList + " removed");
        }
    }
}


