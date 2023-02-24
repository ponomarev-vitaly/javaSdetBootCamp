package week3;

public class WrapperClasses {
    public static void main(String[] args) {
        Integer myInt = 9;
        Double myDouble = 11.4;
        Character myChar= '@';
        String intToString;
        int num = 19;
        double dNum = 16.3;

        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);
        myInt.toString();
        intToString = myInt.toString();
        intToString.length(); // number of intToString characters --> 1

        System.out.println("Primitive value " + num);
        System.out.println("Wrapper value " + myInt);
        System.out.println(Double.max(4.6, 11.7)); // --> 11.7
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        // Unboxing
        myDouble = dNum;
        System.out.println(myDouble);

        // Autoboxing
        dNum = myDouble;
        System.out.println(dNum);

        // Parsing converts String values to the primitive types.
        String number = "1234";
        System.out.println(number + 6); // Converting integer 6 to string, after that concatenation proceeds, we get the result 12346.
        System.out.println(6 + number); // The same result as the previous, but with the different order: 61234.
        // int numerV = number; // This is not balancing or matching, in that case we get Compile time error.
        // short sNum = dNum; // No balance also.
        short sNum = (short) dNum; // type casting
        int numberValue = Integer.parseInt(number); //
        System.out.println(numberValue + 6); // 1234 + 6 = 1240

        // ValueOf methods: converts String to Wrapper class values, returns wrapper class values.
        String stringNumber3 = "2343.5678"; // + 7.0 = 2350.5679
        Float floatNumber = Float.valueOf(stringNumber3); // parseFloat()
        System.out.println(floatNumber + 7); // We get the result 2350.5679

    }
}
