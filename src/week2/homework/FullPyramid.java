package week2.homework;
/*
Program to print full pyramid using *
result should be like this;
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
 */
public class FullPyramid {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i+=2) {
            for (int j = 1; j <= i; j+=2) {
                System.out.print("* ");
            }
            System.out.println(); //The cursor is jumping to the next line.
        }
    }
}
