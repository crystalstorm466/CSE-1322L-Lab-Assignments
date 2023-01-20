package Lab03;

public class Question {
    private final String questionText;
    private final String questionAnswer;
    private final int difficulty;
    public Question(String question, String answer, int diff ) {
        this.questionText = question;
        this.questionAnswer = answer;
        this.difficulty = diff;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public String getQuestionAnswer() {
        return questionAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }


}
