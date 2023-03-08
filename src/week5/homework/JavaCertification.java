package week5.homework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * I observe and solve some questions from the Java certification questions 1-20.
 */
public class JavaCertification {
//    static int i;
//    int j;
    public static void main(String[] args) {
// Question 1. The result for this question is: Welcome Log2:2. There is no such an answer!!!
        int x = 1;
        int y = 1;
        if(x++ < ++y){ // Pay attention to <
            System.out.print("Hello ");
        } else {
            System.out.print("Welcome ");
        }
        System.out.print("Log " + x + ":" + y);

        // Question 2. A. The answer is 10 : 30 : 6.

//        int i = 10;
//        int j = 20;
//        int k = (j += i)/5;
//        System.out.println(i + " : " + j + " : " + k);

        // Question 3. Given the code fragment. D. The answer is: Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: HourOfDay
//        String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
//        System.out.println(date);

        // Question 4. The answer is C.
//        int[] stack = {10,20,30};
//        int size = 3;
//        int idx = 0;
        /* line n1 */
        // A option. The result is 20.
//        do{
//            idx++;
//        } while (idx >= size);
        // B option. Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
//        while(idx<size){
//            idx++;
//        }
        // C option. The result is 30.
//        do{
//            idx++;
//        } while (idx < size-1);
//        System.out.println("The Top element: " + stack[idx]);

        // Question 5. Which statement is true about the switch statement? A. It must contain the default section.
        // Question 6. Given the code fragment. Which two modifications should you make so that the code compiles successfully?
        // The answer is A, E. We had observed this question during the class.
        // Question 7. Given the code, what is the result?
//        X x1 = new X();
//        X x2 = new X();
//        x1.i = 3;
//        x1.j = 4;
//        x2.i = 5;
//        x2.j = 6;
//        System.out.println(
//                x1.i + " " +
//                x1.j + " " +
//                x2.i + " " +
//                x2.j
//        );
        // Question 8. Given the code fragment. What is the result? The answer is ABCDE. B option.
        // String[][] arr = {{"A", "B", "C"}, {"D", "E"}};
//        for(int i = 0; i < arr.length; i++){
//            for(int j = 0; j < arr[i].length; j++){
//                System.out.println(arr[i][j] + " ");
//                if (arr[i][j].equals("B")){
//                    continue;
//                }
//            }
//            continue;
//        }
        // Question 9. Given code, which fragment should you use at line n1 to instantiate the dvd object successfully?
//      Inheritance question. Check it later.
//        class CD {
//            int r;
//            CD(int r) {
//                this.r=r;
//            }
//        }
//
//        class DVD extends CD {
//            int c;
//            DVD(int r, int c) {
//                // line n1
//                super(r);
//                this.c = c;
//            }
//        }
//
//        // And given the code fragment:
//        DVD dvd = new DVD(10, 20);
//        // Question 10. The answer is 400 200, option A.
//        int var1 = 200;
//        System.out.println(doCalc(var1));
//        System.out.println(" " + var1);

        // Question 11. Given the code fragment. What is the result.
//        String[] strs = {"A", "B"};
//        // int idx = 0;
//        for (String s : strs) {
//            strs[idx].concat(" element " + idx);
//            idx++;
//        }
//        for (idx = 0; idx < strs.length; idx++) {
//            System.out.println(strs[idx]);
//        }

    }

//    static int doCalc(int var1) {
//        var1 = var1 * 2;
//        return var1;
//    }
}
