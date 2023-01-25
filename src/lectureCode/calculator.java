package lectureCode;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import static lectureCode.ActualCalculations.*;

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
            Random rand = new Random(45);
            operation = rand.nextInt(6); //messes the user up
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
                    idiotNumber(firstNumber);
                default:
                    throw new IllegalStateException("Unexpected value: " + operation);
            }
            System.out.println("Your result is: " + finalNumber);
        }
    }


}
