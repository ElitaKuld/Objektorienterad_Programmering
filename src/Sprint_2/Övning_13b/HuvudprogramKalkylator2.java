package Sprint_2.Övning_13b;

import java.util.Scanner;

public class HuvudprogramKalkylator2 {
    public static void main(String[] args) throws OperatorNotSupportedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ange ett matematiskt uttryck på formen \"a ? b\" där a och b är flyttal och ? är antingen +, -, * eller /.");
        double a = 0, b = 0;
        String operator = "";

        if (scan.hasNext()) {
            a = scan.nextDouble();
            operator = scan.next();
            b = scan.nextDouble();
        }
        System.out.println(Calculator.räknaUt(a, b, operator));
    }
}
/*Vi vill gärna skilja på det rent matematiska och inläsning/utskrift
Bryt ut själva uträknandet till en egen klass (Calculator.java).
Låt uträkningen ske här
Låt även felkontrollen av operator ske här
Skapa en egen exception-klass OperatorNotSupportedException som slängs när användaren skriver in
en operator som inte stöds. (Exceptions är helt vanliga klasser, vad de har gemensamt är att de ärver
javas klass Exception, vilket gör att de kan kastas då Exception ärver klassen Throwable)*/