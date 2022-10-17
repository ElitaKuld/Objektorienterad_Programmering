package Sprint_2.Övning_11;

import javax.swing.*;

public class HuvudprogramVideobandspelare {
    public static void main(String[] args) {
        String indata1 = JOptionPane.showInputDialog("Ange videobandets längd i minuter?");
        String indata2 = JOptionPane.showInputDialog("Hittills använd tid av bandet?");
        String börjanTid = JOptionPane.showInputDialog("Den tidpunkt då tv-programmet börjar (anges som klockslag, tt:mm)?");
        String slutTid = JOptionPane.showInputDialog("Den tidpunkt tv-programmet slutar?");

        int totalLängd = Integer.parseInt(indata1);
        int användTid = Integer.parseInt(indata2);

        int tillgängligTid = TidMetoder.räknaUtTillgängligTid(totalLängd, användTid);
        int duration = TidMetoder.räknaUtDuration(börjanTid, slutTid);
        boolean itFits = TidMetoder.checkIfItFits(tillgängligTid, duration);
        System.out.println(TidMetoder.geSammanfattning(itFits));
    }
}
/*Förr när man fortfarande spelade in film på videoband var det ibland svårt att veta om ett kommande
tv-program skulle få plats på bandet.
Skriv ett program som hjälper oss räkna ut om ett band kommer att räcka eller inte.
Programmet ska fråga efter videobandets längd (i minuter), hittills använd tid av bandet, den tidpunkt
då tv-programmet börjar och den tidpunkt då det slutar (anges som klockslag, tt:mm).
Använd klasserna LocalTime och Duration för att räkna ut tiden. Jobba testdrivet och skriv testerna
innan du skriver koden. Om användaren skriver in något konstigt, visa ett felmeddelande*/