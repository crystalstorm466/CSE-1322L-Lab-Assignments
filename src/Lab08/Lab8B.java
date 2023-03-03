package Lab08;

import java.util.*;

public class Lab8B {
    public static String repeatNTimes(String s, int repeater) {
        if (repeater == 0) { return " "; }
        repeater--;
        return s + repeatNTimes(s, repeater);
    }
    public static boolean isReverse(String s1, String s2) {
        if (s1.length() != s2.length()) { return false; }
        if (s1.length() == 0) { return true; }
        if (s1.charAt(0) != s2.charAt(s2.length() - 1)) { return false; }
        return isReverse(s1.substring(1), s2.substring(0, s2.length() - 1));
    }
    public static void main(String[] args) {
        System.out.print(repeatNTimes("I must study recursion until it makes sense\n", 100));
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the new string? ");
        String s1 = scan.nextLine();
        System.out.print("What is the second string? ");
        String s2 = scan.nextLine();
        if (isReverse(s1, s2)) {
            System.out.println(s1 + " is the reverse of " + s2);
        } else {
            System.out.println(s1 + " is not the reverse of " + s2);
        }
    }
}
