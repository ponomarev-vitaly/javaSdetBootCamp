package week4;

public class StringBuilderClass {
    public static void main(String[] args) throws Exception{
        // Create a StringBuilder object with a String pass parameter.
        StringBuilder str = new StringBuilder("AAAABBBCCCC");

        // Print the string.
        System.out.println("String = " + str.toString());

        // Reverse the string.
        StringBuilder reverseStr = str.reverse();
        System.out.println("Reverse String = " + reverseStr.toString());

        // Append ' , '(44) to the String.
        str.appendCodePoint(44);

        // Print the modified String.
        System.out.println("Modified StringBuilder = " + str);

        // Get capacity.
        int capacity = str.capacity();

        // Print the result.
        System.out.println("StringBuilder = " + str);
        System.out.println("Capacity of StringBuilder = " + str);
    }

}
