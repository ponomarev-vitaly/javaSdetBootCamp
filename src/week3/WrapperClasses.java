package week3;

public class WrapperClasses {
    public static void main(String[] args) {
        Integer myInt = 9;
        Double myDouble = 11.4;
        Character myChar= '@';
        String intToString;
        int num = 19;

        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);
        myInt.toString();
        intToString = myInt.toString();
        intToString.length(); // number of intToString characters --> 1
    }
}
