package Sprint_1.Hederlige_Harry_Med_Interface;

public class Huvudprogram {
    public static void main(String[] args) {
        FordonsAnnons fa = new FordonsAnnons(249000, "En grym Volvo", 1981, 49000);
        fa.setBeskrivning("En perfekt bil för den händige till ett fantastiskt pris!");
        fa.printCompleteAdd();
        System.out.println();
        System.out.println(fa.calculateRevenue());
        System.out.println();
        BilAnnons ba = new BilAnnons(250000, "En snygg Opel", 1986, 50000, "röd", true, false);
        ba.setBeskrivning("En fin-fin bil för den som bor på landet. Nästan gratis!");
        ba.printHeader();
        System.out.println();
        HusvagnsAnnons ha = new HusvagnsAnnons(270000, "En rimlig Corola", 1995, 65000, true, 2);
        ha.setBeskrivning("Känn dig som hemma i denna husvagnsbil!");
        ha.printCompleteAdd();
        System.out.println();
        MotorCykelAnnons ma = new MotorCykelAnnons(150000, "En supersnabb Harley", 1998, 35000, 800, "kedja");
        ma.setBeskrivning("Need for Speed? Then this is your Baby!");
        ma.printHeader();
        System.out.println();
        System.out.println(ma.calculateRevenue());
    }
}
/*Istället för att GetAnnonsText ärvs från super-annons-klassen, skapa ett interface, Publishable,
som annonsklasserna får implementera
• Publishable innehåller 2 metoder:
• PrintHeader (ska printa rubrik och pris, typ: ”Fantastisk husbil, 25000 kr”)
• PrintCompleteAd (ska printa all info för en annons)
• (vi tänker oss att PrintHeader är den metod som anropas när vi vill lista alla fordon på
Hederlige Harrys hemsida, PrintCompleteAd är den som anropas när en användare har
klickat på en annons-header)
• Lägg till ytterligare ett interface, Revenuable, som innehåller en metod calculateRevenue som
räknar ut hur mycket Harry kan tjäna på en annons (förutsatt att nån köper). Vi måste dra av
25% av alla priser pga moms och sen är det dessutom 10% rea på motorcyklar.*/