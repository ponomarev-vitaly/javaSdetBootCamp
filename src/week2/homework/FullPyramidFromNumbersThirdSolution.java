package week2.homework;

/**
 * Program to print pyramid using Numbers
 * result should be like this;
 *         1
 *       2 3 2
 *     3 4 5 4 3
 *   4 5 6 7 6 5 4
 * 5 6 7 8 9 8 7 6 5
 */
public class FullPyramidFromNumbersThirdSolution {
// This code is not working properly.
//        public static void main(String[] args) {
//            int rows = 5;
//            int number = 1;
//
//            for (int i = 1; i <= rows; i++) {
//                for (int j = 1; j <= rows - i; j++) {
//                    System.out.print("  "); // print spaces for indentation
//                }
//
//                for (int k = 1; k <= i; k++) {
//                    System.out.print(number + " ");
//                    number++;
//                }
//
//                for (int l = i + 1; l <= 2 * i - 1; l++) {
//                    System.out.print(number - 2 * i + l + " ");
//                }
//
//                System.out.println(); // move to next line
//            }
//        }
// This code is not working properly.
//    public static void main(String[] args) {
//        int rows = 5;
//        int number = 1;
//
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= rows - i; j++) {
//                System.out.print("  "); // print spaces for indentation
//            }
//
//            for (int k = 1; k <= i; k++) {
//                System.out.print(number + " ");
//                number++;
//            }
//
//            for (int l = i + 1; l <= 2 * i - 1; l++) {
//                System.out.print(number - 2 * rows + l + " ");
//            }
//
//            System.out.println(); // move to next line
//        }
//    }
    public static void main(String[] args) {
        int rows = 5;
        int number = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  "); // print spaces for indentation
            }

            for (int k = i; k < i + i; k++) {
                System.out.print(number + " ");
                if (k < rows + i - 1) {
                    number++;
                } else {
                    number--;
                }
            }

            System.out.println(); // move to next line
            number = i + 1; // reset number for next row
        }
    }
}


