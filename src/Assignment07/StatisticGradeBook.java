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

            System.out.println("Calculating grades " + processed + " out of " + numberStudents);
            System.out.println("Quiz: " + s.);

        }
    }
}