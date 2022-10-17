package Sprint_2.Övning_13b;

public class Calculator {

    public static void kontrolleraOperator(String input) throws OperatorNotSupportedException {
        if (!input.equals("+") && !input.equals("-") && !input.equals("*") && !input.equals("/")) {
            System.out.println("Ogiltig operator");
            throw new OperatorNotSupportedException();
        }
    }

    public static String räknaUt(double a, double b, String operator) throws OperatorNotSupportedException {
        kontrolleraOperator(operator);
        String resultat = "";
        if (operator.equals("+"))
            resultat = resultat + (a + b);
        else if (operator.equals("-"))
            resultat = resultat + (a - b);
        else if (operator.equals("*"))
            resultat = resultat + (a * b);
        else resultat = resultat + (a / b);

        return resultat;
    }
}