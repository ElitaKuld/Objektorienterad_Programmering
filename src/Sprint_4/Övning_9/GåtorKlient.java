package Sprint_4.Övning_9;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class GåtorKlient {
    public static void main(String[] args) throws IOException {
        int port = 57588;
        InetAddress adress = InetAddress.getLoopbackAddress();

        try (Socket socket = new Socket(adress, port);
             PrintWriter writerToServer = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader readerFromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             BufferedReader readerFromUser = new BufferedReader(new InputStreamReader(System.in))
        ) {
            String fromUser, fromServer;

            fromServer = readerFromServer.readLine(); // Välkommen! Vill du höra en gåta?
            System.out.println("Server: " + fromServer);

            while ((fromUser = readerFromUser.readLine()) != null) { // användaren kommunicerar med servern
                if (fromUser.trim().equalsIgnoreCase("nej")) {
                    writerToServer.println(fromUser);
                    System.out.println("Hejdå!");
                    System.exit(0);
                } else {
                    writerToServer.println(fromUser.trim());
                    fromServer = readerFromServer.readLine();
                    System.out.println("Server: " + fromServer);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}