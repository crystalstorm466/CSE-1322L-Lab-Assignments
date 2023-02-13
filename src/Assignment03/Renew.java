package Assignment03;

public class Renew extends Customer {

    private final String customerName;
    private static int rTicketNumber = 0;
    private int ticketInc;

    public Renew(String customerName) {
        super("B");
       // rTicketNumber++;
       // ticketNumber++;
        this.customerName = customerName;
        this.ticketInc = getTicketNumber();
        }
    @Override
    protected String getCustomerInfo() {
        return ("Renewal License. " + Renew.this.getWholeTicketNumber( "C", ticketInc) + ". Name: " + customerName);
    }
}
