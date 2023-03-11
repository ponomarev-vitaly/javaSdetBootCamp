package week5;

public class Account {
    private int accountBalance = 600;

    // getter method: int type (return int value)
    public int getAccountBalance() {
        return accountBalance;
    }

    // setter method: void (not return type)
    public void setAccountBalance(int accountBalance) {
        this.accountBalance += accountBalance; // this.accountBalance = accountBalance + accountBalance (from parameter)
    }

    public static void main(String[] args) { // static methods and variables can be reached from the static method only. OR use class object.
        Account account= new Account(); // creating an Account class object

        int number = account.getAccountBalance();
        System.out.println("get the accountBalance through getter method the first time: " + number);

        account.setAccountBalance(400); // set the value or update the account balance
//        return1 = account.getAccountBalance();
        System.out.println("Set the accountBalance through setter method after calling setter method (200): " + account.getAccountBalance()); // + account.setAccountBalance() can not use set method because there is nothing there. nothing to return.
    }
}
