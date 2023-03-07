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
        /**
         * 12. Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement.
         * Sample string : "The quick brown fox jumps over the lazy dog."
         * In the above string replace all the fox with cat.
         * Sample Output:
         * Original string: The quick brown fox jumps over the lazy dog.
         * New String: The quick brown cat jumps over the lazy dog.
          */
        String str2 = "The quick brown fox jumps over the lazy dog.";
        System.out.println(str2);
        String str3 = str2.replace("fox", "cat");
        System.out.println(str3);
    }
}

