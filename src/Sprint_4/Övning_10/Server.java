package Sprint_4.Övning_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Server extends Thread {
    Protokoll protokoll = new Protokoll();
    Socket socket;

    public Server(Socket socket) {
        this.socket = socket;
    }

    public void run() {

        try (
                ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))
        ) {
            Object outputObject;
            String input;

            outputObject = protokoll.processInput(null);
            outStream.writeObject(outputObject);

            while ((input = reader.readLine()) != null) { // användaren angett kombination Ctrl-D
                outputObject = protokoll.processInput(input);
                outStream.writeObject(outputObject);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Exception caught when trying to listen on the port or listening for a connection");
            System.out.println(e.getMessage()); // samma sak som e.printStackTrace(); ????
        }
    }
}