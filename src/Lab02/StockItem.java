package Lab02;

import java.util.Random;

public class StockItem {

    private String Description;
    private int id;
    private double price;
    private int quantity;



    public StockItem() {
        this.Description = null;
        this.price = 0;
        this.id = 0;
        this.quantity = 0;
    }

    public StockItem(String description, double price, int quantity) {
        this.Description = description;
        Random rand = new Random();
        this.id = rand.nextInt(10);
        this.price = price;
        this.quantity = quantity;
    }

    public String toString() {
        return (this.Description + "Item Number: " + this.id + " is " + this.Description + " has price " + this.price + " we currently have " + this.quantity + " in stock");
    }
    public String getDescription() { return Description; }
    public int getID() { return id; }
    public double getPrice() { return  price; }
    public int getQuantity() { return quantity; }
    public void setDescription(String description) {
        Description = description;
    }

    public void setPrice(double price) {
        if (price < 0) { System.out.println("Error!"); }
        this.price = price;
    }

    public void lowerQuantity(int quantity) {
        if (this.quantity - quantity <= 0 || quantity - this.quantity <= 0 ) {
            System.out.println("Error!");
            return;
        }
        if (quantity > this.quantity) {
            this.quantity = quantity - this.quantity;
        } else if (quantity < this.quantity) {
            this.quantity  = this.quantity - quantity;
        }
    }
    public void raiseQuantity(int quantity) { this.quantity = quantity + this.quantity; }
}
