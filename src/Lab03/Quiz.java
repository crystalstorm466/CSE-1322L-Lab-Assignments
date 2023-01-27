package Lab03;

import java.util.*;

public class Quiz {
    private ArrayList<Question> QuestionsList = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);
    public void add_question() {
        System.out.print("What is the question? ");
        scan.nextLine();
        String ques = scan.nextLine();
        System.out.print("What is the answer? ");
        scan.nextLine();
        String ans = scan.nextLine();
        ans.toLowerCase();
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
        String newQues = scan.nextLine();
        scan.nextLine();
        QuestionsList.get(userInput).setQuestionText(newQues);
        System.out.print("What is the new answer? ");
        String newAns = scan.nextLine();
        QuestionsList.get(userInput).setQuestionAnswer(newAns);
        System.out.print("What is the new difficulty? ");
        int diff = scan.nextInt();
        QuestionsList.get(userInput).setDifficulty(diff);
    }

    public void give_quiz() {
        int correct_Answers = 0;
        int quizSize = 0;
        for (int i = 0; i < QuestionsList.size(); i++) {
            quizSize++;
            System.out.println(i+1 + ": " + QuestionsList.get(i).getQuestionText());
            scan.nextLine();
            String answer = scan.nextLine();
            answer.toLowerCase();
            if (answer.equals(QuestionsList.get(i).getQuestionAnswer()))  {
                System.out.println("Correct!");
                correct_Answers++;
            } else {
                System.out.println("Incorrect");
            }
        }
        System.out.println("You got " + correct_Answers + " correct out of " + quizSize);
    }
}
