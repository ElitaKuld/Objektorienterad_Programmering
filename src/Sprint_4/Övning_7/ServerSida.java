package Sprint_4.Övning_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSida {
    public static void main(String[] args) {
        Intro intro = new Intro();
        Telefonbok telefonbok = new Telefonbok();
        int port = 57575;
        try (ServerSocket server = new ServerSocket(port);
             Socket socket = server.accept();
             ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))
        ) {
            outStream.writeObject(intro);
            String input;

            while ((input = reader.readLine()) != null) {
                System.out.println("Nu söker vi på följande namn: " + input);
                Kompis answer = telefonbok.getKompis(input.trim());
                if (answer != null) {
                    Response response = new Response(answer, true);
                    outStream.writeObject(response);
                } else outStream.writeObject("Denna person finns inte i databasen.");
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
/*Låt oss skapa en ytterligare version av vår telefonbok där vi skickar olika objekt beroende om vi bara
vill meddela att kontakten är upprättad eller som vi svarar på ett request att få data för en person
Vi behöver
• En Intro-klass som vi skickar som bekräftelse på att connection är upprättad
• En Response-klass som innehåller en bool för om en Person hittades i databasen eller inte
o Om en person hittades, lägg med Person-objektet i responset
Använd instanceof för att särskilja på Intro och Response på klientsidan.*/