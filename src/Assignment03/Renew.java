package Assignment03;

public class Renew extends Customer {

    private String customerName;

    public Renew(String customerName) {
        Customer newCustomer = new Customer("B") {
            @Override
            protected String getCustomerInfo() {
                return ("Renewal License. " + Renew.this.getWholeTicketNumber() + ". Name: " + customerName);
            }
        };
        this.customerName = customerName;


        }
    @Override
    protected String getCustomerInfo() {
        return null;
    }
}
