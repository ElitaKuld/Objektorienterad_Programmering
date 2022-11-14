package Sprint_4.Övning_5a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSida {
    public static void main(String[] args) {
        Telefonbok telefonbok = new Telefonbok();
        int port = 57575;
        try (ServerSocket server = new ServerSocket(port);
             Socket socket = server.accept();
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))
        ) {
            writer.println("Hej och välkommen! Skriv in ett namn.");
            String input;

            while ((input = reader.readLine()) != null) {
                System.out.println("Nu söker vi på följande namn: " + input);
                String answer = telefonbok.searchForPerson(input.trim());
                writer.println(answer);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}