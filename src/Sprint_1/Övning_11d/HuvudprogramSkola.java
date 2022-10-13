package Sprint_1.Övning_11d;

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
        System.out.println(kurs.skrivUtStudenter(kurs.getAllaStudenter()));
    }

    public void skrivUtAllaStudenter(Student student) {
        System.out.println("Studenten med namnet " + student.getNamn() + " läser följande kurser: ");
        System.out.println(student.skrivUtKurser(student.getAllaKurser()));
    }
}

/*I uppgift 3 a skapade vi upp massa Personer, Kurser, Studenter, Lärare m.fl och skrev ut dessa.
Titta på utskrifts-funktionen i Sigrun's facit. Varför är denna problematisk att testa automatiskt?
Hur skulle man, på ett enkelt sätt, kunna skriva om den för att göra den mer testbar?
Uppdatera er egen uppgift 3 så att funktionaliteten blir testbar (om den inte redan är det). Skriv test för
detta*/