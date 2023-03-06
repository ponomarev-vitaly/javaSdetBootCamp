package week4.homework;

/**
 * 4. Write a Java program to concatenate a given string to the end of another string.
 * Sample Output:
 * String 1: PHP Exercises and
 * String 2: Python Exercises
 * The concatenated string: PHP Exercises and Python Exercises
 */
public class StringsConcatenation {
    public static void main(String[] args) {
        // Solution 1.
        String str1 = "PHP Exercises and";
        String str2 = "Python Exercises";
        System.out.println(str1 + " " + str2);
        // Solution 2.
        String str3 = "PHP Exercises and";
        String str4 = "Python Exercises";
        String space = " ";
        System.out.println(str3.concat(space).concat(str4)); // Concatenation of strings using String concat method.

    }
}
