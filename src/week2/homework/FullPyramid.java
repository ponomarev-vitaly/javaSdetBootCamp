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
        int stars = 1;
        int spaces = 8;
        for (int i = 1; i<= 5; i++){
            for (int j = 1; j <= spaces; j++){
                System.out.println(" ");
            }

            for(int k=1; k <= stars; k++){
                System.out.println("* ");
            }

            System.out.println();
            stars += 2;
            spaces += 2;
        }
    }
}
