package week2.homework;
/*
Program to print half pyramid using alphabets
result should be like this;
A
B B
C C C
D D D D
E E E E E
 */
public class PyramidAlphabet {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); //The cursor is jumping to the next line.
        }

    }
}
