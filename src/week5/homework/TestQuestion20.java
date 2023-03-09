package week5.homework;

/**
 * Question 20. Given the code. Result? E. 10 Hello 11
 */
public class TestQuestion20 { // Not clear whether class Test should be public or NOT.
        int a1;
        public static void doProduct(int a) {
            a = a * a;
        }

        public static void doString(String s) {
            s.concat(" " + s);
        }

        public static void main(String[] args) {
            TestQuestion20 item = new TestQuestion20();
            item.a1 = 11;
            String sb = "Hello";
            Integer i = 10;
            doProduct(i);
            doString(sb);
            doProduct(item.a1);
            System.out.println(i + " " + sb + " " + item.a1);
        }
}
