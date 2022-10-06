package Sprint_1.Hederlige_Harry;

public class Huvudprogram {
    public static void main(String[] args) {
        FordonsAnnons fa = new FordonsAnnons(249000, "En grym Volvo", 1981, 49000);
        fa.setBeskrivning("En perfekt bil för den händige till ett fantastiskt pris!");
        fa.getAnnonsText();
        System.out.println();
        BilAnnons ba = new BilAnnons(250000, "En snygg Opel", 1986, 50000, "röd", true, false);
        ba.setBeskrivning("En fin-fin bil för den som bor på landet. Nästan gratis!");
        ba.getAnnonsText();
        System.out.println();
        HusvagnsAnnons ha = new HusvagnsAnnons(270000, "En rimlig Corola", 1995, 65000, true, 2);
        ha.setBeskrivning("Känn dig som hemma i denna husvagnsbil!");
        ha.getAnnonsText();
        System.out.println();
        MotorCykelAnnons ma = new MotorCykelAnnons(150000, "En supersnabb Harley", 1998, 35000, 800, "kedja");
        ma.setBeskrivning("Need for Speed? Then this is your Baby!");
        ma.getAnnonsText();
    }
}
/*Vi ska skapa en grund för att hålla reda på vilka fordon som ska listas på Hederlige Harrys Bilar AB:s webbsajt.
• Vi börjar med FordonsAnnons. Alla fordon bör ha ett pris, en rubrik, en beskrivning, årsmodell, antalmil etc.
Dessutom ska vi ha en funktion string GetAnnonsText() som ska generera själva annonstexten som ska visas,
tex en grym Volvo 240 Årsmodell 1981, Röd, 49000 mil 249000 kr En perfekt bil för den händige till ett fantastiskt pris.

• Skapa nu en klass BilAnnons som ärver från FordonsAnnons. Den ska ha lite mer information,
tex Färg, Sommardäck (J/N), Vinterdäck (J/N)

• Skapa nu en klass HusvagnsAnnons som ärver från FordonsAnnons. Den ska ha lite mer
information, tex Dusch J/N, Antal bäddar etc

• Och sist en klass MotorCykelAnnons som också ärver från FordonsAnnons. Den kan ha Motorvolym (ex 800 cm3), Drivtyp (kardan/kedja).

• Gör override på GetAnnonsText() och se till att det blir ”snygga” annonser för respektive typ.

• Skapa upp några annonser och skriv ut!*/
