package week2.homework;
/**
Program to print pyramid using Numbers
result should be like this;
        1
      2 3 2
    3 4 5 4 3
  4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5
 */
public class FullPyramidFiveRows {
    public static void main(String[] args) {
        int rows = 5;
        for(int i = 0; i < 5; i++){ // Creating rows.
            for(int k = ((rows-i)*2-1); k > 1; k--){ // Display spaces.
                System.out.print(" ");
            }
            for(int j = i; j < (2*i+1); j++){ // This loop displays Numbers until the moment they increase.
                System.out.print((j+1) + " ");
            }
            // This loop displays Numbers when they begin to decrease.
            for(int n = 1; n <= rows; n++ ){
                if(i==1) System.out.print(2 + " ");
                else if(i>=2 && (i + rows - n)<10){
                    System.out.print((i + rows - n) + " ");
                };
            }
            System.out.println();
        }
    }
}
