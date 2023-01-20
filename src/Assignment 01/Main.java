import java.util.ArrayList;

class Main {
  public static ArrayList<String> testHand1() {
    ArrayList<String> h1 = new ArrayList<String>();
    h1.add("A of Hearts");
    h1.add("K of Hearts");
    h1.add("Q of Hearts");
    h1.add("J of Hearts");
    h1.add("10 of Hearts");
    return h1;
  }
  
  public static ArrayList<String> testHand2() {
    ArrayList<String> h1 = new ArrayList<String>();
    h1.add("9 of Hearts");
    h1.add("K of Hearts");
    h1.add("Q of Hearts");
    h1.add("J of Hearts");
    h1.add("10 of Hearts");
    return h1;
  }
  
  public static ArrayList<String> testHand3() {
    ArrayList<String> h1 = new ArrayList<String>();
    h1.add("9 of Hearts");
    h1.add("9 of Spades");
    h1.add("9 of Clubs");
    h1.add("9 of Dimonds");
    h1.add("2 of Hearts");
    return h1;
  }

  public static ArrayList<String> testHand4() {
    ArrayList<String> h1 = new ArrayList<String>();
    h1.add("9 of Hearts");
    h1.add("9 of Spades");
    h1.add("2 of Clubs");
    h1.add("2 of Dimonds");
    h1.add("2 of Hearts");
    return h1;
  }
  
  public static ArrayList<String> testHand5() {
    ArrayList<String> h1 = new ArrayList<String>();
    h1.add("2 of Hearts");
    h1.add("9 of Hearts");
    h1.add("A of Hearts");
    h1.add("3 of Hearts");
    h1.add("7 of Hearts");
    return h1;
  }
  
  public static ArrayList<String> testHand6() {
    ArrayList<String> h1 = new ArrayList<String>();
    h1.add("5 of Hearts");
    h1.add("8 of Clubs");
    h1.add("9 of Dimonds");
    h1.add("7 of Spades");
    h1.add("6 of Hearts");
    return h1;
  }
  
  public static ArrayList<String> testHand7() {
    ArrayList<String> h1 = new ArrayList<String>();
    h1.add("A of Hearts");
    h1.add("A of Clubs");
    h1.add("A of Spades");
    h1.add("3 of Hearts");
    h1.add("7 of Hearts");
    return h1;
  }

  public static ArrayList<String> testHand8() {
    ArrayList<String> h1 = new ArrayList<String>();
    h1.add("A of Hearts");
    h1.add("A of Clubs");
    h1.add("7 of Spades");
    h1.add("3 of Hearts");
    h1.add("7 of Hearts");
    return h1;
  }

  public static ArrayList<String> testHand9() {
    ArrayList<String> h1 = new ArrayList<String>();
    h1.add("A of Hearts");
    h1.add("A of Clubs");
    h1.add("7 of Spades");
    h1.add("3 of Hearts");
    h1.add("K of Hearts");
    return h1;
  }
  
  public static ArrayList<String> testHand10() {
    ArrayList<String> h1 = new ArrayList<String>();
    h1.add("A of Hearts");
    h1.add("4 of Clubs");
    h1.add("7 of Spades");
    h1.add("3 of Hearts");
    h1.add("K of Hearts");
    return h1;
  }
  
  public static void main(String[] args) {
    ArrayList<String> royal = testHand1();
    ArrayList<String> straightFlush= testHand2();
    ArrayList<String> fourKind= testHand3();
    ArrayList<String> fullHouse= testHand4();
    ArrayList<String> flush= testHand5();
    ArrayList<String> straight= testHand6();
    ArrayList<String> threeKind= testHand7();
    ArrayList<String> twoPair= testHand8();
    ArrayList<String> onePair= testHand9();
    ArrayList<String> highCard= testHand10();
    
    System.out.println();
    Poker gameOne=new Poker(royal,straightFlush);
    gameOne.showHand(1);
    System.out.println(gameOne.scoreHand(1));
    gameOne.showHand(2);
    System.out.println(gameOne.scoreHand(2));
    
    System.out.println();
    Poker gameTwo=new Poker(fourKind,fullHouse);
    gameTwo.showHand(1);
    System.out.println(gameTwo.scoreHand(1));
    gameTwo.showHand(2);
    System.out.println(gameTwo.scoreHand(2));
    
    System.out.println();
    Poker gameThree=new Poker(flush,straight);
    gameThree.showHand(1);
    System.out.println(gameThree.scoreHand(1));
    gameThree.showHand(2);
    System.out.println(gameThree.scoreHand(2));
    
    System.out.println();
    Poker gameFour=new Poker(threeKind,twoPair);
    gameFour.showHand(1);
    System.out.println(gameFour.scoreHand(1));
    gameFour.showHand(2);
    System.out.println(gameFour.scoreHand(2));
    
    System.out.println();
    Poker gameFive=new Poker(onePair,highCard);
    gameFive.showHand(1);
    System.out.println(gameFive.scoreHand(1));
    gameFive.showHand(2);
    System.out.println(gameFive.scoreHand(2));
    
    System.out.println();
    Poker gameSix=new Poker();
    gameSix.showHand(1);
    System.out.println(gameSix.scoreHand(1));
    gameSix.showHand(2);
    System.out.println(gameSix.scoreHand(2));
    
  }
}