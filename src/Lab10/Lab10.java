package Lab10;

import java.io.*;
import java.nio.file.FileStore;
import java.util.Scanner;

public class Lab10 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the first filename? ");
        String firstFile = scan.next(); //do compare1.txt
        System.out.print("What is the second filename? ");
        String secondFile = scan.next(); //do compare2.txt
        String previous = null;
        int line = 0;
        try {

            Scanner firstScanner = new Scanner(new File(firstFile));
            Scanner secondScanner = new Scanner(new File(secondFile));
            while (firstScanner.hasNextLine()) {
                previous = scan.nextLine();
                line++;
            }


            while (secondScanner.hasNextLine()) {
                if (!(previous.equals(secondScanner.nextLine()))) {
                    FileOutputStream fos = new FileOutputStream(secondFile, true);
                    PrintWriter pw = new PrintWriter(fos);
                    pw.println("Line" + line + "\n< " + previous);
                    pw.println("> " + secondScanner.nextLine());
                }
            }
            firstScanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
