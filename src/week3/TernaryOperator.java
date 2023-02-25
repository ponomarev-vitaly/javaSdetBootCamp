package week3;

public class TernaryOperator {
    public static void main(String[] args) {
        // syntax
        // expression1 ? expression2 : expression3
        // NESTED Ternary Operator : (expression1 ? (expression2 ? expression6 : expression7) : (expression3 ? expression4 : expression5))
        // condition_is_correct ? result1 : accept_result2

        int a = 4;
        if(a>3) {
            System.out.println("A is greater");
        } else {
            System.out.println("A is smaller");
        }

        String result;
        result = a > 3 ? "A is greater" : "A is smaller";
        System.out.println(result);
        System.out.println(a > 3 ? "A is greater" : "A is smaller");

    }
}
