package Lab02;
import java.util.*;

public class Lab2A {
    public static void main(String[] args) {

        StockItem Milk = new StockItem("1 Gallon of Milk", 3.60, 15);
        StockItem Bread = new StockItem("1 Loaf of Bread", 1.98, 30);
        Scanner scan = new Scanner(System.in);
        boolean menu = true;
        do {
            System.out.println("Please select from the following options: \n" +
                    "1. Sold One Milk\n" +
                    "2. Sold One Bread\n" +
                    "3. Change price of Milk\n" +
                    "4. Change price of Bread\n" +
                    "5. Add Milk to Inventory\n" +
                    "6. Add Bread to Inventory\n" +
                    "7. See Inventory\n" +
                    "8. Quit");
            System.out.print(" ");
            int userInput = scan.nextInt();

            switch (userInput) {
                case 1:
                    Milk.lowerQuantity(1);
                    break;
                case 2:
                    Bread.lowerQuantity(1);
                    break;
                case 3:
                    System.out.print("What is the new price of Milk? ");
                    double price = scan.nextDouble();
                    Milk.setPrice(price);
                    break;
                case 4:
                    System.out.print("What is the new price of Bread? ");
                    double priceBread = scan.nextDouble();
                    Bread.setPrice(priceBread);
                    break;
                case 5:
                    Milk.raiseQuantity(1);
                    break;
                case 6:
                    Bread.raiseQuantity(1);
                    break;
                case 7:
                    System.out.println(Milk);
                    System.out.println(Bread);
                    break;
                case 8:
                    menu = false;
                    break;
            }
        } while(menu);

    }
}
