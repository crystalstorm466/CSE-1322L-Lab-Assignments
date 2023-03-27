package Lab10;

import java.io.*;
import java.nio.file.FileStore;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab10 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the first filename? ");
        String firstFile = scan.next(); //do Lab10A.txt
        System.out.print("What is the second filename? ");
        String secondFile = scan.next(); //do Lab10B.txt
        String previous = null;
        ArrayList<String> fileList = new ArrayList<>();
        ArrayList<String> secondFileList = new ArrayList<>();
        int line = 0;
        int secondLine = 0;
        try {

            Scanner firstScanner = new Scanner(new File(firstFile));
            Scanner secondScanner = new Scanner(new File(secondFile));
            while (firstScanner.hasNextLine()) {
                fileList.add(firstScanner.nextLine());
                line++;
            }
            while (secondScanner.hasNextLine()) {
                secondFileList.add(secondScanner.nextLine());
                secondLine++;
            }
            if (!(line == secondLine)) {
                System.out.println("Files have different number of lines");
                firstScanner.close();
                secondScanner.close();
                return; //exits the program
            }
            // for ( String s : fileList ) {
            //     i++;
            //     if (fileList.get(i) != secondFileList.get(i)) {
            //         System.out.println("Line: " + i);
            //         System.out.println("< " +secondFileList.get(i));
            //         System.out.println("> "+fileList.get(i));
            //     }
            // }
            
            for (int i = 0; i < fileList.size(); i++) {
                if (i < secondFileList.size() && !fileList.get(i).equals(secondFileList.get(i))){
                    System.out.println("Line: " + i);
                    System.out.println("< " + secondFileList.get(i));
                    System.out.println("> "+fileList.get(i));
                }
            }
            firstScanner.close();
            secondScanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
