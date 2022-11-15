package Sprint_4.Övning_8;

import java.awt.image.LookupOp;

public class Protokoll {
    final private int INITIAL = 0;
    final private int LOOPING = 1;
    Intro intro = new Intro();
    Telefonbok telefonbok = new Telefonbok();

    private int state = INITIAL;

    public Object processInput(String userInput) {
        Object output = null;
        if (state == INITIAL) {
            output = intro;
            state = LOOPING;
        }
        else if (state == LOOPING) {
            System.out.println("Nu söker vi på följande namn: " + userInput);
            Kompis answer = telefonbok.getKompis(userInput);
            if (answer != null) {
                Response response = new Response(answer, true);
                output = response;
            } else output = "Denna person finns inte i databasen.";
        }
        return output;
    }
}
/*Refaktorera telefonboken så att serverns logik separeras från sändandet och mottagandet av objekt.
• Bryt ut program-logiken till en ny protokoll-klass som håller reda på de states som applikationen
befinner sig i, och genererar korrekta objekt att skicka till klienten, beroende på state.
• Låt server-klassen bara ha hand om sändande och mottagande
• De mottagna objekten från klienten skickas till Protokoll-klassen, som returnerar ett
lämpligt Objekt att skicka till klienten*/