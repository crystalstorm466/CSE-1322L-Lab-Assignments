package Lab04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean menu = true;
        Account checkingsAccount = new Checking();
        Account savingsAccount = new Account();

        do {
            System.out.print("1. Withdraw from Checking\n" +
                    "2. Withdraw from Savings\n" +
                    "3. Deposit to Checking" +
                    "4. Deposit to Savings\n" +
                    "5. Balance of Checkings\n" +
                    "6. Balance of Savings\n" +
                    "7. Award Interest to Savings now\n" +
                    "8. Quit" +
                    " ");
            int userInput = scan.nextInt();
            switch(userInput) {
                case 1:
                    System.out.print("How much do you want to withdrawal? ");
                    int userWidth = scan.nextInt();
                    checkingsAccount.withdrawal(userWidth);
                    break;
                case 2:
                    System.out.print("How much do you want to withdraw? ");
                    userWidth = scan.nextInt();
                    savingsAccount.withdrawal(userWidth);
                    break;
                case 3:
                    System.out.print("How muh do you want to deposit? ");
                    int userDepos = scan.nextInt();
                    checkingsAccount.deposit(userDepos);
                    break;
                case 4:
                    System.out.print("How muh do you want to deposit? ");
                    userDepos = scan.nextInt();
                    savingsAccount.deposit(userDepos);
                    break;
                case 5:
                    System.out.println("Your balance is: $" + checkingsAccount.getAccountBalance());
                    break;
                case 6:
                    System.out.println("Your balance is: $" + savingsAccount.getAccountBalance());
                    break;
                case 7:
                    savingsAccount.addInterest();
                    break;
                case 8:
                    System.exit(101);
                    break;
            }
        } while (menu);
    }

}
