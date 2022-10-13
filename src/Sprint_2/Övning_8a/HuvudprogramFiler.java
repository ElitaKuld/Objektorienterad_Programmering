package Sprint_2.Övning_8a;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HuvudprogramFiler {
    public static void main(String[] args) {
        String indata;
        double temperatur;
        double tempMin = 100;
        double tempMax = 0;
        double tempSumma = 0;
        int antalRader = 0;
        try (BufferedReader buff = new BufferedReader(new FileReader("src/Sprint_2/Temperatur.txt"))) {
            while ((indata = buff.readLine()) != null) {
                indata = indata.replace(',', '.'); // för att double-indata innehåller , istället för .
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

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*Ladda ner filen temp.txt från Nackademins portal, den innehåller temperaturer som mätts upp kl 13 på
en plats under en månad. Lägg filen i den katalog där du skriver ditt program.
Skriv ett program som läser filen och skriver ut högsta och lägsta värden, samt beräknar
medeltemperaturen för månaden.
Använd dig av klassen FileReader wrappad i en BufferedReader för att läsa från filen.
*/