package Lab03;

public class Question {
    private String questionText;
    private String questionAnswer;
    private int difficulty;
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

    public void setQuestionText(String questionText) { this.questionText = questionText; }
    public void setQuestionAnswer(String questionAnswer) { this.questionAnswer = questionAnswer; }
    public void setDifficulty(int difficulty) { this.difficulty = difficulty; }



}
