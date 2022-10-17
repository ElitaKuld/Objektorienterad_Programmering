package Sprint_2.Övning_9b;

import java.util.ArrayList;
import java.util.List;

public class LogiskaMetoder {

    public static ArrayList<Person> hittaLångaPersoner(List<Person> lista) {
        ArrayList<Person> långaPersoner = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getLängd() >= 200)
                långaPersoner.add(lista.get(i));
        }
        return långaPersoner;
    }
}