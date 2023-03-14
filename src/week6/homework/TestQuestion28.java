package week6.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Question 28.
 */
public class TestQuestion28 {
    public static void main(String[] args) {
        String[] arr = {"Hi", "How", "Are", "You"};
        List<String> arrList = new ArrayList<>(Arrays.asList(arr));
        if(arrList.removeIf(s -> {System.out.print(s); return s.length() <= 1;})) { // s.length compares the length of ArrayList's element.
            System.out.println(" removed");
        }
    }
}
