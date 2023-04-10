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
            this.quizScore[i] = Integer.parseInt(nameSplStrings[i]); //quiz
        }
        for (int i = 10; i < 21; i++) {
            this.homeworkScore[i] = Integer.parseInt(nameSplStrings[i]); // hw
        }
        this.midtermGrade = Integer.parseInt(nameSplStrings[21]);
        this.finalGrade = Integer.parseInt(nameSplStrings[22]);
    }

    public String getName() { return Name; }
    public int getID() { return ID; }

    public void calcQuizAverage() {
        //quiz weight is 40%
        //lowest is dropped
        int lowest = this.quizScore[0];
        for (int j : this.quizScore) {
            if (j < lowest) {
                lowest = j;
                continue;
            }
            this.quizAverage = quizAverage + j;
        }
        this.quizAverage = this.quizAverage/9;
    }

    public void calcHWAverage() {
        //lowest is dropped
        //homework weight is 10%
        int lowest = this.homeworkScore[0];
        for (int j : this.homeworkScore) {
            if ( j < lowest) {
                lowest = j;
                continue;
            }
            this.homeworkAverage = homeworkAverage + j;
        }
        this.homeworkAverage = this.homeworkAverage/9;
    }

    public void calcOverallAverage() {
        //quiz - 40%
        //hw - 10%
        //midterm - 20%
        //final - 30%

        quizAverage*=0.4;
        homeworkAverage*=0.1;
        midtermGrade*=0.2;
        finalGrade*=0.3;
        overallAverage = (quizAverage+homeworkAverage+midtermGrade+finalGrade)/100;
    }

    public String getGrade() {
        return ("HW Average: " + homeworkAverage + ".\nFinal Exam Average: " + finalGrade + ".\nOverall Average: " + overallAverage + ".");
    }

    
}
