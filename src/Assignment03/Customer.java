package Assignment03;

public abstract class Customer {

    private static String letter;
    private static int ticketNumber;
    private static int ANumber = 1; //newtest
    private static int BNumber = 1; //renew
    private static int CNumber = 1; //move
    private static int DNumber = 1; //suspended
    private static String wholeTicket;

    public Customer() {
        letter = "X";
        ticketNumber = 0;
        ANumber = 0;
        BNumber = 0;
        CNumber = 0;
        DNumber = 0;
    }

    public Customer(String letter) {
     /*
      if (letter.equalsIgnoreCase("A") || letter.equalsIgnoreCase("B") || letter.equalsIgnoreCase("C") || letter.equalsIgnoreCase("D")) {
            Customer.letter = letter;
            Customer.ticketNumber = ticketNumber;
        } else {
            Customer.letter = "X";
            Customer.ticketNumber = 0;
            System.out.println("Error, letter must be A, B, C or D");
        }
      */

        switch(letter.toLowerCase()) {
            case "a":
                Customer.letter = letter;
                ticketNumber = ANumber++;
                break;
            case "b":
                Customer.letter = letter;
                ticketNumber = BNumber++;
                break;
            case "c":
                Customer.letter = letter;
                this.ticketNumber = CNumber++;
                break;
            case "d":
                this.letter = letter;
                this.ticketNumber = DNumber++;
                break;
            default:
                Customer.letter = "X";
                ticketNumber = 0;
                System.out.println("Error, letter must be A, B, C or D");
        }
    }

    protected String getWholeTicketNumber(String passLetter, int ticketInc) { return (passLetter + ticketInc); }

    protected abstract String getCustomerInfo();

    public static int getANumber() { return ANumber; }
    public static int getBNumber() { return BNumber; }

    public static int getTicketNumber() {
        return ticketNumber;
    }

    public static int getCNumber() { return CNumber; }
    public static int getDNumber() { return DNumber; }
}
