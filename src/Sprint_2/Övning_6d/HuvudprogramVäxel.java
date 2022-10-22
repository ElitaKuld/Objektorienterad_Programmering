package Sprint_2.Övning_6d;

import java.util.ArrayList;
import java.util.List;

public class HuvudprogramVäxel {

    public boolean testLäge = false;

    public static void main(String[] args) {
        HuvudprogramVäxel huvud = new HuvudprogramVäxel();
        int price = InputDataReader.readPrice(huvud.testLäge);
        int amount = InputDataReader.readAmount(huvud.testLäge);
        int växel = 0;

        Betalning betalning = new Betalning(price, amount);
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
        System.out.println(betalning.skrivUtVäxelValörerStringBuilder(resultat));
    }
}
/*Dags att lägga till tester för inläsningen, implementera följande:
• Lägg till en publik test-parameter så att ni kan skilja på om ni befinner er i test-läge eller inte.
• Skriv tester som testar er inläsning
• Skriv tester som testar att de exception som ni slänger verkligen slängs.
• Formatera om koden så att inläsningen görs i en egen metod
• Se till att alla tester går gröna.
*/