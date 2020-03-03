package class_demos;

import java.io.*;
import java.util.ArrayList;

public class InputOutputExamples {

    static String filePath = "/Users/mimisam/Documents/CodingNomads/labs/online-java-fundamentals/src/class_demos/refugees_per_capita.csv";

    public static void main(String[] args) throws IOException {
        ArrayList<refugee_data> refugee = demonstrateBufferedCharacterStream();

        for (refugee_data r : refugee) {
            System.out.println(r.toString());
        }

        double lowestRefPerCap = refugee.get(0).getRefPerCap();
        double highestRefPerCap = refugee.get(0).getRefPerCap();

        String lowestCountry = refugee.get(0).getCountry();
        String highestCountry = refugee.get(0).getCountry();

        for(refugee_data r : refugee){
            if (r.getRefPerCap() < lowestRefPerCap) {
                lowestRefPerCap = r.getRefPerCap();
                lowestCountry = r.getCountry();
            } else if (r.getRefPerCap() > highestRefPerCap) {
                highestRefPerCap = r.getRefPerCap();
                highestCountry = r.getCountry();
            }
        }

        System.out.println(lowestRefPerCap);
        System.out.println(lowestCountry);
    }

    public static void demonstrateInputStream() {
        File f = new File(filePath);
        FileInputStream fis;
        int val;
        try {
            fis = new FileInputStream(f);
            while ((val = fis.read()) != -1) {
                System.out.print((char) val);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found - demonstrateInputStream()");
        } catch (IOException e) {
            System.out.println("IOException - demonstrateInputStream()");
        }
    }

    public static void demonstrateBufferedInputStream() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
        int val = 0;
        byte[] buffer = new byte[4];
        while ((val = bis.read(buffer, 0, buffer.length)) != -1) {
            for (byte b : buffer) {
                System.out.print((char) b);
            }
        }
    }

    public static void demonstrateCharacterStream() throws IOException {
        FileReader fr = new FileReader(filePath);
        int val;
        while ((val = fr.read()) != -1) {
            System.out.print((char) val);
        }
    }

    public static ArrayList<refugee_data> demonstrateBufferedCharacterStream() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File(filePath)));
        ArrayList<refugee_data> refugee = new ArrayList<>();
        String val = "";
        // read off the first line (the headers) and do nothing with it
        br.readLine();
        while((val = br.readLine()) != null){
            String[] elements = val.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");

            try {
                int id = Integer.parseInt(elements[0]);
                int year = Integer.parseInt(elements[1]);
                String country = elements[2];
                double population = Double.parseDouble(elements[3]);
                double refugees = Double.parseDouble(elements[4]);
                double RefPerCap = Double.parseDouble(elements[5]);

                refugee_data r = new refugee_data(id, year, country, population, refugees, RefPerCap);
                refugee.add(r);
            } catch (Exception e){
                continue;
            }
        }

        return refugee;
    }
}






