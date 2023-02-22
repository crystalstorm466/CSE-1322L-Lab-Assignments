package Assignment04;

public abstract class Character implements ISpeak{
    private String description=null;
    private String whoami=null;
    public Character(String d, String w) {
        description=d;
        whoami=w;
    }
    public String getDescription() {
        return description;
    }
    public boolean guessWho(String guess) {
        return guess.equalsIgnoreCase(whoami);
    }
    public String getCharacterName() {
        return whoami;
    }
    public abstract String greeting();
    public abstract String getInformation();
    public abstract String sayGoodbye();
}
