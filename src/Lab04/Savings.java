package Lab04;

public class Savings extends Account {
    private int depositCount;
    public Savings() {
        setAccountBalance(0);
    }

    @Override
    public void withdrawal(int withdrawAmount) {
        if (withdrawAmount >= getAccountBalance()-500) {
            System.out.println("Charging a fee of $10 because you are under $500");
            setAccountBalance(getAccountBalance()-10);
            return;
        }
        super.withdrawal(withdrawAmount);
    }

    @Override
    public void deposit(int depositAmount) {
        depositCount++;
        super.deposit(depositAmount);
        if (depositCount > 5) {
            System.out.println("Charging a fee of $10");
            setAccountBalance(getAccountBalance()-10);
        }
    }

}
