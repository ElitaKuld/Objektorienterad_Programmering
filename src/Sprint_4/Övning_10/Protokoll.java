package Sprint_4.Övning_10;

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