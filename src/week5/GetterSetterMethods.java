package week5;

/**
 * Encapsulation block of theory.
 */
public class GetterSetterMethods {
    private String creditCardNums = "1234567891011213";

    // Create getter method.
    public String getCreditCardNums() {
        return creditCardNums;
    }

    private int accountBalance$ = 12345;

    // Create setter method. Not return type.
    public GetterSetterMethods(int accountBalance$) {
        this.accountBalance$ = accountBalance$;
    }
}


