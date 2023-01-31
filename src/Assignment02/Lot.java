package Assignment02;

public class Lot {

    private String description;
    private int currentBid;
    private int bidIncrements;
    private boolean sold;

    private static int lotNumber = 1000;

    public Lot() {
        lotNumber++;
        this.description = "Unknown Item";
        this.currentBid = 0;
        this.bidIncrements = 0;
        this.sold = false;
    }

    public Lot(String desc, int startBid, int bidIncrements) {
        lotNumber++;
        this.description = desc;
        this.currentBid = startBid;
        this.bidIncrements = bidIncrements;
        this.sold = false;
    }

    public String toString()  {
        if (sold) {
            return ("Lot " + lotNumber + ". " + description + " was sold for $" + currentBid);
        } else {
            return ("Lot " + lotNumber + ". " + description + " current bid $" + currentBid + " minimum bid $" + nextBid());
        }
    }


    public void markSold() { this.sold = true; }

    public boolean getSold() { return sold; }

    public int getCurrentBid() { return currentBid; }

    public int getBidIncrements() { return bidIncrements; }
    public String getDescription() { return description; }

    public void setCurrentBid(int currentBid) { this.currentBid = currentBid; }

    public int nextBid() { return (currentBid + bidIncrements); }

}
