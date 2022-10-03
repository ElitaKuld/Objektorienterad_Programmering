package Sprint_1.Övning_1c;

import Sprint_1.Övning_1a.Bilägare;

import java.util.Scanner;

public class Huvudprogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bil bil = new Bil("125 BFD", "Tesla", "Universe", "Fredrik Johansson", " Stora väge 25", 25);
        System.out.println("Vad heter den nya bilägaren?");
        bil.bytÄgare(scan.nextLine());
        bil.skrivUt();
        Bilägare ägare = new Bilägare("Elita Kuld", "Sara Moraeas väg 132", 36);
        System.out.println(ägare.toString());
        Bil bil2 = new Bil("255 OOP", "Tesla", "Eclipse", ägare);
        bil2.skrivUt();
        Bil bil3 = new Bil("111 BNU", "Harley", "Davidson", "Jose Merona", "Visby gatan 29", 36);
        bil3.bytÄgare("Ale Cypres");
        bil3.skrivUt();
        Bil bil5 = new Bil();
        bil5.setRegistreringsnummer("258 BHY");
        bil5.setModell("Volvo");
        bil5.setMärke("Lego");
        Bilägare ägare5 = new Bilägare();
        ägare5.setNamn("David");
        ägare5.setAdress("Saras väg 32");
        ägare5.setÅlder(29);
        bil5.setBilägare(ägare5);
        bil5.skrivUt();
    }
}
/*Lägg till ett huvudprogram som skapar upp några bilar och bilägare. Låt bilägarna köpa och sälja ett
par bilar i programmet. Skriv, till sist, ut alla bilägarna samt vilka bilar de (eventuellt) äger.
I ditt huvudprogram, se till att du inte använder static mer än i main.
Testa att bryta ut huvudprograms-koden och lägga in den huvudprograms-klassens konstruktor.*/