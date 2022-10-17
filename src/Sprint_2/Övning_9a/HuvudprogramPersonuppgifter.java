package Sprint_2.Övning_9a;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HuvudprogramPersonuppgifter {
    public static void main(String[] args) throws IOException {
        Path p = Paths.get("src/Sprint_2/Personuppgifter.txt");
        Path p1 = Paths.get("src/Sprint_2/LångaPersoner.txt");
        try {
            if (!Files.exists(p1))
                Files.createFile(p1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try (BufferedReader br = Files.newBufferedReader(p);
             BufferedWriter pw = Files.newBufferedWriter(p1)) {

            while (true) { // läs infilen och kopiera till utfilen
                String namnAdress = br.readLine(); // läs namnet och adressen
                if (namnAdress == null) // är filen slut?
                    break; // ja!
                String ålderLängdVikt = br.readLine(); // läs åldern, vikten och längden
                int längd = Integer.parseInt(ålderLängdVikt.substring(ålderLängdVikt.lastIndexOf(",") + 1).trim());
                if (längd >= 200) {
                    pw.write(namnAdress + "\n" + ålderLängdVikt); // skriv till utfilen
                    pw.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*Ladda ner filen personuppgifter.txt från Nackademins portal.
Filen innehåller personuppgifter. För varje person står personens namn, adress och på nästa rad
personens ålder, längd och vikt. Du ska läsa in filen i ditt program och hitta alla personer som är
längre än 2 meter.
Skapa sedan en ny textfil som bara innehåller uppgifterna för de långa personerna.
Både infilens och utfilens namn ska läsas in av programmet.
Använd try-with-resources
Exempel på personpost i infilen:
Kalle Nilsson, Xvägen 1, 12345 Ystad
25, 80, 175*/