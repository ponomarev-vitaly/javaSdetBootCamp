package week1;

public class PrimitiveDataType {
    public static void main(String[] args) {

        boolean isCold = true;
        boolean isHeavy = false;

        char initial = 'C';

        byte age = 22;

        short salary = 1000;

        int weight = 100;
        long year = 2023;
        float height = 19.8f;
        double dHeight = 38.8;

        /**
         * Set a variable to final to prevent it from being overridden/modified:
         *
         */
        final int number = 99;
        float pi = 3.14f;

        System.out.println(weight);
        System.out.println(year);
        System.out.println(height);
        System.out.println(dHeight);

        System.out.println(isCold);
        System.out.println(isHeavy);
        System.out.println(initial);
        System.out.println(age);
        System.out.println(salary);
    }

}

