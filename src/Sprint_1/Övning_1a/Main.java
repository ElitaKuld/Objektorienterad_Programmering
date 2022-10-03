package Sprint_1.Övning_1a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bil bil = new Bil("125 BFD", "Tesla", "Universe", "Fredrik Johansson", " Stora väge 25", 25);
        System.out.println("Vad heter den nya bilägaren?");
        bil.bytÄgare(scan.nextLine());
        bil.skrivUt();
    }
}
/*Du har fått i uppdrag att konstruera ett bilregister! I ditt register ska du hålla koll på människor, bilar
och vilka av dess människor som äger vilka bilar.
Konstruera en klass Person. En person ska ha ett namn, adress och ålder. Utforma en konstruktor och
några lämpliga metoder för Person (getters och setters).
Konstruera en klass Bilägare som ärver Person.
Konstruera en klass Bil med registreringsnummer, modell och märke. En bil ska ha en Bilägare.
Konstruera metoder som anropas när man köper eller säljer en bil (alltså byter bilägare).
*/