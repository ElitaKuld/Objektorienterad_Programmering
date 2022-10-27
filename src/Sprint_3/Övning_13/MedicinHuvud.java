package Sprint_3.Övning_13;

import javax.swing.*;

public class MedicinHuvud {
    public static void main(String[] args) throws InterruptedException {
        String medisinA = JOptionPane.showInputDialog("Vilken medicin ska du ta?");
        int antalGångerA = Integer.parseInt(JOptionPane.showInputDialog("Hur många gånger per minut ska du ta denna medicin?"));
        Medicine one = new Medicine(medisinA, antalGångerA);
        String medisinB = JOptionPane.showInputDialog("Vilken medicin ska du ta?");
        int antalGångerB = Integer.parseInt(JOptionPane.showInputDialog("Hur många gånger per minut ska du ta denna medicin?"));
        Medicine two = new Medicine(medisinB, antalGångerB);
        String medisinC = JOptionPane.showInputDialog("Vilken medicin ska du ta?");
        int antalGångerC = Integer.parseInt(JOptionPane.showInputDialog("Hur många gånger per minut ska du ta denna medicin?"));
        Medicine three = new Medicine(medisinC, antalGångerC);

        one.start();
        two.start();
        three.start();

        Thread.sleep(60000); // 60 sekunder

        one.interrupt();
        two.interrupt();
        three.interrupt();
    }
}
/*Skriv ett program som (i mycket tidskomprimerad form) skriver ut när en person ska ta sina
mediciner.
Gör meddelanderutor som först frågar efter medicintyp och sedan efter hur många gånger per minut
medicinen ska tas. (det går också bra att fråga och svara i consolen)
Låt medicinerna representeras av en klass ”Medicine” som ärver Thread
Starta en ny tråd för varje medicintyp som skriver ut medicinens namn, samt när den ska tas, på
System.out*/