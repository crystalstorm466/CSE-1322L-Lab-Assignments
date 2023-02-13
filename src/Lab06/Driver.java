package Lab06;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int fib = scan.nextInt();

        FibFormula formulaOne = new FibFormula();
        FindIteration fibIter = new FindIteration();


        System.out.println("Fib of " + fib + " by iteration is: " + fibIter.calculate_fib(fib));
        System.out.println("Fib of " + fib + " by formula is: " + formulaOne.calculate_fib(fib));
    }
}
