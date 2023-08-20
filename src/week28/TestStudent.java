package week28;
class Student {
    String name;
    int age;
    boolean result;
    double height;
}
public class TestStudent {
    public static void main(String[] args) {
        Student stud = new Student();
        System.out.println(stud.name + stud.height + stud.result + stud.age);
    }
}
