package Assignment02;
import java.util.*;
public class Main {
    private static int counter = 0;
    private static Scanner scan = new Scanner(System.in);
    public static Lot getNextLot(ArrayList<Lot> lotsArrayList) {
        if (!(lotsArrayList.isEmpty())) {
            return lotsArrayList.get(0);
        } else {
            Lot newLot = new Lot();
            return newLot;
        }
    }

    public static void addItem(ArrayList<Lot> currentLot) {
        System.out.print("What is the new description?: ");
        String description = scan.nextLine();
        scan.nextLine();
        System.out.print("What is the bid increment? ");
        int bidIncr = scan.nextInt();
        System.out.print("How much do you want to bid? ");
        int bid = scan.nextInt();

        Lot newLot = new Lot(description, bid, bidIncr);
        currentLot.add(newLot);
    }

    public static void bid(Lot currentLot) {
        System.out.print("How much do you want to bid? You must make a minimum bid of: " + currentLot.getBidIncrements());
        int userBid = scan.nextInt();
        if (userBid < currentLot.getBidIncrements()) {
            System.out.println("Too small!");
        } else {
            currentLot.setCurrentBid(userBid);
        }
    }

    public static void markSold(Lot currentLot) {
        currentLot.markSold();
        System.out.println(currentLot);
    }

    public static void mainMenu(ArrayList<Lot> auction) {
        boolean menu = true;
        ArrayList<Lot> currentLot = new ArrayList<Lot>();
        currentLot.addAll(auction);
        do {
            if (Objects.equals(currentLot.get(0).getDescription(), "Unknown Item") || currentLot.get(0) == null) {
                System.out.println("We are not currently bidding.");
            }
            System.out.print("1. Add Lot to Auction\n" +
                    "2. Start bidding on next Lot\n" +
                    "3. Bid on current Lot\n" +
                    "4. Mark current Lot sold\n" +
                    "5. Quit\n" +
                    " ");
            int userChoice = scan.nextInt();
            switch(userChoice) {
                case 1:
                    addItem(currentLot);
                    System.out.println(currentLot.get(0));
                    break;
                case 2:
                    if (currentLot.isEmpty()) {
                        System.out.println("There's nothing to bid on, add an item first!");
                        break;
                    } else {
                        if (!(currentLot.get(0).getSold())) {
                            System.out.println("You must mark the current lot as sold before bringing up the next Lot");
                            break;
                        } else {
                            getNextLot(currentLot);
                            bid(currentLot.get(0));
                            break;
                        }
                    }
                case 3:
                    if (currentLot.get(0) == null || Objects.equals(currentLot.get(0).getDescription(), "Unknown Item") || currentLot.get(0).getSold()) {
                        System.out.println("You muse first bring up a Lot up for bidding");
                        break;
                    } else {
                        bid(currentLot.get(0));
                    }
                    break;
                case 4:
                    if (currentLot.get(0) == null || Objects.equals(currentLot.get(0).getDescription(), "Unknown Item") || currentLot.get(0).getSold()) {
                        System.out.println("You muse first bring up a Lot up for Bidding");
                        break;
                    } else {
                        markSold(currentLot.get(0));
                        return;
                    }
                case 5:
                    System.exit(33);
                default:
                   // throw new IllegalStateException("Unexpected value: " + userChoice);
                    System.out.println("Invalid value!");
                    break;
            }
        } while (menu);


    }

    public static void main(String[] args) {
        ArrayList<Lot> auction = new ArrayList<>();
        Lot firstLot = new Lot();
        auction.add(firstLot);
        mainMenu(auction);
    }
}
