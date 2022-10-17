package Sprint_2.Övning_9b;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InputOutputMetoderTest {

    Path inFil = Paths.get("src/Sprint_2/Personuppgifter.txt");
    Path utFil = Paths.get("src/Sprint_2/LångaPersoner.txt");
    Person p1 = new Person("Kalle Nilsson2", "Xvägen 1", "12345 Ystad", 25, 80, 175);
    Person p2 = new Person("Mimmi Mattsson", "Xvägen 2", "12345 Ystad", 25, 68, 169);
    Person p3 = new Person("Rulle Rullson", "Xvägen 3", "12345 Ystad", 56, 35, 201);
    ArrayList<Person> testPersoner = new ArrayList<>();
    List<Person> kontrollList = new ArrayList<>();


    @Test
    void läsaFilTillLista() {
        ArrayList<Person> allaPersoner = (ArrayList<Person>) InputOutputMetoder.läsaFilTillLista(inFil);
        assertEquals(8, allaPersoner.size());
        assertNotEquals(7, allaPersoner.size());
        assert (allaPersoner.get(7).getNamn().equals("Sune Samuelsson"));
        assert (allaPersoner.get(1).getÅlder() == 25);
    }

    public final int räknaRader(Path utFil) {
        int antalRader = 0;
        try (BufferedReader br = Files.newBufferedReader(utFil)) {
            while (br.readLine() != null)
                antalRader++;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return antalRader;
    }

    @Test
    void skrivaUtTillFil() {
        testPersoner.add(p1);
        testPersoner.add(p2);
        testPersoner.add(p3);
        InputOutputMetoder.skrivaUtTillFil(utFil, testPersoner);
        assertEquals(3, räknaRader(utFil));
        assert (räknaRader(utFil) != 2);
        assert (räknaRader(utFil) != 0);
    }
}