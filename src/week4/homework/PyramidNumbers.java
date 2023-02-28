package week4.homework;

public class PyramidNumbers {
    public static void main(String[] args) {

            int n = 4; // number of rows
            int num = 2; // starting number

            for (int i = 1; i <= n; i++) {
                // print spaces before each row
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("  ");
                }

                // print numbers for each row
                for (int k = num; k >= num - i + 1; k--) {
                    System.out.print(k + " ");
                }

                // update starting number for next row
                num += 2;

                // move to next row
                System.out.println();
            }
    }
}

