package Sprint_2.Övning_6b;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class HuvudprogramVäxel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pris = 0;
        int belopp = 0;
        int växel = 0;
        while (true) {
            System.out.println("Ange det pris du ska betala?");
            if (!scan.hasNextLine()) {
                System.out.println("Du har avbrutit programmet");
                System.exit(0);  // Användaren klickade på "Avbryt"
            }
            try {
                pris = scan.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Felaktigt tal.");
                scan.nextLine();
            } catch (Exception e) {
                System.out.println("Ospecifierat fel inträffade, försök igen!");
                scan.nextLine();
            }
        }
        while (true) {
            System.out.println("Ange det belopp du betalar med?");
            if (!scan.hasNextLine()) {
                System.out.println("Du har avbrutit programmet");
                System.exit(0);  // Användaren klickade på "Avbryt"
            }
            try {
                belopp = scan.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Felaktigt tal.");
                scan.nextLine();
            } catch (Exception e) {
                System.out.println("Ospecifierat fel inträffade, försök igen!");
                scan.nextLine();
            }
        }
        Betalning betalning = new Betalning(pris, belopp);
        if (betalning.betaltFörLite()) {
            System.out.println("Du lämnade för lite pengar");
            System.exit(0);
        }
        if (betalning.betaltMedJämnaPengar()) {
            System.out.println("Det blev ingen växel");
            System.exit(0);
        }
        växel = betalning.geVäxel();
        List<Valör> resultat = new ArrayList<>();
        betalning.räknaUtAntalValörer(växel, betalning.getValörer(), resultat);
        System.out.println(betalning.skrivUtVäxelValörer(resultat));
    }
}
/*När räkneverket funkar är det dags att fixa snygga utskrifter. Fixa din lösning så att varje rad ser ut
enligt följande:
Antal 20-lappar: 3
Antal 10-kronor: 1
• Du ska skriva ut ”kronor” när valörerna är 1,2,5,10.
• Du ska skriva ut ”lappar” när valörerna är 20, 50, 100, 200, 500, 1000.
• Om användaren betalar med jämna pengar ska en utskrift som säger ”Det blev ingen växel”
skrivas ut
• Om användaren betalar för lite ska en utskrift som säger ”Du lämnade för lite pengar” visas
• Skriv tester för ovanstående krav och implementera sen koden*/