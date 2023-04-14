package week10.Enum;

public class MainClass {
    public static void main(String[] args) {
        // This is how to use compareTo() method, compares ENUM constants based on their ordinal values /index number.
        // The answer we get is -1, small is less then medium.
        System.out.println(Size.SMALL.compareTo(Size.MEDIUM));
        // If we compare SMALL, we get 0, because they are the same.
        System.out.println(Size.SMALL.compareTo(Size.SMALL));
        // The answer will be 3, because 3 is the index number of EXTRALARGE.
        System.out.println(Size.EXTRALARGE.compareTo(Size.SMALL));
        //
        System.out.println(Colors.RED.compareTo(Colors.YELLOW));
        // toString() method converts ENUM to String. toString() overrides toString in class Object.
        // String.valueOf() method also converts ENUM to String.
        String enumvalue = Size.SMALL.toString();
        System.out.println(enumvalue);
        //String.valueOf() method this is an example of how to use this method.
        String evalue = String.valueOf(Size.SMALL);
        System.out.println(evalue);
        // name() method returns ENUM constant as a String format.
        Size size = Size.LARGE;
        System.out.println(size.name());
        //

    }
}
