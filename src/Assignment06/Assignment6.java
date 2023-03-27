package Assignment06;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment6 {

    public static ArrayList<String> getData () throws IOException {
        ArrayList<String> socketList = new ArrayList<String>();
        Socket socket = new Socket("api.coindesk.com", 80);
        OutputStream output = socket.getOutputStream();
        PrintWriter writer = new PrintWriter(output, true);
        writer.write("GET http://api.coindesk.com/v1/bpi/currentprice.json HTTP/1.0");
        output.flush();
        Scanner socketscanner = new Scanner(socket.getInputStream());
        
        while (socketscanner.hasNextLine()) {
            String result = socketscanner.nextLine();
            socketList.add(result);
        }
        writer.close();
        socket.close();
        socketscanner.close();

        return socketList;
    }

    //Java students:  Copy and paste this method into your main driver class:

    public static float getDollarPrice(ArrayList<String> lines) {
        boolean header=true;
        String json="";
        for(String line : lines) {
            if(line.equals("")) {
                header=false;
                continue;
            }
            if(header==false) {
                json=line;
                break;
            }
        }
        //System.out.println("Json: "+json);
        String[] jsonParts=json.split(":");
        String priceLine=jsonParts[19];
        String justPrice=priceLine.replace("},\"GBP\"","");
        float price=Float.parseFloat(justPrice);
        return price;
    }

    public static void buyBitcoin(float bitcoinPrice) {
        try {
            File investmentUSD = new File("initialInvestmentUSD.txt");
            Scanner read = new Scanner(investmentUSD);
            ArrayList<String> investmentArray = new ArrayList<String>();
            int linecount = 0;
            while (read.hasNextLine()) {
                String line = read.nextLine();

                investmentArray.add(line);
                linecount++;

            }

         investmentUSD = new File("investmentUSD.txt");
    } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    private static float getCurrentValue(float bitcoin) {
        return 0;
    }
    }
