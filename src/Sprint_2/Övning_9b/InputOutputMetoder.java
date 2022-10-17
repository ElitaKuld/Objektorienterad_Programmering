package Sprint_2.Övning_9b;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class InputOutputMetoder {
    public static void skrivaUtTillFil(Path utFilPath, List<Person> långaPersoner) {
        try {
            if (!Files.exists(utFilPath))
                Files.createFile(utFilPath);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try (BufferedWriter pw = Files.newBufferedWriter(utFilPath)) {
            for (Person person : långaPersoner) {
                pw.write(person.toString());
                pw.newLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Filen kunde inte hittas");
            e.printStackTrace();
            System.exit(0);
        } catch (IOException e) {
            System.out.println("Det gick inte att skriva till fil");
            e.printStackTrace();
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Något gick fel");
            e.printStackTrace();
            System.exit(0);
        }
    }

    public static List<Person> läsaFilTillLista(Path inFilPath) {
        ArrayList<Person> allaPersoner = new ArrayList<>();

        try (BufferedReader br = Files.newBufferedReader(inFilPath)) {

            while (true) { // läs infilen och kopiera till utfilen
                String namnAdress = br.readLine(); // läs namnet och adressen
                if (namnAdress == null) // är filen slut?
                    break; // ja!
                String namn = TextMetoder.delaStringINamn(namnAdress);
                String adress = TextMetoder.delaStringIAdress(namnAdress);
                String bostadsort = TextMetoder.delaStringIBostadsort(namnAdress);

                String ålderLängdVikt = br.readLine(); // läs åldern, vikten och längden
                int ålder = TextMetoder.delaStringIÅlder(ålderLängdVikt);
                int vikt = TextMetoder.delaStringIVikt(ålderLängdVikt);
                int längd = TextMetoder.delaStringILängd(ålderLängdVikt);

                allaPersoner.add(new Person(namn, adress, bostadsort, ålder, vikt, längd));
            }
        } catch (IOException e) {
            System.out.println("Fel inträffade vid läsning från fil");
            e.printStackTrace();
            System.exit(0);
        }
        return allaPersoner;
    }
}