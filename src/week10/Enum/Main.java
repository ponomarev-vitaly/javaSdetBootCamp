package week10.Enum;

public class Main {
    public static void main(String[] args) {
        // Create a variable(Colors type) from Colors ENUM.
        Colors red = Colors.RED; // We created the variable red.
        Colors green = Colors.GREEN;
        System.out.println(red);
        System.out.println(Colors.RED);

        System.out.println(red.ordinal()); // --> ordinal() method brings us the index number of value.

        System.out.println(green.ordinal());
        System.out.println(green);

        Days monday = Days.MONDAY;
        Days tuesday = Days.TUESDAY;
        Days wednesday = Days.WEDNESDAY;
        Days thursday = Days.THURSDAY;
        Days friday = Days.FRIDAY;
        Days saturday = Days.SATURDAY;
        Days sunday = Days.SUNDAY;
        System.out.println(wednesday);
        System.out.println(wednesday.ordinal());

        // ENUM in switch statement.
        Colors myColor = Colors.GREEN;

        switch (myColor){
            case RED:
                System.out.println("The color is red.");
                break;
            case BLUE:
                System.out.println("The color is blue.");
                break;
            case YELLOW:
                System.out.println("The color is yellow.");
                break;
            case GREEN:
                System.out.println("The color is green.");
                break;
        }

        // We can use ENUM class as an array with values() method. --> Colors.values()
        for (Colors allColors : Colors.values()
             ) {
            System.out.println(allColors);
        }

        for (int i = 0; i < Colors.values().length; i++) {
            System.out.println(Colors.values()[i]);
        }
    }

    enum Days{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
