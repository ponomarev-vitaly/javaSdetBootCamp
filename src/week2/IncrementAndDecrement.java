package week2;

import java.sql.SQLOutput;

public class IncrementAndDecrement {
    public static void main(String[] args) {
        int numA = 3;
        numA = numA + 5; //--> numA = 8
        System.out.println(numA);
        numA = 3;
        numA += 5; //--> numA = 8
        System.out.println(numA);
    }
}
