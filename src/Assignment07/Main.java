package Assignment07;

import java.io.File;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
         StatisticGradeBook statisticGradeBook = new StatisticGradeBook("");
         Thread st1 = new Thread(new StatisticGradeBook(" "));
         st1.start();
         System.out.println("What is the student's name?");
         Scanner scan = new Scanner(System.in);
         statisticGradeBook.getStudentGrade(scan.next());
     }
}
