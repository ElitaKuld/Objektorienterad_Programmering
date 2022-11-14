package Sprint_4.Övning_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) {
        int port = 58585;
        try (ServerSocket server = new ServerSocket(port);
             Socket socket = server.accept();
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream())); // lyssnare
        ) {
            String input;
            while ((input = reader.readLine()) != null) {
                System.out.println("Meddelande från klienten: " + input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*Gör ett litet TCP-program som består av en server och en klient.
Låt servern skicka ett litet meddelande till klienten med några sekunders mellanrum.
*/