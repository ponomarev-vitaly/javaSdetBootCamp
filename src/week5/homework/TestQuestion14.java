package week5.homework;

/**
 * Question 14. Given the code fragment. Result? S 6 or S6.
 */
public class TestQuestion14 {
    public static void main(String[] args) {
        String str = "Sweet Sweat";
        String str2 = str.trim().charAt(6) + " " + str.indexOf("Sw", 1);
        System.out.println(str2);
    }
}
