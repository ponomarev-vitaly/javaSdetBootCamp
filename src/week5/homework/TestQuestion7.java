package week5.homework;
/**
 * Question 7. Given the code, what is the result?
 * I've got an error here. But, probably, the result is: 5 4 5 6
 */

public class TestQuestion7 {
    static int i;
    int j;

    public static void main(String[] args) {
        TestQuestion7 x1 = new TestQuestion7();
        TestQuestion7 x2 = new TestQuestion7();
        x1.i = 3;
        x1.j = 4;
        x2.i = 5;
        x2.j = 6;
        System.out.println(
                x1.i + " " +
                x1.j + " " +
                x2.i + " " +
                x2.j
        );
    }

}
