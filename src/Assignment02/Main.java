package Assignment02;
import java.util.*;
public class Main {
    private static Lot currentLot;
    public static void main(String[] args) {
        ArrayList<Lot> auction = new ArrayList<Lot>();
        mainMenu(auction);
    }
    public static Lot getNextLot(ArrayList<Lot> currentLot) {
        if (!(currentLot.isEmpty())) {
            return currentLot.get(0);
        }
        Lot emptyLot = new Lot();
        return emptyLot;
    }

    public static void addItem(ArrayList<Lot> listLots) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the new description?: ");
        String userDescr = scan.next();
        System.out.print("What is the bid increment?: ");
        int bidInc = scan.nextInt();
        scan.nextLine();
        System.out.print("How much do you want to bid?: ");
        int bid = scan.nextInt();
        Lot newItem = new Lot(userDescr, bidInc, bid);
        listLots.add(newItem);
        currentLot = newItem;
        return;

    }

    public static void bid(Lot LotToBid) {
        Scanner scan = new Scanner(System.in);
        double minBid = (LotToBid.getBidIncrements() + LotToBid.getCurrentBid());
        System.out.print("How much do you want to bid?: You must bid at least " + minBid);
        int userBid = scan.nextInt();
        if (userBid >= minBid) {
            LotToBid.setCurrentBid(userBid);
        } else {
            System.out.print("Bid too small!");
        }
    }

    public static void markSold(Lot LotToSell) {
        LotToSell.markSold();
        System.out.println(LotToSell);
    }

    public static void mainMenu(ArrayList<Lot> lots) {
        Scanner scan = new Scanner(System.in);
        currentLot = null;
        boolean menu = true;
        do {

            if (currentLot != null) {
                System.out.println("Current Lot: " + currentLot.getDescription());
            } else {
                System.out.println("We are not currently bidding");
            }

            System.out.print("1. Add Lot to Auction\n" +
                    "2. Start bidding on next Lot\n" +
                    "3. Bid on current Lot\n" +
                    "4. Mark current Lot sold\n" +
                    "5. Quit\n" +
                    " ");
            int userChoice = scan.nextInt();
            switch (userChoice) {
                case 1:
                    addItem(lots);
                    break;
                case 2:
                    if (currentLot != null) {
                        if (!(currentLot.getSold())) {
                            System.out.println("You must mark the current lot as sold before bringing up the next lot!");
                            break;
                        } else {
                            currentLot = getNextLot(lots);
                            bid(currentLot);
                            break;
                        }
                    } else {
                        System.out.println("There is nothing to bid on, add an item first");
                        break;
                    }
                case 3:
                    if (currentLot == null || currentLot.getSold()) {
                        System.out.println("You must first bring up a Lot for bidding!");
                        break;
                    } else {
                        bid(currentLot);
                        break;
                    }
                case 4:
                    if (currentLot == null || currentLot.getSold()) {
                        System.out.println("You must first bring up a Lot for bidding!");
                        break;
                    } else {
                        markSold(currentLot);
                        break;
                    }
                case 5:
                    menu = false;
                    System.exit(101);
            }
        } while (menu);
    }

}
