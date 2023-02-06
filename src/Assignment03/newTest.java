package Assignment03;

public class newTest extends Customer {

    private String customerName;
    private String dateOfBirth;

    public newTest(String name, String dateOfBirth) {
        Customer newCustomer = new Customer("A");

        this.customerName = name;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    protected String getCustomerInfo() {
        return ("New Drivers License. " + "Ticket Number " + getWholeTicketNumber() +  ". Name:  "+ customerName +
                " DOB: " + dateOfBirth);
    }


}
