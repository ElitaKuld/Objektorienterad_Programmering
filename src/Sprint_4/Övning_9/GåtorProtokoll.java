package Sprint_4.Övning_9;


public class GåtorProtokoll {
    private static final int WELCOME = 0;

    private static final int SENTWELCOME = 1;
    private static final int SENTRIDDLE = 2;
    private static final int ANOTHER = 3;

    private static final int NUMRIDDLES = 7;

    private int state = WELCOME;

    private int currentRiddle = 0;
    private int currentAnswer = 0;

    private final String[] riddles = {"I’m tall when I’m young, and I’m short when I’m old. What am I?",
            "What is full of holes but still holds water?",
            "What question can you never answer yes to?",
            "What is always in front of you but can’t be seen?",
            "What goes up but never comes down?",
            "What can’t talk but will reply when spoken to?",
            "It belongs to you, but other people use it more than you do. What is it?"
    };

    private final String[] answers = {"A candle", "A sponge", "Are you asleep yet?", "The future", "Your age", "An echo", "Your name"};

    public String processInput(String input) {
        String output = null;

        if (state == WELCOME) {
            output = "Hej och välkommen! Vill du höra en gåta?";
            state = SENTWELCOME;
        } else if (state == SENTWELCOME) {
            if (input.equalsIgnoreCase("ja")) {
                output = riddles[currentRiddle];
                state = SENTRIDDLE;
            } else {
                output = "Ni kan inte tyda ditt svar :-(" +
                        "\nVi provar en gång till. Vill du höra en gåta?";
            }
        } else if (state == SENTRIDDLE) {
            if (input.equalsIgnoreCase(answers[currentAnswer])) {
                output = "Du svarade rätt! Vill du höra en till gåta?";
            } else {
                output = "Du svarade fel. Rätt svar är: " +
                        answers[currentAnswer] +
                        ". Vill du höra en till gåta?";
            }
            state = ANOTHER;
        } else if (state == ANOTHER) {
            if (input.equalsIgnoreCase("ja")) {
                if (currentRiddle == (NUMRIDDLES - 1)) {
                    currentRiddle = 0;
                    currentAnswer = 0;
                } else {
                    currentRiddle++;
                    currentAnswer++;
                }
                output = riddles[currentRiddle];
                state = SENTRIDDLE;
            } else {
                output = "Hejdå!";
                state = WELCOME;
            }
        }
        return output;
    }
}
/*Utifrån koden i Javas Knock knock-exempel, kan du modifiera den att bli en enkel gåtserver istället?
Låt servern ha 3 gåtor. När klienten koppar upp sig, låt servern skicka över en gåta. Svara i klienten.
Kolla på serversidan om svaret var korrekt. Låt servern skriva ”Rätt” eller ”Fel” till klienten.
Modifiera protokollet så att det passar den nya funktionaliteten. */