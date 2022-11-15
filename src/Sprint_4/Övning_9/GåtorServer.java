package Sprint_4.Övning_9;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class GåtorServer {
    public static void main(String[] args) {
        int port = 57588;
        try (ServerSocket server = new ServerSocket(port);
             Socket socket = server.accept();
             PrintWriter writerToClient = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader readerFromClient = new BufferedReader(new InputStreamReader(socket.getInputStream()))
        ) {
            String fromClient, toClient;

            GåtorProtokoll protokoll = new GåtorProtokoll();
            toClient = protokoll.processInput(null);
            writerToClient.println(toClient);


            while ((fromClient = readerFromClient.readLine()) != null) { // kommunicerar med klienten
                if (fromClient.equalsIgnoreCase("nej")) {
                    System.out.println("Klienten avbröt programmet.");
                    System.exit(0);
                }
                toClient = protokoll.processInput(fromClient);
                writerToClient.println(toClient);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
