package week2.homework;
/*
Program to print pyramid using Numbers
result should be like this;
        1
      2 3 2
    3 4 5 4 3
  4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5
 */
public class FullPyramidFromNumbersFirstSolution {
    public static void main(String[] args) {
        int rows = 5, k = 0, count = 0, count1 = 0;

        for (int i = 1; i <= rows; ++i) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
                ++count;
            }

            while (k != 2 * i - 1) {
                if (count <= rows - 1) {
                    System.out.print((i + k) + " ");
                    ++count;
                } else {
                    ++count1;
                    System.out.print((i + k - 2 * count1) + " ");
                }

                ++k;
            }
            count1 = count = k = 0;

            System.out.println();
        }
    }

}
