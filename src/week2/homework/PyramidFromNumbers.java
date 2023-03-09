package week2.homework;
/*
Program to print half pyramid a using Numbers
result should be like this;
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
 */
public class PyramidFromNumbers {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); //The cursor is jumping to the next line.
        }
    }
}
