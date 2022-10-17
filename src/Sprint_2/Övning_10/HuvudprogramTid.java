package Sprint_2.Övning_10;

import javax.swing.*;
import java.util.LinkedList;

public class HuvudprogramTid {
    public static void main(String[] args) {
        LinkedList<Stad> stadLista = new LinkedList<>();
        stadLista.add(new Stad("Toronto", "GMT-4"));
        stadLista.add(new Stad("Stockholm", "GMT+2"));
        stadLista.add(new Stad("Shanghai", "GMT+8"));
        stadLista.add(new Stad("San Francisco", "GMT-7"));
        stadLista.add(new Stad("Melbourne", "GMT+11"));
        stadLista.add(new Stad("Puri", "+0530"));
        String stadsnamn = JOptionPane.showInputDialog("Ange namn på ett stad?");
        JOptionPane.showMessageDialog(null,TimeMetoder.getTimeOfCityByName(stadsnamn, stadLista));
    }
}
/*Skriv ett program som tar en stad och skriver ut vad klockan är i den staden just nu på formatet
HH:mm:ss. Implementera detta för åtminstone Toronto, Stockholm och Shanghai (fler städer om du
vill). Googla för att hitta namnen på tidszonerna eller deras id:n.
Programmet ska funka både då användaren skriver stadsnamnet med stora, små, eller blandade
bokstäver. Det ska funka även om användaren lägger in blankslag efter stadens namn.
Om en användare skriver in en stad som ditt program inte kan visa tid för, visa upp ett lämpligt
felmeddelande. */