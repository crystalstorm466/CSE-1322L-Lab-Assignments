package Assignment07;

import java.util.ArrayList;

public class StatisticGradeBook extends GradeBook implements Runnable {
    public StatisticGradeBook(String fileName) {
        super(fileName);
    }
    @Override
    public void run() {
        ArrayList<String> studentNames = getAllStudentsNames();
        int numberStudents = studentNames.size();
        int processed = 0;
        for (String s : studentNames) {
            Student s1 = getStudent(s);
            s1.calcHWAverage();
            s1.calcQuizAverage();
            s1.calcOverallAverage();
            processed++;
            if (processed % 100 == 0) {
                System.out.println("Calculating grades " + processed + " out of " + numberStudents);
            }
          //  System.out.println("Quiz: " + getStudentGrade(s));

        }
        System.out.println("All grades calculated");
    }
}