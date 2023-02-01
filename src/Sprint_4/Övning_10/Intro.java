package Sprint_4.Övning_10;

import java.io.Serializable;

public class Intro implements Serializable {
    private final String CONNECTION = "Connection är upprättad.";
    private final String HÄLSNING = "Hej och välkommen! Skriv in ett namn.";

    public Intro() {
    }

    @Override
    public String toString(){
        return CONNECTION + "\n" + HÄLSNING;
    }
}