package week2.homework;
/*
Inverted half pyramid using *
result should be like this;
* * * * *
* * * *
* * *
* *
*
 */
public class InvertedPyramid {

    public static void main(String[] args) {

        for(int i = 5; i > 0; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println(); //The cursor is jumping to the next line.
        }
    }
}

