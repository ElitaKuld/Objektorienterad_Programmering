package Sprint_2.Övning_6a;

import java.util.*;

import static javax.swing.JOptionPane.showInputDialog;

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
        växel = betalning.geVäxel();
        List<Valör> resultat = new ArrayList<>();
        betalning.räknaUtAntalValörer(växel, betalning.getValörer(), resultat);
        for (int i = 0; i < resultat.size(); i++)
            System.out.println(resultat.get(i).getAntal() + " " + resultat.get(i).getValörVärde());
    }
}
/*Skriv ett program som beräknar hur mycket växel som ska ges tillbaka.
Indata till programmet är det pris man ska betala samt det belopp man betalar med. Läs och skriv
till/från kommandoraden.
Beräkna hur många 1000-lappar, 500-lappar, 200-lappar, 100-lappar, 50-lappar, 20-lappar, 10-kronor,
5-kronor, 2-kronor och enkronor man ska få tillbaka utifrån, av användaren, givna belopp.
Växeln ska alltid innehålla så mycket som möjligt av högsta möjliga valörer
Skriv helst testerna först, koden sen. Om det känns väldigt svårt är det bättre att fuska med detta än att
inte skriva nån kod alls
Ledtrådar:
Innan du sätter igång, fundera över vad som måste hända:
• Du måste räkna ut växeln (utifrån pris och lämnade pengar)
• Du måste hålla reda på vilka valörer som finns
• Rekommendation är att lägga dessa värden i en lista som du itererar över när du räknar ut
hur mycket av varje valör som ska ges tillbaka
• Du måste räkna ut hur många enheter av en valör som ska ges i växeln
• När du har räknat ut hur många antal (y) av valör x som ska ges i växel måste du subtrahera
dessa från växeln inför nästa iteration Ex: antag att växeln är 654, då ska du ge 6st 100-
lappar, sen måste du dra av 600 innan du räknar ut hur många 50-lappar som ska ges
Alla dessa punkter lämpar sig väl för att skriva enhetstester på!!!*/