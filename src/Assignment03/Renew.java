package Assignment03;

public class Renew extends Customer {

    private final String customerName;

    public Renew(String customerName) {
      super("B");
      ticketNumber++;

        /*Customer renewCustomer = new Customer("B") {
            @Override
            protected String getCustomerInfo() {
                return ("Renewal License. " + Renew.this.getWholeTicketNumber() + ". Name: " + customerName);
            }
        };*/
        this.customerName = customerName;


        }
    @Override
    protected String getCustomerInfo() {

        return ("Renewal License. " + Renew.this.getWholeTicketNumber() + ". Name: " + customerName);
    }
}
