package Assignment03;

public class Suspended extends Customer {
    private final String customerName;
    private final String reasonForSuspension;
    private int ticketInc;
    private static int susTicket = 0;

    public Suspended(String name, String suspension) {
        super("D");
        //susTicket++;
        //ticketNumber++;
        /*
        Customer suspendedCustomer = new Customer("D") {
            @Override
            protected String getCustomerInfo() {
                return ("Violation: " + suspension + ". Ticket Number " + Suspended.this.getWholeTicketNumber() + ". Name: " + name);
            }
        };

         */
        this.customerName = name;
         ticketInc = getTicketNumber();
        this.reasonForSuspension = suspension;
    }
    @Override
    protected String getCustomerInfo() {
        return ("Violation: " + reasonForSuspension + ". Ticket Number " + Suspended.this.getWholeTicketNumber( "B", ticketInc) + ". Name: " + customerName);
    }
}
