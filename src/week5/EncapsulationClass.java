package week5;

public class EncapsulationClass {
    private String name;
    private String idNumber;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public static void main(String[] args) {
        EncapsulationClass obj = new EncapsulationClass();
        // Set values to the variables.
        obj.setName("Vitalii"); // not return type object
        obj.setIdNumber("200055");
        obj.setAge("23");
        // Get values from the variables.
        String name = obj.getName();
        String IdNumber = obj.getIdNumber();
        String age = obj.getAge();
        // if(age.equals("30")); // Lines of code 42 and 44 are the same. Better to use 42nd line of code.

        // if(obj.getAge().equals("30"));
        // option 2:
        System.out.println("obj age: " + obj.getName()
                        + "\nobj IdNumber: " + obj.getIdNumber()
                        + "\nobj IdNumber: " + obj.getAge()); // the lines of code 46 and 48 are equal.

        // System.out.println("age" + obj.getAge());


    }
}
