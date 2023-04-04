package Lab12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BlueRayCollection blueRayCollection = new BlueRayCollection();
        while (true) {
            System.out.println("0. Quit\n" +
                    "1. Add BlueRay to Collection\n" +
                    "2. See Collection");
            Scanner scan = new Scanner(System.in);
            int user = scan.nextInt();
            switch(user) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("What is the title? ");
                    String title = scan.nextLine();
                    scan.next();
                    System.out.println("What is the director? ");
                    String director = scan.nextLine();
                    scan.next();
                    System.out.print("What is the year of release: ");
                    int year = scan.nextInt();
                    System.out.print("What is the cost?: ");
                    double cost = scan.nextDouble();
                    blueRayCollection.add(title, director, year, cost);
                    break;
                case 2:
                    blueRayCollection.showAll();
                    //todo
                    break;
                default:
                  //  throw new IllegalStateException("Unexpected value: " + user);
                    System.out.println("Wrong input! " + user);
                    break;
            }
        }
    }
}