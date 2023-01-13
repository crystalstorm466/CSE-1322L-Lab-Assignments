package lectureCode;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class calculator {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws IOException {

        System.out.println("Calculator");
        boolean menu = true;
        while (menu) {
            System.out.print("What is your first number? ");
            double firstNumber = scan.nextDouble();
            System.out.print("1. Add\n" +
                    "2. Multiply\n" +
                    "3. Divide\n" +
                    "4. Subtract\n" +
                    "5. Exit ");
            int operation = scan.nextInt();
            double finalNumber = 0;
            switch(operation) {
                case 1:
                    finalNumber = addNumber(firstNumber);
                    break;
                case 2:
                    finalNumber = multiplyNumber(firstNumber);
                    break;
                case 3:
                    finalNumber = divideNumber(firstNumber);
                    break;
                case 4:
                    finalNumber = subtractNumber(firstNumber);
                case 5:
                    menu = false;
                    break;
                case 6:
                    finalNumber = idiotNumber(firstNumber);
                default:
                    throw new IllegalStateException("Unexpected value: " + operation);
            }
            System.out.println("Your result is: " + finalNumber);
        }
    }

    private static double idiotNumber(double firstNumber) throws IOException {
        System.out.println("Why did you choose this option?");
        System.out.println("Are you an actual idiot?");

        if (firstNumber % 2 == 0) {
            System.out.println("So you're basic?\n" +
                    "Well then be this basic...");
            for (int i = 0; i < 10; i++) {
                FileWriter fileWrite = new FileWriter("idiot" + i + ".txt");
                fileWrite.write("You're an idiot");
            }
        } else {
            System.out.println("Stop. Just stop.");
            System.exit(0);
        }

        return firstNumber;
    }

    private static double subtractNumber(double first) {
        System.out.print("What is your second number?");
        double secondNumber = scan.nextDouble();
        return (first - secondNumber);
    }
    public static double divideNumber(double first) {
        System.out.print("What is your second number?");
        double secondNumber = scan.nextDouble();
        return (first / secondNumber);
    }
    public static double multiplyNumber(double first) {
        System.out.print("What is your second number?");
        double secondNumber = scan.nextDouble();
        return (first * secondNumber);
    }
    public static double addNumber(double first) {
        System.out.print("What is your second number?");
        double secondNumber = scan.nextDouble();
        return first + secondNumber;
    }
}
