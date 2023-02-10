package Assignment03;

public class Move extends Customer {

    private final String customerName;
    private final String newState;
    private int ticketInc;
    private static int moveNumber = 0;

    public Move(String name, String state) {
        super("C");
       // moveNumber++;
      //  ticketNumber++;
           /*
        Customer moverCustomer = new Customer("C") {
            @Override
            protected String getCustomerInfo() {
                return ("Moved from " + state + ". Ticket Number " + Move.this.getWholeTicketNumber() + " Name: " + name);
            }
        };

        */
        this.customerName = name;
        this.ticketInc = getTicketNumber();
        this.newState = state;


    }

    @Override
    protected String getCustomerInfo() {
        return ("Moved from " + newState + ". Ticket Number " + Move.this.getWholeTicketNumber( "D", ticketInc) + " Name: " + customerName);
    }
}