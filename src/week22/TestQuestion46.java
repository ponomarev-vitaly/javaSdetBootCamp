package week22;

public class TestQuestion46 {
    public static void main(String[] args) {
        extractInt(2.7);
//        extractInt(2);
    }

    private static void extractInt(Double obj) {
        System.out.println(obj.intValue());
    }
}
