package Sprint_2.Övning_2;

import javax.swing.*;

public class Huvudprogram {
    public static void main(String[] args){
        Bil bil = new Bil();
        String indata = JOptionPane.showInputDialog("Ange en bils mätarställning för idag?");
        bil.setAmountMilesToday(Double.parseDouble(indata));
        indata = JOptionPane.showInputDialog("Ange en bils mätarställning för ett år sedan?");
        bil.setAmountMilesAYearAgo(Double.parseDouble(indata));
        indata = JOptionPane.showInputDialog("Ange antal liter bensin som förbrukats under året?");
        bil.setAmountGasolineUsed(Double.parseDouble(indata));
        double amountMiles = bil.getAmountMile();
        double amountGasoline = bil.getAmountGasoline(amountMiles);
        System.out.println(bil.getAmountMilePrintout(amountMiles));
        System.out.println(bil.getAmountGasolinePrintout(bil.getAmountGasolineUsed()));
        System.out.println(bil.getAmountGasolinePerMilePrintout(amountGasoline));
    }
}
/*Skriv ett program som beräknar och skriver ut hur många mil en bil har gått under det senaste året och
dessutom beräknar bilens genomsnittliga bensinförbrukning. Indata till programmet ska vara dagens
mätarställning, mätarställningen för ett år sedan samt antal liter bensin som förbrukats under året.
Använd klassen JOptionPane för att läsa in data.
Utskriften ska ske i kommandofönstret och ha format enligt följande:
Antal körda mil: 1487.0
Antal liter bensin: 1235.4
Förbrukning per mil: 0.83
Skriv testerna innan du skriver koden. Du ska minst ha gjort tester för de beräkningar som görs i
programmet och för att utskrifterna följer specifikationen ovan.*/