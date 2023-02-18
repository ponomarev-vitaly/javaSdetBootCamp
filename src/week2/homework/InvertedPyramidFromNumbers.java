package week2.homework;
/*
Inverted half pyramid using numbers
result should be like this;
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */
public class InvertedPyramidFromNumbers {
    public static void main(String[] args) {
        for(int i = 5; i > 0; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println(); //The cursor is jumping to the next line.
        }
    }
}
