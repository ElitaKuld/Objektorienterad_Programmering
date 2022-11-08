package Sprint_4.Övning_4a;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class VäderRapportSensor {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vilken stad befinner du dig i?");
        String stadsNamn = scan.nextLine();
        System.out.println("Vilken temperatur är det just nu?");
        String temperatur = scan.nextLine();

        InetAddress toAdress = InetAddress.getLocalHost();
        int toPort = 32388;
        DatagramSocket socket = new DatagramSocket();

        String dataToSend = "Stad: " + stadsNamn + ", temperatur: " + temperatur;

        byte[] data = dataToSend.getBytes();
        DatagramPacket packet = new DatagramPacket(data, data.length, toAdress, toPort);
        socket.send(packet);
    }
}
/*Skriv ett system för att hantera väderrapportering från olika städer via UDP. Du behöver två olika
program, ett sensorprogram som skickar data och ett mottagarprogram som tar emot väderdata.
Låt sensorprogrammet först fråga användaren efter vilken stad hen befinner sig i. Läs sedan in de
temperaturer användaren skriver från kommandoraden och skicka stadens namn och temperaturen till
mottagaren.
Låt mottagaren lyssna efter datagram och ta emot skickat data och skriva ut i consolen.
Du ska kunna ha flera sensorprogram igång samtidigt för att kunna simulera inskick från flera städer.
Mottagarprogrammet ska kunna lyssna på flera sensorprogram samtidigt.
*/