package Lab03;

import java.util.*;

public class Quiz {
    private ArrayList<Question> QuestionsList = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);
    public void add_question() {
        System.out.print("What is the question? ");
        String ques = scan.nextLine();
        scan.nextLine();
        System.out.print("What is the answer? ");
        String ans = scan.nextLine();
        System.out.print("What is the difficulty? ");
        int diff = scan.nextInt();
        Question newQuestion = new Question(ques, ans, diff);
        QuestionsList.add(newQuestion);
    }

    public void remove_question() {
        for (int i = 0; i < QuestionsList.size(); i++) {
            System.out.println(i + ": " + QuestionsList.get(i).getQuestionText() + "?");
        }
        System.out.print("What question do you want to remove? ");
        int userInput = scan.nextInt();
        QuestionsList.remove(userInput);
    }

    public void modify_question() {
        for (int i = 0; i < QuestionsList.size(); i++) {
            System.out.println(i + ": " + QuestionsList.get(i).getQuestionText());
        }
        System.out.print("What question do you want to modify? ");
        int userInput = scan.nextInt();

        System.out.print("What is the new question? ");
        QuestionsList.get(userInput).setQuestionText(scan.nextLine());
        System.out.print("What is the new answer? ");
        QuestionsList.get(userInput).setQuestionAnswer(scan.nextLine());
        System.out.print("What is the new difficulty? ");
        QuestionsList.get(userInput).setDifficulty(scan.nextInt());
    }

    public void give_quiz() {
        int correct_Answers = 0;
        int quizSize = 0;
        for (int i = 0; i < QuestionsList.size(); i++) {
            System.out.println(i + ": " + QuestionsList.get(i).getQuestionText());
            quizSize++;
            String answer = scan.nextLine();
            scan.nextLine();
            if (answer.equalsIgnoreCase(QuestionsList.get(i).getQuestionAnswer()))  {
                System.out.println("Correct!");
                correct_Answers++;
            }
        }
        System.out.println(correct_Answers / quizSize + " out of " + quizSize + " correct.");

    }
}
