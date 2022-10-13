package Sprint_2.Övning_5_mindre_kod_Sigrun;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class HuvudprogramBilhyra {
    public static void main(String[] arg) {
        String indata = showInputDialog("Ange antal dagar, pris per dag samt bilmodell");
        int antalDagar = 0;
        double dagsPris = 0; // Double behöver en decimalkomma!
        String bil = "";
        boolean försökIgen = true;
        while (försökIgen) {

            if (indata == null) {
                System.out.println("Du har avbrutit programmet");
                System.exit(0);  // Användaren klickade på "Avbryt"
            }

            Scanner sc = new Scanner(indata); // OBS!!! Vi läser in data från JOptionPane!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            String felText = "";
            try {
                antalDagar = sc.nextInt();
                dagsPris = sc.nextDouble();
                bil = sc.next();
                försökIgen = false;

            } catch (InputMismatchException e) {
                e.printStackTrace();
                felText = "Felaktigt tal";
            } catch (NoSuchElementException e) {
                e.printStackTrace();
                felText = "Inmatningen kan inte vara tom";
            } catch (Exception e) {
                felText = "Ospecifierat fel inträffade, försök igen!";
            }
            if (försökIgen) // Det skrivs på så sätt för att inte dubblera kod
                indata = showInputDialog(felText + "\nAnge antal dagar, pris per dag samt bilmodell");
        }
        double totPris = dagsPris * antalDagar;
        String s = String.format("Totalt pris för %s: %.2f", bil, totPris);
        showMessageDialog(null, s);
    }
}
/*Kopiera koden Bilhyra2 från:
http://skansholm.com/java_dir/exempel6/BilHyra2.java
Lägg till den felhantering som behövs.
Fel som behöver fångas upp är
• Om användaren skriver in något annat än siffror där programmet läser in int eller double
• Om användaren skriver in för få parametrar och trycker ”OK”.
Använd exceptions.*/