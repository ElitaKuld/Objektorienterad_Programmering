package Sprint_4.Övning_7;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class ClientSida {
    public static void main(String[] args) throws IOException {
        int port = 57575;
        InetAddress adress = InetAddress.getLoopbackAddress();
        try (Socket socket = new Socket(adress, port);
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
             ObjectInputStream inFromServer = new ObjectInputStream(socket.getInputStream());
             BufferedReader readerFromUser = new BufferedReader(new InputStreamReader(System.in))
        ) {
            String förfrågan;
            Object svarFromServer;

            svarFromServer = inFromServer.readObject();
            if (svarFromServer instanceof Intro) {
                System.out.println(svarFromServer);
            }
            else System.out.println("Vi kan inte tyda svaret från servern.");

            while ((förfrågan = readerFromUser.readLine()) != null) {
                writer.println(förfrågan);
                System.out.println("Vi letar i telefonboken efter: " + förfrågan);

                svarFromServer = inFromServer.readObject();
                if (svarFromServer instanceof Response)
                    System.out.println(svarFromServer);
                else if (svarFromServer instanceof String)
                    System.out.println(svarFromServer);
                else System.out.println("Vi kan inte tyda svaret på din förfrågan.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
/*Gör om uppgift 5, men istället för att skicka strängar, låt servern skicka ett serialiserat objekt av typen
Kompis till klienten. Låt klienten skriva ut Kompisens:s data
Tips: Använd klasserna ObjectOutputStream och ObjectInputStream för att skicka och ta emot de
serialiserade objekten.*/