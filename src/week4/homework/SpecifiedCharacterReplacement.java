package week4.homework;

/**
 * 11. Write a Java program to replace a specified character with another character.
 * Sample Output:
 * Original string: Java Programming Language.
 * New String: Java Script and Python
 */
public class SpecifiedCharacterReplacement {
    public static void main(String[] args) {
        String str = "Java Programming Language.";
        System.out.println(str);
        String str1 = str.replace("Programming Language.", "Script and Python");
        System.out.println(str1);
    }
}

