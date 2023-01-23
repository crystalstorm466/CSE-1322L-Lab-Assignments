package Lab03;

import java.util.*;

public class Quiz {
    private ArrayList<Question> QuestionsList = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);
    public void add_question(String question, String answer, int diff) {
        Question newQuestion = new Question(question, answer, diff);
        QuestionsList.add(newQuestion);
    }

    public void remove_question() {
        for (int i = 0; i < QuestionsList.size(); i++) {
            System.out.println(i + ": " + QuestionsList.get(i));
        }
        System.out.print("What question do you want to remove? ");
        int userInput = scan.nextInt();
        QuestionsList.remove(userInput);
    }

    public void modify_question() {
        for (int i = 0; i < QuestionsList.size(); i++) {
            System.out.println(i + ": " + QuestionsList.get(i));
        }
        System.out.print("What question do you want to modify? ");
        int userInput = scan.nextInt();
        System.out.print("What is the new question? ");
        String ques = scan.nextLine();
        System.out.println("What is the new answer? ");
        String ans = scan.nextLine();
        System.out.print("What is the new difficulty? ");
        int diff = scan.nextInt();
        QuestionsList.remove(userInput);
        Question modifyQuestion = new Question(ques, ans, diff);
        QuestionsList.add(modifyQuestion);
    }

    public void give_quiz() {
        int correct_Answers = 0;
        int quizSize = 0;
        for (int i = 0; i < QuestionsList.size(); i++) {
            System.out.println(i + ": " + QuestionsList.get(i));
            quizSize++;
            String answer = scan.nextLine();
            if (answer.toLowerCase().contains((CharSequence) QuestionsList.get(i)))  {
                System.out.println("Correct!");
                correct_Answers++;
            }
        }
        System.out.println(correct_Answers / quizSize + " correct.");
    }
}
