package Assignment03;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        ArrayList<Customer> customerArrayList = new ArrayList<Customer>();
        MainMenu(customerArrayList);
    }

    private static void MainMenu(ArrayList<Customer> customerArrayList) {
        boolean menu = true;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("1. Take test for new license\n" +
                    "2. Renew exsiting license\n" +
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
                    newTest driverTest = new newTest(name, DOB);
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
                    for (Customer customer : customerArrayList) {
                        System.out.println(customer.getCustomerInfo());
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    //menu = false;
                    System.exit(401);
                    break;
                default:
                    System.out.println("Invalid Option " + userChoice + "! Please try again!");
                    //throw new IllegalStateException("Unexpected value: " + userChoice);
            }


        } while(menu);

    }
}
