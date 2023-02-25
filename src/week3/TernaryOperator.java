package week3;

public class TernaryOperator {
    public static void main(String[] args) {
        // syntax
        // expression1 ? expression2 : expression3
        // NESTED Ternary Operator : (expression1 ? (expression2 ? expression6 : expression7) : (expression3 ? expression4 : expression5))
        // condition_is_correct ? result1 : accept_result2

        int a = 3;
        if(a > 3) {
            System.out.println("A is greater");
        } else {
            System.out.println("A is smaller");
        }

        String result;
        result = a > 3 ? "A is greater" : "A is smaller";
        System.out.println(result);
        System.out.println(a > 3 ? "A is greater" : "A is smaller");

        // Math >= 45 and math < 60 --> MathGrade : D("Your grade is D", otherwise "We didn't find your grade")
        int math = 65;
        String mathGrade = (math >= 45 && math < 60) ? "Your grade is D" : "We didn't find your grade";
        System.out.println(mathGrade);

        // b, c, d integers variables. Find the biggest one with the ternary operator.
        int b = 3, c = 4, d = 1;
        String biggestNumber;
        biggestNumber = (d >= b) ? ((d >= c) ? "d is the biggest number" : "c is the biggest number") : (b >= c) ? "b is the biggest number" : "c is the biggest number";
        System.out.println(biggestNumber);







    }
}
