import java.util.ArrayList;
import java.util.Random;

class PlayingCards {
  private ArrayList<String> deck = new ArrayList<String>();

  public PlayingCards() {
    String[] suite = new String[] {"Clubs","Dimonds","Hearts","Spades"};
    String[] values= new String[] {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    for(int i=0;i<4;i++) {
      for(int j=0;j<13;j++) {
        String newCard=values[j]+" of "+suite[i];
        deck.add(newCard);
      }
    }
  }

  public void Shuffle() {
    Random myRand=new Random();
    int numShuffles=myRand.nextInt(500);
    int numCards=deck.size();
    for(int i=0;i<numShuffles;i++) {
      int cardOne=myRand.nextInt(numCards);
      int cardTwo=myRand.nextInt(numCards);

      String tempCard=deck.get(cardOne);
      deck.set(cardOne,deck.get(cardTwo));
      deck.set(cardTwo,tempCard);
    }
  }

  public String getNextCard() {
    String nc;
    if(deck.size()>0) {
      nc=deck.get(0);
      deck.remove(0);
    }
    else {
      nc="Deck is empty";
    }
    return nc;
  }


}