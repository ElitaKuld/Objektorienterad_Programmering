package Sprint_1.Övning_4;

import java.util.LinkedList;
import java.util.List;

public class HuvudprogramSkola3 {
    public static void main(String[] args) {
        HuvudprogramSkola3 h = new HuvudprogramSkola3();

        Student studentA = new Student("Elita Kuld", "12345678", "Nackademin");
        Student studentB = new Student("Maria Södergren", "86549235", "Nackademin");
        Student studentC = new Student("Viktor Rosenguld", "56978421", "Nackademin");

        Lärare lärare = new Lärare("David Viktorsson", "25896432", "Nackademin");

        Kurs kursA = new Kurs("Objektorienterad programmering");
        Kurs kursB = new Kurs("Frontend & Backend");
        Kurs kursC = new Kurs("Javautveckling");

        lärare.läggTillKurs(kursA);
        lärare.läggTillKurs(kursB);
        lärare.läggTillKurs(kursC);

        kursA.setLärare(lärare);
        kursB.setLärare(lärare);
        kursC.setLärare(lärare);

        Deltagande deltagandeA1 = new Deltagande(studentA, kursA);
        Deltagande deltagandeA2 = new Deltagande(studentA, kursB);
        Deltagande deltagandeB1 = new Deltagande(studentB, kursB);
        Deltagande deltagandeB2 = new Deltagande(studentB, kursC);
        Deltagande deltagandeC1 = new Deltagande(studentC, kursA);
        Deltagande deltagandeC2 = new Deltagande(studentC, kursC);

        List<Student> allaStudenter = new LinkedList<>();
        allaStudenter.add(studentA);
        allaStudenter.add(studentB);
        allaStudenter.add(studentC);

        List<Deltagande> deltagande = new LinkedList<>();
        deltagande.add(deltagandeA1);
        deltagande.add(deltagandeA2);
        deltagande.add(deltagandeB1);
        deltagande.add(deltagandeB2);
        deltagande.add(deltagandeC1);
        deltagande.add(deltagandeC2);

        Kurstillfälle kursIdag = new Kurstillfälle();
        kursIdag.setDatum();
        kursIdag.setKurs(kursA);
        kursIdag.setLärarePåKursen(kursIdag.getKurs().getLärare());
        kursIdag.setStudent(kursIdag.läggTillStudent(kursIdag.getKurs(), deltagande));

        h.skrivUtKlasslista(kursIdag);
    }

    public void skrivUtKlasslista(Kurstillfälle kurstillfälle) {
        System.out.println("Dagens datum är: " + kurstillfälle.getDatum() +
                "\nDagens kurs är: " + kurstillfälle.getKurs().getNamn() +
                "\nI denna kurs undervisar: " + kurstillfälle.getKurs().getLärare().getNamn() +
                "\nFöljande studenter ska vara med på kursen idag: ");
        for (int i = 0; i < kurstillfälle.getStudent().size(); i++)
            System.out.println(kurstillfälle.getStudent().get(i).getNamn());
    }
}
/*Antag att vi på Nackademin har ett system som i uppgift 3. Vi vet vilka lärare som undervisar på en
kurs och vilka elever som är registrerade på kursen.
Men nu behöver vi lägga till stöd för att registrera närvaro varje gång ett kurstillfälle äger rum.
Kopiera koden till uppgift 4 och modifiera den till att även innehålla kurstillfälle.
Börja med att fundera över hur kurstillfällen skulle kunna uttryckas i kod och var de behöver stoppas
in i den befintliga designen. Rita sedan ett klassdiagram med den nya designen.
Ett tips är att använda sig av Javas klass LocalDate, för att hantera datum.


Uppgift 4b - Refactoring, Separation of Concerns
Implementera designen från 4 a.

Uppgift 4c - Huvudprogram
Lägg till kod där du skapar upp ett kurstillfälle, några studenter, en lärare och en kurs. Lägg till en
funktion som skriver ut en klasslista för ditt kurstillfälle med kursnamnet och lärarens namn först, följt
av alla studenters, som ska vara med på kurstillfället, namn.*/
