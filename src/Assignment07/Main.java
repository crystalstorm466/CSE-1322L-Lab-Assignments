package Assignment07;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
         StatisticGradeBook statisticGradeBook = new StatisticGradeBook("Assignment7-Spreadsheet.csv");
         Thread st1 = new Thread(new StatisticGradeBook("Assignment7-Spreadsheet.csv"));
         st1.start();
         System.out.println("What is the student's name?");
         Scanner scan = new Scanner(System.in);
         statisticGradeBook.getStudentGrade(scan.next());
     }
}
