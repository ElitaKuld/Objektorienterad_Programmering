package Sprint_2.Övning_8b;

import java.io.*;
import java.util.Scanner;

public class HuvudprogramFilerScanner {
    public static void main(String[] args) throws FileNotFoundException {
        String indata;
        double temperatur;
        double tempMin = 100;
        double tempMax = 0;
        double tempSumma = 0;
        int antalRader = 0;
        try (Scanner fil = new Scanner(new File("src/Sprint_2/Temperatur.txt"))) {
            while (fil.hasNextLine()) {
                indata = fil.nextLine().replace(',', '.'); // för att double-indata innehåller , istället för .
                temperatur = Double.parseDouble(indata);
                System.out.println(indata);
                if (temperatur > tempMax)
                    tempMax = temperatur;
                if (temperatur < tempMin)
                    tempMin = temperatur;
                tempSumma = tempSumma + temperatur;
                antalRader++;
            }
            double medeltemp = tempSumma / antalRader;
            System.out.println("Den högsta temperaturen denna månad har varit: " + tempMax + " grader.\n" +
                    "Den lägsta temperaturen: " + tempMin + " grader.\n" + "Medeltemperaturen är: " + medeltemp + ".");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*Kopiera uppgift 8a. Modifiera koden så att du använder dig av Scanner för att läsa från filen.*/