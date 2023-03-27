package Assignment06;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment6Driver {
    public static ArrayList<String> getData() throws UnknownHostException, IOException {
        ArrayList<String> sockeList = new ArrayList<>();

        Socket socket = new Socket("api.coindesk.com", 80);
        OutputStream output = socket.getOutputStream();
        PrintWriter writer = new PrintWriter(output, true);
        writer.write("GET http://api.coindesk.com/v1/bpi/currentprice.json HTTP/1.0\n\n");
        Scanner socketScanner = new Scanner(socket.getInputStream());
        while (socketScanner.hasNextLine()) {
            sockeList.add(socketScanner.nextLine());
        }
        writer.close();
        socketScanner.close();
        try {
            socket.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return sockeList;
         
    }
}
