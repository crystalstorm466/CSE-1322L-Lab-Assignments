package Lab04;

public class Account {
    private static int account_number = 1000;
    private double accountBalance;


    public Account() {
        this.accountBalance = 0;
    }

    public Account(int newBalance) {
        account_number++;
        this.accountBalance = newBalance;
    }

    public static int getAccount_number() { return account_number; }

    public double getAccountBalance() { return accountBalance; }

    public void setAccountBalance(double accountBalance) { this.accountBalance = accountBalance; }

    public void withdrawal(int withdrawAmount) {
        accountBalance = accountBalance-withdrawAmount;
    }

    public void deposit(int depositAmount) {
        accountBalance = accountBalance + depositAmount;
    }
    public void addInterest() {
        double interestEarned = ((getAccountBalance() * 0.15));
        System.out.println("Customer earned " + interestEarned + " in interest");
        setAccountBalance(getAccountBalance() + interestEarned);
    }
}


