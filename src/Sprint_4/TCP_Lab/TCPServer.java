package Sprint_4.TCP_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) {
        int port = 53535;
        try (ServerSocket server = new ServerSocket(port);
             Socket socket = server.accept();
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream())); // lyssnare
             PrintWriter writer = new PrintWriter(
                     socket.getOutputStream(), true); // skrivare
        ) {
            String input;
            System.out.println("About to wait for client messages");
            while ((input = reader.readLine()) != null) {
                System.out.println(input);
                System.out.println("Received from client: " + input);
                writer.println("Message received " + input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}