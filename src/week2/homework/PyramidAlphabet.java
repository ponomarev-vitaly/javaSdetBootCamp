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

        System.out.println((char)64); // A,65 - B,66 - C,67
        for(int i=1; i<=5; i++){

            for(int j=1; j<=i; j++){
                System.out.print((char)(64 + i));
            }
            System.out.println();
        }
    }
}
