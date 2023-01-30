package Lab05;

import java.util.ArrayList;
import java.util.Scanner;

public class myCollection {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Item> Library = new ArrayList<>();
        for (int i = 0; i <= 5; i++) {
            System.out.print("Please enter B for Book or P for Periodical");
            String userChar = scan.next();
            if (userChar.equalsIgnoreCase("B")) {
                System.out.print("What is the title? ");
                String title = scan.nextLine();
                System.out.print("What is the author? ");
                String author = scan.nextLine();
                System.out.print("What is the ISBN Number? ");
                int isbn = scan.nextInt();
                Item newBook = new Book(isbn, author, title);
                Library.add(newBook);
            } else if (userChar.equalsIgnoreCase("C")) {
                System.out.print("What is the title? ");
                String tile = scan.nextLine();
                System.out.print("What is the issue number? ");
                int issue = scan.nextInt();
                Item newPeriod = new Periodical(tile, issue);
                Library.add(newPeriod);
            }
        }

        for (Item item : Library) {
            System.out.println(item.getListing());
        }
    }
}
