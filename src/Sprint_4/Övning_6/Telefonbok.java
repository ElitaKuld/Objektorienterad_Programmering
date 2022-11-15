package Sprint_4.Övning_6;

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

    public String skrivUtInfo(Kompis kompis) {
        return kompis.getNamn() + " " + kompis.getAdress() + " " + kompis.getMobilnummer() + " " + kompis.getFödelsedag() +
                " " + kompis.getEmail();
    }
}
/*Gör om uppgift 5, men istället för att skicka strängar, låt servern skicka ett serialiserat objekt av typen
Kompis till klienten. Låt klienten skriva ut Kompisens:s data
Tips: Använd klasserna ObjectOutputStream och ObjectInputStream för att skicka och ta emot de
serialiserade objekten.*/