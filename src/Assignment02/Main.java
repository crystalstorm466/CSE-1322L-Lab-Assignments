package Assignment02;
import java.util.*;
public class Main {
    private static Scanner scan = new Scanner(System.in);
    /*public Lots getNextLot(ArrayList<Lot> lotsArrayList ) {
        if (lotsArrayList.get(0) != null) {
            return lotsArrayList.get(0);
        }
        Lot newLot = new Lot();
        lotsArrayList.add(newLot)
        return n
    }*/

    public void addItem(ArrayList<Lot> lots) {
        System.out.println("What is the new description? ");
        String description = scan.nextLine();
        System.out.print("What is the bid increment? ");
        int bidIncr = scan.nextInt();
        System.out.print("How much do you want to bid? ");
        int bid = scan.nextInt();

        Lot newLot = new Lot(description, bid, bidIncr);
        lots.add(newLot);
    }

    public void bid(Lot currentLot) {
        System.out.print("How much do you want to bid? You must make a minimum bid of: " + currentLot.getBidIncrements());
        int userBid = scan.nextInt();
        if (userBid < currentLot.getBidIncrements()) {
            System.out.println("Too small!");
        } else {
            currentLot.setCurrentBid(userBid);
        }
    }

    public void markSold(Lot currentLot) {
        currentLot.markSold();
        System.out.println(currentLot);
    }

    public static void mainMenu(ArrayList<Lot> lots) {
        boolean menu = true;
        ArrayList<Lot> currentLot;
        /*
        do {
            if (lots.get(0).getDescription() == "Unknown Item" || currentLot == null) {
                System.out.println("We are not currently bidding.");
            }
            System.out.print("1. Add Lot to Auction\n" +
                    "2. Start bidding on next Lot\n" +
                    "3. Bid on current Lot\n" +
                    "4. Mark current Lot sold" +
                    "5. Quit" +
                    " ");
            int userChoice = scan.nextInt();
            switch(userChoice) {
                case 1:
                    addItem(currentLot);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(33);
                default:
                   // throw new IllegalStateException("Unexpected value: " + userChoice);
                    System.out.println("Invalid value!");
                    break;
            }
        } while (menu);

         */
    }

    public static void main(String[] args) {
        ArrayList<Lot> auction = new ArrayList<Lot>();
        mainMenu(auction);
    }
}
