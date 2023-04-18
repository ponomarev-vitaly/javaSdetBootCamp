package week11;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class AssertInJava {
    public static void main(String[] args) {
        String[] weekends = {"Friday", "Saturday", "Sunday"};
        // assert condition;
        assert weekends.length == 2;
        System.out.println("There are " + weekends.length + " weekends in a week");

        // assert condition : expression;
        assert weekends.length == 2 : "There are 2 weekends in a week.";
        System.out.println("There are " + weekends.length + " weekends in a week.");

        int value = 21;
        assert value >= 20 : "Underweight";
        System.out.println("value is " + value);

         int x = 2;
         if((x+1)==1){
             System.out.println("x is odd number.");
         }
         else // x must be even
         {
             assert (x % 2 == 0);

         }
    }
}