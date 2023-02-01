package Sprint_4.Övning_12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Samordnare extends Thread {
    private Socket socket;
    private MultiWriter multiWriter;

    public Samordnare(Socket socket, MultiWriter multiWriter) {
        this.socket = socket;
        this.multiWriter = multiWriter;
    }

    public synchronized void run() {

        try (PrintWriter out = new PrintWriter(socket.getOutputStream(), true);  //true for auto-flush
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));) {

            //Vi lägger in vår printWriter i multiWriters lista
            multiWriter.addWriter(out);

            while (true) {
                String input = in.readLine();
                if (input == null) {
                    // multiWriter.removeWriter(out);
                    //socket.close();
                    return;
                }
                for (PrintWriter writer : multiWriter.getWriters()) {
                    writer.println(input);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
