package Sprint_2.Övning_12;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class HuvudprogramSerialisering {
    public static void main(String[] args) {
        Bil bilA = new Bil("125 bnm", "SuperFast", "Volvo");
        Bilägare bilägareA = new Bilägare("Eli Kuld", "Sara Moraeas väg 132", 36);
        bilA.setBilägare(bilägareA);
        Bil bilB = new Bil("456 KLÖ", "Raser", "BMW");
        Bilägare bilägareB = new Bilägare("Nona Dahl", "Stora vägen 38", 29);
        bilB.setBilägare(bilägareB);
        Bil bilC = new Bil("789 TYU", "Turtle", "Ferrari");
        Bilägare bilägareC = new Bilägare("Soraya Endolf", "Visby vägen 56", 35);
        bilC.setBilägare(bilägareC);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/Sprint_2/Övning_12/storage.ser"))) {

            out.writeObject(bilA);
            out.writeObject(bilB);
            out.writeObject(bilC);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/*Kopiera koden från uppgift 2 i Sprint 1 (Fordonen).
Gör först en funktion där du skapar en lista av olika Fordonsobjekt, som du sparar ner till fil via
Serialisering.
Sedan, i huvudprogrammet, radera de Fordonsobjekt du skapar upp.
Gör sedan en deserialiseringsfunktion där du läser upp listan av Fordonsobjekt från filen och skriver
ut. */