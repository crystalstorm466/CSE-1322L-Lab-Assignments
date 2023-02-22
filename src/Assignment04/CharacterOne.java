package Assignment04;

public class CharacterOne extends Character {
    //Massie Block
    private String description = "I am the alpha, and founder of the Pretty Committee\n" +
            "I have glossy brown hair and amber eyes\n" +
            "I'm incredibly rich\n" +
            "I attend Octavian County Day School\n";
    private String whoami = "Massie";
    public CharacterOne(String d, String w) {
        super(d, w);
    }

    public CharacterOne () {
        super("She is the leader of the Pretty Committee and the most popular girl at Octavian Country Day (OCD). \n" +
                "She has thick brunette hair, amber eyes with golden specks, and a laser-whitened smile. \n" +
                "She loves designer clothes, Chanel perfume, and setting trends. \n" +
                "She is confident, snobby, and sometimes mean.", "Massie");
    }

    @Override
    public String greeting() {
        return ("Hello, darling. You must be new here.");
    }

    @Override
    public String getInformation() { return description; }

    @Override
    public String sayGoodbye() {
        return "it's time for me to bid you adieu.\n" +
                "Keep your head up and your fashion game on point, and who knows, maybe we'll cross paths again someday.\n" +
                "Until then, kisses, dahling!";
    }
}
