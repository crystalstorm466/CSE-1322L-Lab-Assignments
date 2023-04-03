package Assignment07;

public class Student {
    private int[] quizScore = new int[10];
    private int[] homeworkScore = new int[10];
    private int midtermGrade;
    private int finalGrade;
    private int homeworkAverage;
    private int overallAverage;
    private String Name;
    private int ID;

    public Student(String name) {
        String[] nameSplStrings = name.split(",");
        this.Name = nameSplStrings[0];
        this.ID = Integer.parseInt(nameSplStrings[1]);
        for (int i = 2; i < 12; i++) {
            this.quizScore[i] = Integer.parseInt(nameSplStrings[i]);
        }
        for (int i = 10; i < 21; i++) {
            this.homeworkScore[i] = Integer.parseInt(nameSplStrings[i]);
        }
        this.midtermGrade = Integer.parseInt(nameSplStrings[21]);
        this.finalGrade = Integer.parseInt(nameSplStrings[22]);
    }

    public String getName() { return Name; }
    public int getID() { return ID; }

    public void calcQuizAverage() {

    }

    public void calcHWAverage() {

    }

    public void calcOverallAverage() {

    }

    public String getGrade() {
        return ("HW Average: " + homeworkAverage + ".\nFinal Exam Average: " + finalGrade + ".\nOverall Average: " + overallAverage + ".");
    }

    
}
