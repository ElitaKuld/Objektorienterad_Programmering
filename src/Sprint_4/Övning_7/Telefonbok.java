package Sprint_4.Övning_7;

import java.util.List;

public class Telefonbok {
    Kompis kompisA = new Kompis("Elita", "Sara Moraeas väg 132", "0762217262", "07/04/1986", "eli@gmail.se");
    Kompis kompisB = new Kompis("Marek", "Alevaja 28", "0725986412", "08/05/1987", "marek@gmail.ru");
    Kompis kompisC = new Kompis("Sonya", "Stora vägen 126", "0762895632", "09/06/1988", "sonya@gmail.com");
    Kompis kompisD = new Kompis("Nikita", "Vologdanskaja 37", "0782856987", "10/07/1989", "nikita@gmail.ru");
    Kompis kompisE = new Kompis("Luka", "Barceolli 96", "078946215", "11/08/1990", "luka@gmail.it");

    List<Kompis> telefonLista = List.of(kompisA, kompisB, kompisC, kompisD, kompisE);

    public Kompis getKompis(String namn) {
        for (Kompis kompis : telefonLista) {
            if (kompis.getNamn().equals(namn))
                return kompis;
        }
        return null;
    }
}
/*Låt oss skapa en ytterligare version av vår telefonbok där vi skickar olika objekt beroende om vi bara
vill meddela att kontakten är upprättad eller som vi svarar på ett request att få data för en person
Vi behöver
• En Intro-klass som vi skickar som bekräftelse på att connection är upprättad
• En Response-klass som innehåller en bool för om en Person hittades i databasen eller inte
o Om en person hittades, lägg med Person-objektet i responset
Använd instanceof för att särskilja på Intro och Response på klientsidan.*/