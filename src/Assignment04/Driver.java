package Assignment04;
import java.util.*;
public class Driver {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Room newRoom = new Room();
            System.out.println("If you know who it is guess, if you don't type hint");
            String theGuess = myScan.nextLine();
            if (theGuess.equals("hint")) {
                newRoom.askForSecret();
                System.out.println("OK, so who is it?");
                String finalGuess = myScan.nextLine();
                newRoom.guessWho(finalGuess);
            } else {
                newRoom.guessWho(theGuess);
            }
        }
    }
}
