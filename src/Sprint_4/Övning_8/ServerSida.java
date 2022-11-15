package Sprint_4.Övning_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSida {
    public static void main(String[] args) {
        int port = 57585;
        try (ServerSocket server = new ServerSocket(port);
             Socket socket = server.accept();
             ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))
        ) {
            Object outputObject;
            String input;

            Protokoll protokoll = new Protokoll();
            outputObject = protokoll.processInput(null);
            outStream.writeObject(outputObject);

            while ((input = reader.readLine()) != null) { // användaren angett kombination Ctrl-D
                outputObject = protokoll.processInput(input);
                outStream.writeObject(outputObject);
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