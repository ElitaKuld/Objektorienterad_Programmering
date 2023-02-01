package Sprint_4.Övning_5a;

import java.util.List;

public class Telefonbok {
    Person personA = new Person("Elita", "Sara Moraeas väg 132", "0762217262", "07/04/1986");
    Person personB = new Person("Marek", "Alevaja 28", "0725986412", "08/05/1987");
    Person personC = new Person("Sonya", "Stora vägen 126", "0762895632", "09/06/1988");
    Person personD = new Person("Nikita", "Vologdanskaja 37", "0782856987", "10/07/1989");
    Person personE = new Person("Luka", "Barceolli 96", "078946215", "11/08/1990");

    List<Person> telefonLista = List.of(personA,personB, personC,personD,personE);

    public String searchForPerson(String namn){
        for (Person person : telefonLista){
            if (person.getNamn().equals(namn))
                return skrivUtInfo(person);
        }
        return "Denna person finns inte i databasen.";
    }

    public String skrivUtInfo(Person person){
        return person.getNamn() + " " + person.getAdress() + " " + person.getMobilnummer() + " " + person.getFödelsedag();
    }
}
/*Skriv ett telefonboksprogram, med client-server-arkitektur.
En klient-app skickar över ett namn till servern. Servern kollar i sin databas om namnet finns. Om ja,
då skickar servern tillbaka en sträng med personens namn, adress, mobilnummer och födelsedag. Om
personen inte finns i databasen skickar servern över ”Denna person fanns inte i databasen”.
På server-sidan: Gör en Kompis.java-klass som innehåller namn, mobilnummer, födelsedag och email.
Gör även databas-klass (eller DAO-klass, DAO står för Data Access Object).
Låt databas-klassen ha en metod getKompis(String name) som returnerar en sträng med en kompis
alla data, appendade i en String.
Gör även en server-klass som tar emot anrop från klienten och skickar tillbaka svar.
På klient-sidan: Gör en klient-app som anropar servern och skickar över ett namn (som en String). När
serverns svar kommer ska klienten skriva ut detta i consolen.*/