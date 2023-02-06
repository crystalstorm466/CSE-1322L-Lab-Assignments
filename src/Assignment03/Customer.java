package Assignment03;

public abstract class Customer {

    private static String letter;
    static int ticketNumber;
    static int ANumber;
    static int BNumber;
    static int CNumber;
    static int DNumber;
    private static String wholeTicket;

    public Customer() {
        letter = "X";
        ticketNumber = 0;
    }

    public Customer(String letter) {
      if (letter.equalsIgnoreCase("A") || letter.equalsIgnoreCase("B") || letter.equalsIgnoreCase("C") || letter.equalsIgnoreCase("D")) {
            Customer.letter = letter;
        } else {
            Customer.letter = "X";
            Customer.ticketNumber = 0;
            System.out.println("Error, letter must be A, B, C or D");
        }
        //Customer.ticketNumber = ticket;
    }

    protected String getWholeTicketNumber() { return (letter+ ticketNumber); }

    protected abstract String getCustomerInfo();


}
