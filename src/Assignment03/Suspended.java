package Assignment03;

public class Suspended extends Customer {
    private final String customerName;
    private final String reasonForSuspension;
    private int susTicket;

    public Suspended(String name, String suspension) {
        super("D");

        ticketNumber++;
        /*
        Customer suspendedCustomer = new Customer("D") {
            @Override
            protected String getCustomerInfo() {
                return ("Violation: " + suspension + ". Ticket Number " + Suspended.this.getWholeTicketNumber() + ". Name: " + name);
            }
        };

         */
        this.customerName = name;
        this.reasonForSuspension = suspension;
    }
    @Override
    protected String getCustomerInfo() {
        return ("Violation: " + reasonForSuspension + ". Ticket Number " + Suspended.this.getWholeTicketNumber() + ". Name: " + customerName);
    }
}
