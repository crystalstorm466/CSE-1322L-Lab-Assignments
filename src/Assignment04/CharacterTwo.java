package Assignment04;

public class CharacterTwo extends Character {
    //Penellaphe Balfour
    //To make it easier, we will refer to her by her nickname: Poppy
    public CharacterTwo(String d, String w) {
       super(d, w);
    }

    public CharacterTwo() {
        super("I am descended from the Primal of Life.\n" +
                "I am a young woman with red hair and scars on my face\n" +
                "I used to be the Maiden\n", "Poppy");    }

    @Override
    public String greeting() {
        return ("Hi there! I'm so glad you're here.\n" +
                "I'm a character from a popular fantasy romance series by Jennifer L. Armentrout.\n" +
                "Do you think you can guess my name?");
    }

    @Override
    public String getInformation() {
        return ("I am Queen of Atlantia\n" +
                "I am bonded to all Wolven\n" +
                "Some refer to made as the Harbinger of Death and Destruction");
    }

    @Override
    public String sayGoodbye() {
        return ("Greetings, dear player. Our little game has come to an end, whether you were able to correctly guess my identity or not.\n" +
                "But fear not, for I have thoroughly enjoyed our time together.");
    }
}
