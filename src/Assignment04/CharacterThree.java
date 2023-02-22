package Assignment04;

public class CharacterThree extends Character{
    //Evangline Samos
    //whoami = Evangeline
    public CharacterThree(String d, String w) {
        super(d, w);
    }

    public CharacterThree() {
        //Answer will be Evangeline
        super("This individual is a member of a powerful and privileged family known for their unique abilities and their control over the kingdom.", "Evangeline");
    }

    @Override
    public String greeting() {
        return ("Greetings. I am a Silver of House Samos, and I wield metal as easily as you breathe.\n" +
                "You should be honored to meet me, for I am destined to rule this kingdom [Norta] with my betrothed.\n" +
                "Do not dare to cross me, or you will feel the wrath of my iron claws.");
    }

    @Override
    public String getInformation() {
        return ("I come from a long line of Silvers.\n" +
                "I was engaged to the Crown Prince of Norta\n" +
                "I often weave my metal into my outfits\n" +
                "I don't like that Little Lightning Girl.");
    }

    @Override
    public String sayGoodbye() {
        return "Greetings, darling. It appears that our time together has come to an end, whether you guessed correctly or not.\n" +
                "But fear not, for I have enjoyed this little game of ours.";
    }
}
