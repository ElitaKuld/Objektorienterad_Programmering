package Sprint_2.Övning_9b;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class HuvudprogramPersonuppgifter2 {
    public static void main(String[] args) throws IOException {
        Path inFil = Paths.get("src/Sprint_2/Personuppgifter.txt");
        Path utFil = Paths.get("src/Sprint_2/LångaPersoner.txt");
        ArrayList<Person> lista = (ArrayList<Person>) InputOutputMetoder.läsaFilTillLista(inFil);
        ArrayList<Person> långaPersoner = LogiskaMetoder.hittaLångaPersoner(lista);
        InputOutputMetoder.skrivaUtTillFil(utFil, långaPersoner);
    }
}
/*För att jobba på bästa objektorienterade sätt:
• Skapa upp en klass ”Person”
• Tillverka en List<Person> där du skapar upp en instans av Personuppgift för varje person i
filen, och lägger in i listan
• Sök igenom listan för att hitta de långa personerna.
• Skriv testerna först och koden sen.*/