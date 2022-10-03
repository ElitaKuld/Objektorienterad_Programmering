package Sprint_1.Övning_3a;

public class HuvudprogramSkola {
    public static void main(String[] args) {
        HuvudprogramSkola hs = new HuvudprogramSkola();
        Student studentA = new Student("Elita Kuld", "12345678", "Nackademin");
        Student studentB = new Student("Maria Södergren", "86549235", "Nackademin");
        Student studentC = new Student("Viktor Rosenguld", "56978421", "Nackademin");

        Lärare lärare = new Lärare("David Viktorson", "25896432", "Nackademin");

        Kurs kursA = new Kurs("Objektorienterad programmering");
        Kurs kursB = new Kurs("Frontend & Backend");
        Kurs kursC = new Kurs("Javautveckling");

        lärare.läggTillKurs(kursA);
        lärare.läggTillKurs(kursB);
        lärare.läggTillKurs(kursC);

        kursA.läggTillStudent(studentA);
        kursA.läggTillStudent(studentB);
        kursB.läggTillStudent(studentB);
        kursB.läggTillStudent(studentC);
        kursC.läggTillStudent(studentA);
        kursC.läggTillStudent(studentC);

        kursA.setLärare(lärare);
        kursB.setLärare(lärare);
        kursC.setLärare(lärare);

        studentA.läggTillKurs(kursA);
        studentA.läggTillKurs(kursB);
        studentB.läggTillKurs(kursB);
        studentB.läggTillKurs(kursC);
        studentC.läggTillKurs(kursA);
        studentC.läggTillKurs(kursC);

        System.out.println();
        hs.skrivUtKurslista(kursA);
        System.out.println();
        hs.skrivUtKurslista(kursB);
        System.out.println();
        hs.skrivUtKurslista(kursC);
        System.out.println();

        hs.skrivUtAllaStudenter(studentA);
        System.out.println();
        hs.skrivUtAllaStudenter(studentB);
        System.out.println();
        hs.skrivUtAllaStudenter(studentC);
    }

    public void skrivUtKurslista(Kurs kurs) {
        System.out.println("Namnet på kursen: " + kurs.getNamn() + "\nDenna kurs undervisar: " + kurs.getLärare().getNamn() +
                "\nFöljande elever läser denna kurs: ");
        kurs.skrivUtStudenter(kurs.getAllaStudenter());
    }

    public void skrivUtAllaStudenter(Student student) {
        System.out.println("Studenten med namnet " + student.getNamn() + " läser följande kurser: ");
        student.skrivUtKurser(student.getAllaKurser());
    }
}

/*Implementera klassdiagrammet på bilden nedan, dvs skapa klasser som motsvarar varje ruta. Använd
        dig av arrayer där detta behövs.
        Tänk på att:
        • en Student ska kunna gå flera kurser.
        • en lärare ska kunna ge flera kurser.
        • en kurs har flera studenter.
        • en kurs har en lärare.
        För att din design ska få komma till användning, skapa följande:
        • Gör ett huvudprogram där du skapar upp några studenter, en lärare och en kurs.
        • Gör en funktion som skriver ut en klasslista för din kurs med kursnamnet, läraren och
        studenterna.

        • I mån av tid: Gör en större utskriftsfunktion där du skriver ut alla studenter och vilka kurser
        de går. (Skriv först ut namnet på en student och direkt efter kurserna. Fortsätt med nästa
        student osv.)*/