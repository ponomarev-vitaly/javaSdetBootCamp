package week9.SchoolManagement;

public class Person {
    private String fullName;
    private String idNumber;
    private int age;

    static String personType;

    public Person(String fullName, String idNumber, int age) {
        this.fullName = fullName;
        this.idNumber = idNumber;
        this.age = age;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person(){

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", age=" + age +
                '}';
    }
}
