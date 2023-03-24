package week4.homework;

/**
 *1. Write a Java program to get the character at the given index within the String.
 * Sample Output:
 * Original String = Java Exercises!
 * The character at position 0 is J
 * The character at position 10 is i
 *
 * 2.Write a Java program to compare two strings lexicographically. Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions.
 *
 * Sample Output:
 * String 1: This is Exercise 1
 * String 2: This is Exercise 2
 * "This is Exercise 1" is less than "This is Exercise 2"
 *
 *
 * 3. Write a Java program to compare two strings lexicographically, ignoring case differences.
 * Sample Output:
 * String 1: This is exercise 1
 * String 2: This is Exercise 1
 * "This is exercise 1" is equal to "This is Exercise 1"
 *
 * 4. Write a Java program to concatenate a given string to the end of another string.
 * Sample Output:
 * String 1: PHP Exercises and
 * String 2: Python Exercises
 * The concatenated string: PHP Exercises and Python Exercises
 *
 *
 * 5. Write a Java program to compare a given string to the specified string buffer.
 * Sample Output:
 * Comparing example.com and example.com: true
 * Comparing Example.com and example.com: false
 *
 * ************************************
 * 6. Write a Java program to check whether a given string ends with the contents of another string.
 * Sample Output:
 * "Python Exercises" ends with "se"? false
 * "Python Exercise" ends with "se"? true
 *
 * 7. Write a Java program to check whether two String objects contain the same data.
 * Sample Output:
 * "Stephen Edwin King" equals “Johny “Walker? false
 * "Stephen King" equals “Anthony Robin? false
 *
 * 8. Write a Java program to compare a given string to another string, ignoring case considerations.
 * Sample Output:
 * "Stephen Edwin King" equals “Johny “Walker? false
 * "Stephen King" equals “Stephen king? true
 *
 * 9. Write a Java program to get the contents of a given string as a character array.
 * Sample Output:
 * The char array equals "[C@2a139a55"
 *
 * // Refactor the task number 10.
 * 10. Write a Java program to get the index of all the characters of the alphabet.
 *
 * 11. Write a Java program to replace a specified character with another character.
 * Sample Output:
 * Original string: Java Programming Language.
 * New String: Java Script and Python
 *
 * 12. Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement.
 * Sample string : "The quick brown fox jumps over the lazy dog."
 * In the above string replace all the fox with cat.
 * Sample Output:
 * Original string: The quick brown fox jumps over the lazy dog.
 * New String: The quick brown cat jumps over the lazy dog.
 */
public class JavaStringExercises {
    public static void main(String[] args) {
        // 1st exercise.
        String originalString = "Java Exercises!";
        System.out.println(originalString.charAt(0));
        System.out.println(originalString.charAt(10));
        // 2nd exercise.
        String str1 = "This is Exercise 1";
        String str2 = "This is Exercise 2";
        if(str1.length()==str2.length()&&str1.contentEquals(str2)){
            System.out.println("String 1 and String 2 are lexicographically equal!");
        } else System.out.println("String 1 and String 2 are NOT lexicographically equal!");
        // 3rd exercise.
        String str3 = "This is Exercise 1";
        String str4 = "This is Exercise 1";
        if(str3.equalsIgnoreCase(str4)){
            System.out.println("String 1 and String 2 are lexicographically equal, ignoring case differences!");
        } else System.out.println("String 1 and String 2 are NOT lexicographically equal!");
        // 4th exercise.


    }
}
