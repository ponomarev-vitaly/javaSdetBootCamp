package week4;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String string1 = "Java";
        String string2 = "    Python";
        String string3 = "Java Script";

        // Length of String > .length
        int stringLength = string1.length();
        System.out.println("string1 length is: " + stringLength);

        // equals() method:
        boolean equalOrNot = string1.equals("Java");
        System.out.println(equalOrNot);

        // charAt() method:
        char charAtReturn = string2.charAt(5); // In case we put the number more than the range of the word we get an Error: StringIndexOutOfBoundsException.
        System.out.println(charAtReturn);

        // concat() method:
        String newStr2 = string2.concat(" Programming Language.     ");
        System.out.println(newStr2);
        System.out.println(string1.concat(" Programming Language."));
        System.out.println(newStr2.equals(string2.concat(" Programming Language.")));

        // indexOf() method
        System.out.println(string3.indexOf("S"));

        // replace() method
        System.out.println(string3.replace('a', 'i')); // replace method updates all the characters in Java Script from the old Char 'a' to 'i'.

        // startsWith() method
        System.out.println(string2.startsWith("Py"));

        // endsWith() method
        System.out.println(string3.endsWith("?"));

        // substring(int beginIndex, int endIndex) method
        System.out.println(string3.substring(7));
        System.out.println(newStr2.substring(7, 18));

        // toCharArray()
        System.out.println(Arrays.toString(string1.toCharArray()));

        // trim() method removes the spaces front and end of the string.
        System.out.println(newStr2.trim());

        // compareTo() method
        System.out.println(string1.compareTo(string2));

        // ESCAPE characters in String
        String string4 = "This is the \"String\" class.\n'A' ";
        System.out.println(string4);

        // Creating strings using the new keyword.
        String name = new String("Java String.");
        System.out.println(name);

    }
}
