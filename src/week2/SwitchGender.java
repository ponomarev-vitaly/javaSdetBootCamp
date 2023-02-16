package week2;

public class SwitchGender {
    public static void main(String[] args) {
        String gender = "male and female";

        switch (gender) {
            case "female" -> System.out.println("This is a girl.");
            case "male" -> System.out.println("This is a boy.");
            default -> System.out.println("Please enter valid gender.");
        }

        if (gender.equals("female")) {
            System.out.println("This is a girl.");
        } else if (gender.equals("male")) {
            System.out.println("This is a boy.");
        } else {
            System.out.println("Please enter valid gender.");
        }
    }
}
