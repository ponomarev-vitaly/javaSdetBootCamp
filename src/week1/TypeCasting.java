package week1;

public class TypeCasting {

    public static void main(String[] args) {
        /**
         * 1) Auto Widening Casting: If you assign a smaller data type  to a larger data type
         * then java converts the data type  automatically to the larger one.
         */
        byte num1 = 10;
        short num2 = num1;
        System.out.println(num2);

        short num3 = 123;
        int num4 = num3;
        System.out.println(num3);

        int num5 = 100;
        double num6 = num5;
        System.out.println(num6);

        /**
         * 2) Explicit Narrowing Casting: If you assign a larger data type to a  smaller data type
         * then java cannot convert the data type  automatically to the smaller one.
         * You have to convert manually
         */
        short num11 = 10;
        byte num22 = (byte) num11;
        System.out.println(num22);

        int num33 = 99;
        short num44 = (short) num33;
        System.out.println(num44);

        double num55 = 443;
        int num66 = (int) num55;
        System.out.println(num66);

    }
}
