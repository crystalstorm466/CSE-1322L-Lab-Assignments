package Lab08;

import java.util.Random;
import java.util.Scanner;

public class Lab8A {

    public static int sumNums(int maxNum) {
        if (maxNum == 0) {
            return 0;
        } else {
            return sumNums(maxNum - 1) + maxNum;
        }

    }

    public static int recursive_multiply(int a, int b) {
        // 0 * 1 + maxnum
        if (b == 0 || a == 0) {
            return 0;
        } else  if (b < 0 ){ return a + recursive_multiply(a, b + 1);
        } else { return a + recursive_multiply(a, b - 1); }
    }

    public static int recursive_div(int a, int b) {

        if ( b == 0) {
            return 0;
        } else if (a - b == 0) { return 1; }

        if (a < b ) {
            System.out.println("Error! Can't divide by 0!");
            return -1;
        } else { return 1 + recursive_div(a - b, b); }
    }

    public static int recursive_mod(int a, int b) {

        if ( b == 0 ) {
            System.out.println("Error! Can't divide by 0!");
            return -1;
        }
        if ( a < b ) {
            return a; }
        else {
            return recursive_mod(a - b, b);
        }
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("0. Quit\n" +
                    "1. Multiply 2 numbers\n" +
                    "2. Div 2 numbers\n" +
                    "3. Mod 2 numbers\n" +
                    "");
            int userInput = scan.nextInt();
            switch(userInput) {
                case 0:
                    Random rand = new Random();
                    System.exit(rand.nextInt(rand.nextInt(1000))); //wanted to use rng for the exit code
                    break;
                case 1:
                    System.out.print("Enter first number ");
                    int first = scan.nextInt();
                    System.out.print("Enter second number ");
                    int second = scan.nextInt();
                    System.out.println("Answer: " + recursive_multiply(first, second));
                    break;
                case 2:
                    System.out.print("Enter first number ");
                    first = scan.nextInt();
                    System.out.print("Enter second number ");
                    second = scan.nextInt();
                    System.out.println("Answer: " + recursive_div(first, second));
                    break;
                case 3:
                    System.out.println("Enter first number ");
                    first = scan.nextInt();
                    System.out.print("Enter second number ");
                    second = scan.nextInt();
                    System.out.println("Answer: " + recursive_mod(first, second));
                    break;
                default:
                    System.out.println("Invalid value: " + userInput + " Please try again!");
                   // throw new IllegalStateException("Unexpected value: " + userInput);
            }
        }while(true);
    }

}
