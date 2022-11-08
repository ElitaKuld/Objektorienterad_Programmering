package Sprint_4.Övning_4a;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.time.LocalDateTime;

public class VäderRapportMottagare {
    public static void main(String[] args) throws IOException {
        int minPort = 32388;
        DatagramSocket socket = new DatagramSocket(minPort);
        byte[] data = new byte[256];
        while (true) {
            DatagramPacket packet = new DatagramPacket(data, data.length);
            socket.receive(packet);
            System.out.println("Meddelande från " + packet.getAddress().getHostAddress() + " " + LocalDateTime.now());
            String message = new String(packet.getData(), 0, packet.getLength());
            System.out.println(message + "\n");
        }
    }
}