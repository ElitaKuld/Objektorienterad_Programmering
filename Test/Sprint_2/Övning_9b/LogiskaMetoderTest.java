package Sprint_2.Övning_9b;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;


class LogiskaMetoderTest {

    Person p1 = new Person("Kalle Nilsson2", "Xvägen 1", "12345 Ystad", 25, 80, 175);
    Person p2 = new Person("Mimmi Mattsson", "Xvägen 2", "12345 Ystad", 25, 68, 169);
    Person p3 = new Person("Rulle Rullson", "Xvägen 3", "12345 Ystad", 56, 35, 201);
    ArrayList<Person> allaPersoner = new ArrayList<>();
    ArrayList<Person> långaPersoner = new ArrayList<>();

    @Test
    void hittaLångaPersoner() {
        allaPersoner.add(p1);
        allaPersoner.add(p2);
        allaPersoner.add(p3);
        långaPersoner = LogiskaMetoder.hittaLångaPersoner(allaPersoner);
        assert (långaPersoner.size() == 1);
        assert (långaPersoner.get(0).getLängd() == 201);
        assert (långaPersoner.size() != 3);
        assert (långaPersoner.get(0).getÅlder() != 25);
    }
}