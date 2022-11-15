package Sprint_4.Övning_6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSida {
    public static void main(String[] args) {
        Telefonbok telefonbok = new Telefonbok();
        int port = 57575;
        try (ServerSocket server = new ServerSocket(port);
             Socket socket = server.accept();
             ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))
        ) {
            outStream.writeObject("Hej och välkommen! Skriv in ett namn.");
            String input;

            while ((input = reader.readLine()) != null) {
                System.out.println("Nu söker vi på följande namn: " + input);
                Kompis answer = telefonbok.getKompis(input.trim());
                if (answer != null) {
                    outStream.writeObject(answer);
                } else outStream.writeObject("Denna person finns inte i databasen.");
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
/*Gör om uppgift 5, men istället för att skicka strängar, låt servern skicka ett serialiserat objekt av typen
Kompis till klienten. Låt klienten skriva ut Kompisens:s data
Tips: Använd klasserna ObjectOutputStream och ObjectInputStream för att skicka och ta emot de
serialiserade objekten.*/