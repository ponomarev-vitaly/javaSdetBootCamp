package week4.homework;

import java.util.Arrays;

/**
 * 6. Write a Java program to check whether a given string ends with the contents of another string.
 * Sample Output:
 * "Python Exercises" ends with "se"? false
 * "Python Exercise" ends with "se"? true
 */
public class JavaStringExercises1 {
    public static void main(String[] args) {
        String theEndOfTheString = "se";

        String str = "Python Exercises";
        String str1 = "Python Exercise";
        StringBuffer sb = new StringBuffer(str);
        StringBuffer sb1 = new StringBuffer(str1);
        
        int n = sb.length();
        int m = sb1.length();

        char temp = ' ';
        for (int i = 0; i < n; i++) {
            if(i == n-2) {
                temp += sb.charAt(i);
            }
        }
        System.out.println(Arrays.toString(new char[]{temp}));

//        System.out.println(str2);
//        System.out.println(str3);
//
//        System.out.println("\"Python Exercises\" ends with \"se\"? " + str2.equals(theEndOfTheString));
//        System.out.println("\"Python Exercise\" ends with \"se\"? " + str3.equals(theEndOfTheString));
    }
}
