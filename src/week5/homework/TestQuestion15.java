package week5.homework;

/**
 * Question 15. Given the code fragment. 4 code samples were also given as the answer options.
 * Which is correct to enable the code to print true?
 */
public class TestQuestion15 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Duke");
        String str1 = sb1.toString();
        // Insert the code here.
        // String str2 = sb1.toString(); // C option - The result is false.
        // String str2 = "Duke"; // D option - The result is false.
        // String str2 = new String(str1); // B option - The result is false.
        String str2 = str1;
        System.out.println(str1==str2);
    }
}
