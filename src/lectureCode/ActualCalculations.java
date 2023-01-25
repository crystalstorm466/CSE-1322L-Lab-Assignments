package lectureCode;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ActualCalculations {
    public static Scanner scan = new Scanner(System.in);
    public static void idiotNumber(double firstNumber) throws IOException {
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
    }
    public static double subtractNumber(double first) {
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
