package Sprint_1.Övning_3d;

import java.util.LinkedList;
import java.util.List;

public class HuvudprogramSkola2 {
    public static void main(String[] args) {
        HuvudprogramSkola2 h = new HuvudprogramSkola2();
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

        h.skrivUtAllaStudenter(studentA, deltagande);
        System.out.println();
        h.skrivUtKurslista(kursB, deltagande);
        System.out.println();
        h.jätteUtskrift(allaStudenter, deltagande);
    }

    public void skrivUtAllaStudenter(Student student, List<Deltagande> deltagande) {
        System.out.println("Studenten med namnet " + student.getNamn() + " läser följande kurser: ");
        for (int i = 0; i < deltagande.size(); i++) {
            if (student.getNamn().equals(deltagande.get(i).getStudent().getNamn()))
                System.out.println(deltagande.get(i).getKurs().getNamn());
        }
    }

    public void skrivUtKurslista(Kurs kurs, List<Deltagande> deltagande) {
        System.out.println("Namnet på kursen: " + kurs.getNamn() + "\nDenna kurs undervisar: " + kurs.getLärare().getNamn() +
                "\nFöljande elever läser denna kurs: ");
        for (int i = 0; i < deltagande.size(); i++) {
            if (kurs.getNamn().equals(deltagande.get(i).getKurs().getNamn()))
                System.out.println(deltagande.get(i).getStudent().getNamn());
        }
    }

    public void jätteUtskrift(List<Student> studenter, List<Deltagande> deltagande) {
        for (int i = 0; i < studenter.size(); i++) {
            System.out.println("Studenten med namnet " + studenter.get(i).getNamn() + " läser följande kurser: ");
            for (int j = 0; j < deltagande.size(); j++) {
                if (studenter.get(i) == (deltagande.get(j).getStudent()))
                    System.out.println(deltagande.get(j).getKurs().getNamn());
            }
            System.out.println();
        }
    }
}

/*Nu ska vi bygga om koden från 3b på ett bättre sätt, där man slipper den trista dubbellagringen av
data!
• Ta bort listan av Kurs hos Student och listan av Student hos Kurs
• Skapa istället klassen Deltagande. Ett objekt av typen Deltagande ska innehålla en Student
och en Kurs, och markerar därmed att en student går en kurs. Notera hur vi flyttar ut
dubbellagringen till en egen klass, och vips så lagras det bara på ett ställe. WIN!!!
• Skapa upp objekt av Kurser och Studenter. Skapa sen objekt av Deltagande där du kopplar
ihop vilka studenter som går vilka kurser. Lägg alla Deltaganden i en lista så att man lätt kan
iterera över alla Deltaganden.
• Skapa en printningsfunktion som tar en Student och sedan skriver ut alla kurser som
studenten deltar i.
• Skapa en printningsfunktion som tar en Kurs och sedan skriver ut kursens lärare och en lista
av alla Studenter som går kursen.

• Skapa en ”jätteutskriftsfunktion” som skriver ut samtliga studenter och efter varje student
listas alla kurser som studenten går på.*/