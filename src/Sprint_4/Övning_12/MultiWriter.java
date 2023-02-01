package Sprint_4.Övning_12;

/*We need a centralized place in order to keep track of users.
A "samordnare" only knows about her own user, this class is used whenever
the "samordnare" does something that concerns the other users
i.e. propagating their messages*/

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class MultiWriter {
    private List<PrintWriter> writers = new ArrayList<>();

    public void addWriter(PrintWriter writer) {
        writers.add(writer);
    }

    public List<PrintWriter> getWriters() {
        return writers;
    }

    public void removeWriter(PrintWriter writer) {
        writers.remove(writer);
    }
}