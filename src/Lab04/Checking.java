package Lab04;

public class Checking extends Account {

    public Checking() {
       setAccountBalance(0);
    }

    @Override
    public void withdrawal(int width) {
        if (width > getAccountBalance()) {
            System.out.println("Charging an overdraft fee of $20 because account is below $0");
            setAccountBalance(getAccountBalance() - 20);
        }
    }
}
