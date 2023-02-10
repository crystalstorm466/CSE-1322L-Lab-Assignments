package Assignment03;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Customer> customerArrayList = new ArrayList<>();
        menu(customerArrayList);
    }

    private static void menu(ArrayList<Customer> customerArrayList) {
        boolean menu = true;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("1. Take test for new license\n" +
                    "2. Renew existing license\n" +
                    "3. Move from out of state\n" +
                    "4. Answer citation/suspended license\n" +
                    "5. See current queue\n" +
                    "6. Quit\n" +
                    " ");
            int userChoice = scan.nextInt();
            switch(userChoice) {
                case 1:
                    System.out.print("What is your name? (First name only) ");
                    String name = scan.next();
                    System.out.print("What is your date of birth? ");
                    String DOB = scan.next();
                    NewTest driverTest = new NewTest(name, DOB);
                    customerArrayList.add(driverTest);
                    break;
                case 2:
                    System.out.print("What is your name? (First name only) ");
                    name = scan.next();
                    Renew renewCustomer = new Renew(name);
                    customerArrayList.add(renewCustomer);
                    break;
                case 3:
                    System.out.print("What is your name? (First name only) ");
                    name = scan.next();
                    System.out.print("What is the state that you're coming from? ");
                    String state = scan.next();
                    Move mover = new Move(name, state);
                    customerArrayList.add(mover);
                    break;
                case 4:
                    System.out.print("What is your name? (First name only) ");
                    name = scan.next();
                    System.out.print("Why is your license suspended? ");
                    String suspension = scan.next();
                    Suspended badCustomer = new Suspended(name, suspension);
                    customerArrayList.add(badCustomer);
                    break;
                case 5:
                    for (Customer customer : customerArrayList) { //I had the other type of for loop but IntelliJ told me to use this type instead
                        System.out.println(customer.getCustomerInfo());
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    //menu = false;
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Option " + userChoice + "! Please try again!");
                    break;
                    //throw new IllegalStateException("Unexpected value: " + userChoice);
            }


        } while(menu);

    }
}
