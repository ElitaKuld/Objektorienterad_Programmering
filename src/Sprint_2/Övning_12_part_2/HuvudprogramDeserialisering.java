package Sprint_2.Övning_12_part_2;

import Sprint_2.Övning_12.Bil;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class HuvudprogramDeserialisering {
    public static void main(String[] args) {

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/Sprint_2/Övning_12/storage.ser"))) {

            Object objektA = in.readObject();
            Object objektB = in.readObject();
            Object objektC = in.readObject();

            if (objektA instanceof Bil){
                System.out.println(((Bil)objektA).getBilägare().getNamn());
                System.out.println(((Bil)objektA).getBilägare().getAdress());
                System.out.println(((Bil)objektA).getBilägare().getÅlder());
                System.out.println((Bil)objektA);
            }

            if (objektB instanceof Bil){
                System.out.println(((Bil)objektB).getBilägare().getNamn());
                System.out.println(((Bil)objektB).getBilägare().getAdress());
                System.out.println(((Bil)objektB).getBilägare().getÅlder());
                System.out.println((Bil)objektB);
            }

            if (objektC instanceof Bil){
                System.out.println(((Bil)objektC).getBilägare().getNamn());
                System.out.println(((Bil)objektC).getBilägare().getAdress());
                System.out.println(((Bil)objektC).getBilägare().getÅlder());
                System.out.println((Bil)objektC);
            }

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