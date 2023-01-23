package Lab03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Quiz quiz1 = new Quiz();
        boolean menu = true;
        do {
            System.out.print("Please choose an option:\n" +
                    "1. Add a question to the quiz\n" +
                    "2. Remove a question from the quiz\n" +
                    "3. Modify a question in the the quiz\n" +
                    "4. Take the quiz\n" +
                    "5. Quit ");
            Scanner scan = new Scanner(System.in);
            int userInput = scan.nextInt();
            switch(userInput) {
                case 1:
                    quiz1.add_question();
                    break;
                case 2:
                    quiz1.remove_question();
                    break;
                case 3:
                    quiz1.modify_question();
                    break;
                case 4:
                    quiz1.give_quiz();
                    break;
                case 5:
                    System.exit(0);
                default:
                  //  throw new IllegalStateException("Unexpected value: " + userInput); //generated from intelliJ auto-complete
                    System.out.println("Invalid Option! Option: " + userInput + "4\nPlease try again!");
                    break;
            }
        } while (menu);
    }
}
