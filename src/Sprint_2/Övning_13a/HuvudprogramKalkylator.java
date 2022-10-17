package Sprint_2.Övning_13a;

import java.util.Scanner;

public class HuvudprogramKalkylator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ange ett matematiskt uttryck på formen \"a ? b\" där a och b är flyttal och ? är antingen +, -, * eller /.");
        double a = 0, b = 0;
        String operator = "";
        double resultat = 0;

        if (scan.hasNext()) {
            a = scan.nextDouble();
            operator = scan.next();
            b = scan.nextDouble();
        }
        if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/"))
            System.out.println("Ogiltig operator");
        else {
            if (operator.equals("+"))
                resultat = a + b;
            else if (operator.equals("-"))
                resultat = a - b;
            else if (operator.equals("*"))
                resultat = a * b;
            else resultat = a / b;
            System.out.println("Resultatet blir: " + resultat);
        }
    }
}
/*Användaren skriver in ett uttryck på formen ”a ? b” där a och b är flyttal och ? är antingen +, -, * eller
/. Resultatet av uttrycket skrivs sedan ut.
Börja med inläsningen, mha Scanner, läs in
a till en int-variabel
? till en String- eller char-variabel
b till en int-variabel
Ni väljer om ni läser från System.in eller från en JOptionPane
Kolla att ? är ett tillåtet tecken (alltså något av +, -, *, /)
Utför uträkningen och skriv ut resultatet*/