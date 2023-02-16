package week2;

public class PostPreFix {
    public static void main(String[] args) {
        int a = 7;
        int b = 3;
        System.out.println("Postfix a++" + a++ + a); // Postfix a++ : 78
        System.out.println("Prefix ++b" + ++b + b); // Prefix ++b : 44
        // Java is executing from left to right in the same line and top to bottom.
        // If there is a string or text and then int or any number continue in the same code line (as the same line 7 and 8)
        // Java is converting int to String automatically.

        a = 7;
        b = 3;

        //** if there is int and then string is coming in the same line (as the same line 15 and 16)
        // Java is keeping int variable as an int.
        System.out.println(a++ + a + "Postfix a++"); // 15Postfix a++ :
        System.out.println(++b + b + "Prefix ++b"); // 8Prefix ++b :
    }

}
