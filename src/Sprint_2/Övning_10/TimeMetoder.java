package Sprint_2.Övning_10;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class TimeMetoder {

    public static String getTimeOfCityByName(String stadsnamn, List<Stad> lista) {
        String resultat = "";
        for (int i = 0; i < lista.size(); i++) {
            if (stadsnamn.trim().equalsIgnoreCase(lista.get(i).getNamn())) {
                ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of(lista.get(i).getTidszon()));
                LocalTime lt = zdt.toLocalTime();
                resultat = "I denna stad är klockan just nu: " + lt.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                break;
            } else
                resultat = "We are sorry but we cannot tell you yet the time in this city. Please come back when we are smarter!";
        }
        return resultat;
    }
}