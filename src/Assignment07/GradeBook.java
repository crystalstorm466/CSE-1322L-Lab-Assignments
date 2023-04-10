package Assignment07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class GradeBook {
    private Node head;

    private ArrayList<Student> students;

    public GradeBook(String fileName) {
        head = null;
        students = new ArrayList<Student>();
        try {
            File gradeBook = new File(fileName);
            Scanner fileReader = new Scanner(gradeBook);
            while (fileReader.hasNextLine()) {
                Student newStudent = new Student(fileReader.nextLine());
                students.add(newStudent);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
  

    public Student getStudent(String studentName) {
        for (int i = 0; i < students.size(); i++ ) {
            if (studentName.equalsIgnoreCase(students.get(i).getName())) {
                return students.get(i);
            }
        }
        Student s;
        return null;

    }

    public void getStudentGrade(String studentName) {

        for (int i = 0; i < students.size(); i++ ) {
            if (studentName.equalsIgnoreCase(students.get(i).getName())) {
                System.out.println(students.get(i).getName() + ": " + students.get(i).getGrade());
            }
        }
    }


    public ArrayList<String> getAllStudentsNames() {
        ArrayList<String> namesofStudents = new ArrayList<String>();
        for (int i = 0; i < students.size(); i++ ) {
                namesofStudents.add(students.get(i).getName());
            }
        return namesofStudents;
        }
}

class Node {
    public GradeBook data;
    public Node next;
    public Node head;

    public Node(GradeBook data) {
        this.data = data;
        this.next = null;
    }

}