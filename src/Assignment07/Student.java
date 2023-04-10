package Assignment07;

public class Student {
    private int[] quizScore = new int[10];
    private int[] homeworkScore = new int[10];
    private int midtermGrade;
    private int finalGrade;
    private int homeworkAverage;
    private int overallAverage;
    private int quizAverage;

    private String Name;
    private int ID;

    public Student(String name) {
        String[] nameSplStrings = name.split(",");
        this.Name = nameSplStrings[0];
        this.ID = Integer.parseInt(nameSplStrings[1]);
   
        for (int i = 2; i < 12; i++) {
            this.quizScore[i-2] = Integer.parseInt(nameSplStrings[i]);
        } 
        for (int i = 12; i < 22; i++) {
            this.homeworkScore[i-12] = Integer.parseInt(nameSplStrings[i]);
        }
        this.midtermGrade = Integer.parseInt(nameSplStrings[22]);
        this.finalGrade = Integer.parseInt(nameSplStrings[23]);
    }

    public String getName() { return Name; }
    public int getID() { return ID; }

    public void calcQuizAverage() {
        //quiz weight is 40%
        //lowest is dropped
        int sumQuiz = 0;
        int lowest = this.quizScore[0];
        for (int j : this.quizScore) {
            if (j < lowest) {
                lowest = j;
             //   continue;
            }
            sumQuiz += quizAverage;
        }
        this.quizAverage = (sumQuiz - lowest) / quizScore.length - 1;
        this.quizAverage *= 0.4;
    }


    public int[] getQuizScore() { return quizScore; }
    public int[] getHomeworkScore() { return homeworkScore; }

    public void calcHWAverage() {
        //lowest is dropped
        //homework weight is 10%
        int sumHw = 0;
        int lowest = this.homeworkScore[0];
        for ( int j : this.homeworkScore) {
            if ( j < lowest) {
                lowest = j;
           //     continue;
            }
            sumHw += homeworkAverage;
        }
        this.homeworkAverage =  (sumHw - lowest) /(homeworkScore.length);
    }

    public void calcOverallAverage() {
        //quiz - 40%
        //hw - 10%
        //midterm - 20%
        //final - 30%
        double weightedhw = 0.1 * this.homeworkAverage;
        double weightedquiz = 0.4 * this.quizAverage;
        double weightedmidterm = 0.2 * this.midtermGrade;
        double weightedFinal = 0.3 * this.finalGrade;
        overallAverage = (int) (weightedhw + weightedquiz + weightedmidterm + weightedFinal)/100;
    }

    public String getGrade() {
        return ("HW Average: " + homeworkAverage + ".\nFinal Exam Average: " + finalGrade + ".\nOverall Average: " + overallAverage + ".");
    }


}
