package week1;

public class NonPrimitiveDataType {
    public static void main(String[] args) {
        String name = "Adam";
        System.out.println("NAME : " + name);
        System.out.println("Name variable length is " + name.length() + ".");
        int nameLength = name.length();
        System.out.println("Name's length : " + nameLength);

        String txt = "Clarusway SDET Course.";
        System.out.println(txt);
        System.out.println(txt.toUpperCase());
        System.out.print(txt.toLowerCase());

        System.out.println(txt.indexOf("s"));

    }
}
