package week7.Question2;
class Derived{
    public void getDetails() {
        System.out.printf("Derived Class");
    }
}
public class Quest extends Derived {
    public void getDetails(){
        System.out.printf("Test class");
        super.getDetails();
    }
    public static void main(String[] args) {
        Derived obj = new Quest();
        obj.getDetails(); // Triggers code in line 8.
    }
}
