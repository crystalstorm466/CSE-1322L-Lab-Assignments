package Assignment03;

public class NewTest extends Customer {

    private final String customerName;
    private final String dateOfBirth;
    private int ticketInc;
    private static int newTicket = 0;

    public NewTest(String name, String dateOfBirth) {
        super("A");
       // ticketNumber++;
       // newTicket++;
        this.customerName = name;
        ticketInc = getTicketNumber();
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    protected String getCustomerInfo() {
        return ("New Drivers License. " + "Ticket Number " + getWholeTicketNumber("A",ticketInc) +  ". Name:  "+ customerName +
                " DOB: " + dateOfBirth);
    }


}
