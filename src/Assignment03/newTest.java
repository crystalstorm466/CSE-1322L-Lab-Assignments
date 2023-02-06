package Assignment03;

public class newTest extends Customer {

    private final String customerName;
    private final String dateOfBirth;

    public newTest(String name, String dateOfBirth) {
        super("A");
        Customer.ticketNumber++;
        this.customerName = name;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    protected String getCustomerInfo() {
        return ("New Drivers License. " + "Ticket Number " + getWholeTicketNumber() +  ". Name:  "+ customerName +
                " DOB: " + dateOfBirth);
    }


}
