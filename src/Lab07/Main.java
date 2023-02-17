package Lab07;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            Calculator newCalculation = new Calculator();
            System.out.println("0 - Exit\n" +
                    "1. - Addition\n" +
                    "2. - Subtraction\n" +
                    "3. - Multiplication\n" +
                    "4. - Division");
            System.out.print("Please choose an option: ");
            int userInput = scan.nextInt();
            Random rand = new Random();
            switch(userInput) {
                case 0:
                    System.exit(rand.nextInt(23));
                    break;
                case 1:
                    System.out.print("Please enter the first number ");
                    float num1 = scan.nextFloat();
                    System.out.print("Please enter the second number ");
                    float num2 = scan.nextInt();
                    System.out.println(newCalculation.add(num1, num2));
                    break;
                case 2:
                    System.out.print("Please enter the first number ");
                    num1 = scan.nextFloat();
                    System.out.print("Please enter the second number ");
                    num2 = scan.nextInt();
                    System.out.println(newCalculation.subtract(num1, num2));
                    break;
                case 3:
                    System.out.print("Please enter the first number ");
                    num1 = scan.nextFloat();
                    System.out.print("Please enter the second number ");
                    num2 = scan.nextInt();
                    System.out.println(newCalculation.multiply(num1, num2));
                    break;
                case 4:
                    System.out.print("Please enter the first number ");
                    num1 = scan.nextFloat();
                    System.out.print("Please enter the second number ");
                    num2 = scan.nextInt();
                    System.out.println(newCalculation.divide(num1, num2));
                    break;
                default:
                    System.out.println("Invalid Value: " + userInput);
                    System.out.println("Please try again!");
                    break;
                 //   throw new IllegalStateException("Unexpected value: " + userInput);
            }
        }
    }
}
