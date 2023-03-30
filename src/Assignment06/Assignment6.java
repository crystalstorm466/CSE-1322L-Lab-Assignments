package Assignment06;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Scanner;

class PersonNotFound extends Exception { public PersonNotFound(String message) { super(message);} }

public class Assignment6 {
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

    public static void buyBitCoin(float bitcoinPrice) {
        try {
            File investmentFile = new File("src/initalInvestmentUSD.txt");
            BufferedReader br = new BufferedReader(new FileReader(investmentFile));
            StringBuffer sb = new StringBuffer();
            String line;
            ArrayList<String> investmentArrayList = new ArrayList<>();
            ArrayList<Float>  investmentArrayFloats = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(":");
                int count = 0;
                float bitcoin;
                for (String part : parts ) {
                   try {
                       bitcoin = Float.parseFloat(part);
                       investmentArrayFloats.add(bitcoin);
                       continue;
                   } catch (NumberFormatException e) {
                       //do nothing
                   }
                    count++;
                    investmentArrayList.add(part);
                    System.out.println(investmentArrayList);
                    System.out.println(investmentArrayFloats);
                }
                File cilentBC = new File("src/clientBC.txt");
                FileWriter fw = new FileWriter(cilentBC);

                for (int i = 0; i < investmentArrayFloats.size(); i++) {
                    fw.write(investmentArrayList.get(i) + ":" + (investmentArrayFloats.get(i))/bitcoinPrice);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getCurrentValue(float currentValue) {
        try {
            File cilentBC = new File("src/clientBC.txt");
            BufferedReader br = new BufferedReader(new FileReader(cilentBC));
            StringBuffer sb = new StringBuffer();
            String line;
            ArrayList<String> clientNames = new ArrayList<>();
            ArrayList<Float> clientBitcoins = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(":");
                int count = 0;
                float bitcoin;
                for (String part : parts) {
                    try {
                        ;
                        clientBitcoins.add(Float.parseFloat(part));
                        continue;
                    } catch (NumberFormatException e) {
                        //do nothing
                    }
                    count++;
                    clientNames.add(part);
                    System.out.println(clientNames);
                    System.out.println(clientBitcoins);
                }
            }
            for (int i = 0; i < clientBitcoins.size(); i++) {
                System.out.println(clientNames.get(i) + ":" + clientBitcoins.get(i) / currentValue);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static float getDollarPrice(ArrayList<String>lines) {
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

    public static Float getPersonFromFile(String persontoSearchFor, String fileToSearch) throws IOException, PersonNotFound {
        File searchFile = new File(fileToSearch);
        BufferedReader br = new BufferedReader(new FileReader(fileToSearch));
        String line;
        ArrayList<String> clientNames = new ArrayList<>();
        ArrayList<Float> clientBitcoins = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(":");
            int count = 0;
            float bitcoin;
            for (String part : parts) {
                try {
                    clientBitcoins.add(Float.parseFloat(part));
                    continue;
                } catch (NumberFormatException e) {
                    //do nothing
                }
                count++;
                clientNames.add(part);
            }
            for (int i = 0; i < clientNames.size(); i++) {
                if (clientNames.get(i).equalsIgnoreCase(persontoSearchFor)) {
                    return clientBitcoins.get(i);
                }
                if (i == clientNames.size() - 1) {
                    throw new PersonNotFound("Not Found!");
                }
            }
        }
        return null;
    }



        public static void main(String[] args) throws IOException, PersonNotFound {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("1. Bitcoin\n" +
                    "2. See everyone's value in USD\n" +
                    "3. See one persons gain/loss\n" +
                    "4. Quit\n" +
                    "");
            int userInput = scan.nextInt();
            ArrayList<String> data = getData();
            float dollarPrice = getDollarPrice(data);
            switch(userInput) {
                case 1:
                    buyBitCoin(dollarPrice);
                    break;
                case 2:
                    getCurrentValue(dollarPrice);
                    break;
                case 3:
                    System.out.println("Enter a name: ");
                    String person = scan.next();
                    System.out.println("Enter a file to search for: ");
                    String file = scan.next();
                    float originalInvest = getPersonFromFile(person, file );
                    float bitcoin = getCurrentValue(originalInvest);
                    break;
                case 4:
                    System.exit(0);
            }
        }while(true);
    }
}