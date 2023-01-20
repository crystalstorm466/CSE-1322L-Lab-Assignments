import java.util.ArrayList;

public class Poker {

    private PlayingCards deck;
    ArrayList<String> hand1 = new ArrayList<String>();
    ArrayList<String> hand2 = new ArrayList<String>();

    Poker() {
        deck = new PlayingCards();
        deck.Shuffle();
        deslHands();
    }

    Poker(ArrayList<String> hand1, ArrayList<String>hand2) {
        deck = new PlayingCards();
        this.hand1 = hand1;
        this.hand2 = hand2;

    }
    void deslHands() {
        for (int i = 0; i <= 5; i++) {
            hand1.add(deck.getNextCard());
            hand2.add(deck.getNextCard());
        }
    }
    void showHand(int show) {
        if (show == 1) {
            System.out.println("Player 1's Hand:");
            for (int i = 0; i < hand1.size(); i++) {
                System.out.print(hand1.get(i) + ", ");
            }
            System.out.println(" ");
        } else if (show == 2) {
            System.out.println("Player 2's Hand:");
            for (int i = 0; i < hand2.size(); i++) {
                System.out.print(hand2.get(i) + ", ");
            }
            System.out.println();
        }
    }

    ArrayList<Integer> countSuite(ArrayList<String> currentHand) {
        ArrayList<Integer> counters = new ArrayList<>();
        int clubs = 0;
        int diamonds = 0;
        int spades = 0;
        int hearts = 0;
        for (int i = 0; i < currentHand.size(); i++) {
            switch (currentHand.get(i).toLowerCase()) {
                case "clubs":
                    clubs = clubs + 1;
                    break;
                case "diamonds":
                    diamonds = diamonds + 1;
                    break;
                case "hearts":
                    hearts = hearts + 1;
                    break;
                case "spades":
                    spades = spades + 1;
                    break;
            }
        }
        counters.add(clubs); //0
        counters.add(diamonds); //1
        counters.add(hearts);
        counters.add(spades);

        return counters;
    }

    int[] countValues (ArrayList<String> currentHand) {
        int[] arrayValues = new int[14];
        for (int i = 0; i < currentHand.size(); i++) {
            String currentCell = currentHand.get(i).toLowerCase();
            switch(currentCell) {
                case "ace":
                    arrayValues[1]++;
                    break;
                case "2":
                    arrayValues[2]++;
                    break;
                case "3":
                    arrayValues[3]++;
                    break;
                case "4":
                    arrayValues[4]++;
                    break;
                case "5":
                    arrayValues[5]++;
                    break;
                case "6":
                    arrayValues[6]++;
                    break;
                case "7":
                    arrayValues[7]++;
                    break;
                case "8":
                    arrayValues[8]++;
                    break;
                case "9":
                    arrayValues[9]++;
                    break;
                case "10":
                    arrayValues[10]++;
                    break;
                case "j":
                    arrayValues[11]++;
                    break;
                case "q":
                    arrayValues[12]++;
                    break;
                case "k":
                    arrayValues[13]++;
                    break;
            }
            // arrayValues[Integer.parseInt(currentHand.get(i))] = 3;
        }
        return arrayValues;
    }

    int numPairs(int[] values) {
        int pairs = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == 2) {
                pairs++;
            }
        }
        return pairs;
    }

    int threeOfAKind(int[] countValues) {
        for (int i = 0; i < countValues.length; i++) {
            if (countValues[i] == 3) {
                return countValues[i];
            } else {
                return 0;
            }
        }
        return 0;
    }
    int fourOfAKind(int[] countValues) {
        for (int i = 0; i < countValues.length; i++) {
            if (countValues[i] == 4) {
                return countValues[i];
            } else {
                return 0;
            }
        }
        return 0;
    }

    boolean fullHouse(int[] countValues) {
        for (int i = 0; i < countValues.length; i++) {
            if (countValues[i] == threeOfAKind(countValues) && countValues[i] == numPairs(countValues)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    boolean straight(int[] countValues) {
        int sequential = 1;
        for (int i = 0; i < countValues.length; i++) {
            if (sequential >= 2) {
                return true;
            } else {
                if (countValues[i] == 1) {
                    sequential++;
                    //I think this is correct
                }
            }

        }
        return false;
    }
    boolean flush(int[] countValues) {
        for (int i = 0; i < countValues.length; i++) {
            if (countValues[i] == 5) {
                return true;
            }
        }
        return  false;
    }

    boolean straightFlush(int[] countValues, ArrayList<Integer> countSuite) {
        if (straight(countValues) && flush(countValues)) {
            return true;
        } else {
            return false;
        }
    }

    boolean royalFlush(int[] countValues, ArrayList<Integer> countSuite) {
        if (countSuite.get(0) == 5 && countSuite.get(1) == 5 && countSuite.get(2) == 5 && countSuite.get(3) == 5
         && countSuite.get(10) == 1 && countSuite.get(11) == 1 && countSuite.get(12) == 1 && countSuite.get(13) == 1) {
            return true;
        } else {
            return false;
        }
    }

    String scoreHand(int score) {
        if (score == 1) {
            if (royalFlush(countValues(hand1), countSuite(hand1))) {
                return "Royal Flush";
            } else if (straightFlush(countValues(hand1),countSuite(hand1))) {
                return "Straight Flush";
            } else if (fourOfAKind(countValues(hand1)) == 4) {
                return "Four of a Kind";
            } else if (fullHouse(countValues(hand1))) {
                return "Full House";
            } else if (flush(countValues(hand1))) {
                return "Flush";
            } else if (straight(countValues(hand1))) {
                return "Straight";
            } else if (threeOfAKind(countValues(hand1)) == 3) {
                return "Three Of a Kind";
            } else if ((numPairs(countValues(hand1)) >= 2) || (numPairs(countValues(hand2)) >= 2)) {
                if ((numPairs(countValues(hand1)) >= numPairs(countValues(hand2)))) {
               return "Two Pairs";
                } else {
                    return "Two Pairs";
                }
            } else {
                return "High Card";
            }
        } else {
            if (royalFlush(countValues(hand2), countSuite(hand2))) {
                return "Royal Flush";
            } else if (straightFlush(countValues(hand2),countSuite(hand2))) {
                return "Straight Flush";
            } else if (fourOfAKind(countValues(hand2)) == 4) {
                return "Four of a Kind";
            } else if (fullHouse(countValues(hand2))) {
                return "Flush";
            } else if (flush(countValues(hand2))) {
                return "Straight";
            } else if (straight(countValues(hand2))) {
                return "Three Of a Kind";
            } else if (threeOfAKind(countValues(hand2)) == 3) {
                return "Two Pairs";
            } else if ((numPairs(countValues(hand2)) >= 2) || (numPairs(countValues(hand1)) >= 2)) {
                if ((numPairs(countValues(hand2)) >= numPairs(countValues(hand1)))) {
                    return "Two Pairs";
                } else {
                    return "Two Pairs";
                }
            } else {
                return "High Card";
            }
        }
    }

}
