package Sprint_4.TCP_Lab_Enkel;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class TCPKlient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("127.0.0.1", 55555);
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
        ) {
            String meddelande = "Tack!";

            while (true) {
                writer.println(meddelande);
                Thread.sleep(2000);
            }
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}