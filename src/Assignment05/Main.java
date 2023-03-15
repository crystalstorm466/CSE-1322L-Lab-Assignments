package Assignment05;

import java.util.Scanner;

public class Main {

    public static String reverseString(String given) {
        char[] givenArray = given.toCharArray();
        String reverse = " ";
        for (int i = givenArray.length-1; i >=0; i--) {
            reverse += givenArray[i];
        }

        return reverse;
    }

    public static String paperFold(int n) {
        if (n == 1) { return "v"; }
        //return symbol + paperFold(n - 1, symbol) + convertV(symbol);
        return paperFold(n - 1) + "v" + replace(paperFold(n - 1));
    }

    public static String replace(String v) {
        StringBuilder sb = new StringBuilder(v);
        return sb.reverse().toString().replaceAll("v", "^").replaceAll("\\^", "v");
    }

    private static String convertV(String symbol) {
        if (symbol.equalsIgnoreCase("v")) {
            return "^";
        } else if (symbol.equalsIgnoreCase("^")) {
            return "v";
        } else {
            return "Error.";
        }
    }

    public static void main(String[] args) {
        System.out.print("What is the string you want to reverse?: ");
        Scanner scan = new Scanner(System.in);
        System.out.println(reverseString(scan.nextLine()));
        for(int i=1;i<10;i++) {
            String fold_string=paperFold(i);
            System.out.println("For "+i+" folds we get: "+fold_string+"\n");
        }
    }
}
