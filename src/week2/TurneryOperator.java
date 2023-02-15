package week2;

public class TurneryOperator {
    public static void main(String[] args) {
        // Example 1.
        int y = 10;
        int x = ( y > 5 ) ? (y*2):( 3 * y );
        System.out.println("x is equal to " + x);
        // Example 2.
        y = 7;
        x = ( y < 5 ) ? ( y * 2 ):( 3 * y );
        System.out.println("x is equal to " + x + " in example two");

    }
}
