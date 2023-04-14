package week10.Enum;

public class WeekDays {
    public static void main(String[] args) {
        DaysOfWeek myDay = DaysOfWeek.THURSDAY;
        System.out.println("Abbreviation: " + myDay.getAbbreviation());
        System.out.println("Numeric Value: " + myDay.getNumericValue());
    }
}

enum DaysOfWeek{
    MONDAY("Mon", 1),
    TUESDAY("Tue", 2),
    WEDNESDAY("Wed", 3),
    THURSDAY("Thu", 4),
    FRIDAY("Fri", 5),
    SATURDAY("Sat", 6),
    SUNDAY("Sun", 7);

    private String abbreviation;
    private int numericValue;

    private DaysOfWeek(String abbreviation, int numericValue) {
        this.abbreviation = abbreviation;
        this.numericValue = numericValue;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public int getNumericValue() {
        return numericValue;
    }

    public void setNumericValue(int numericValue) {
        this.numericValue = numericValue;
    }
}
