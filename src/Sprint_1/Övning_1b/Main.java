package Sprint_1.Övning_1b;

import Sprint_1.Övning_1a.Bilägare;

import java.util.Scanner;

public class Main {
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
    }
}
/*Gå igenom din lösning och fundera på om den följer Best Practices för inkapsling.
Lägg till paket och public/private/protected för klasser/instansvariabler/instansmetoder för bästa
möjliga inkapsling.
Testa att ha variablerna både privat och protected och notera vilka skillnader det innebär i övrig kod.*/